package fr.univ.amu.sin4u05.igl.transit.ui;

import com.lynden.gmapsfx.GoogleMapView;
import com.lynden.gmapsfx.MapComponentInitializedListener;
import com.lynden.gmapsfx.javascript.object.GoogleMap;
import com.lynden.gmapsfx.javascript.object.LatLong;
import com.lynden.gmapsfx.javascript.object.MapOptions;
import com.lynden.gmapsfx.javascript.object.MapTypeIdEnum;
import fr.univ.amu.sin4u05.igl.routes.Route;
import fr.univ.amu.sin4u05.igl.routes.RouteStep;
import fr.univ.amu.sin4u05.igl.routes.RouteStepType;
import fr.univ.amu.sin4u05.igl.routes.TransportStep;
import fr.univ.amu.sin4u05.igl.routes.TransportLine;
import fr.univ.amu.sin4u05.igl.routes.TransportNetwork;
import fr.univ.amu.sin4u05.igl.transit.search.*;
import fr.univ.amu.sin4u05.igl.transit.ui.result.RouteDetails;
import fr.univ.amu.sin4u05.igl.transit.ui.result.RouteMapDrawer;
import fr.univ.amu.sin4u05.igl.transit.ui.result.RouteOverview;
import fr.univ.amu.sin4u05.igl.transit.ui.util.FXUtil;
import fr.univ.amu.sin4u05.igl.util.Coordinates;
import javafx.application.Platform;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleMapProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import java.time.LocalDateTime;
import java.util.*;

public class MainPane extends VBox implements MapComponentInitializedListener {

    private static final String API_KEY = "";

    public static final int MAX_ROUTES = 10;

    private SimpleObjectProperty<TransportNetwork> dataSetProperty = new SimpleObjectProperty<>();
    private SimpleObjectProperty<TransitSearch> searchProperty = new SimpleObjectProperty<>();
    private SimpleListProperty<Route> routes = new SimpleListProperty<>();
    private SimpleMapProperty<TransportLine, Color> colorMap = new SimpleMapProperty<>();

    @FXML
    private MainPane root;

    @FXML
    private SearchPane searchPane;

    @FXML
    private ProgressBar progressBar;

    @FXML
    private SplitPane splitPane;

    @FXML
    private ListView<Route> routesOverview;

    @FXML
    private RouteDetails routeDetails;

    @FXML
    private AnchorPane mapContainer;

    private GoogleMapView mapView;

    private ReadOnlyObjectProperty<Route> selectedRoute;

    MainPane() {
        FXUtil.loadFXML("/fr/univ/amu/sin4u05/igl/transit/ui/MainPane.fxml", this, this);
    }

    public void setDataSet(TransportNetwork dataSetProperty) {
        this.dataSetProperty.set(dataSetProperty);
    }

    public void setSearch(TransitSearch searchProperty) {
        this.searchProperty.set(searchProperty);
    }

    @FXML
    private void initialize() {
        searchPane.setDataSet(dataSetProperty);
        searchPane.addEventHandler(SearchEvent.SEARCH, this::doSearch);

        routesOverview.itemsProperty().bind(routes);
        routesOverview.setCellFactory(lv -> new ListCell<>() {
            @Override
            protected void updateItem(Route item, boolean empty) {
                super.updateItem(item, empty);

                if (empty || item == null) {
                    setText(null);
                    setGraphic(null);
                } else {
                    RouteOverview overview = new RouteOverview();
                    overview.colorMapProperty().set(colorMap.get());
                    overview.routeProperty().set(item);
                    setGraphic(overview);
                }
            }
        });

        splitPane.getDividers().addListener((ListChangeListener<? super SplitPane.Divider>) c -> {
            routesOverview.setMaxWidth(splitPane.getWidth() * c.getList().get(0).getPosition());
            routeDetails.setMaxWidth(splitPane.getWidth() * c.getList().get(1).getPosition());
        });

        selectedRoute = routesOverview.getSelectionModel().selectedItemProperty();

        routeDetails.routeProperty().bind(selectedRoute);
        routeDetails.colorMapProperty().bind(colorMap);

        splitPane.setDividerPositions(0.3, 0.6);

        // Wait for the data set loading, otherwise GMapsFX won't load
        dataSetProperty.addListener((observable, oldValue, newValue) -> {
            mapView = new GoogleMapView("fr", API_KEY);
            mapContainer.getChildren().add(mapView);
            AnchorPane.setTopAnchor(mapView, 0.0);
            AnchorPane.setRightAnchor(mapView, 0.0);
            AnchorPane.setBottomAnchor(mapView, 0.0);
            AnchorPane.setLeftAnchor(mapView, 0.0);

            mapView.addMapInializedListener(this);
        });
    }

    private void doSearch(SearchEvent event) {

        if (event.from == null || event.to == null) {
            routes.set(FXCollections.emptyObservableList());
            return;
        }

        Task<Void> task = new Task<>() {
            @Override
            public Void call() {
                TransitSearch search = searchProperty.get();

                List<Route> routes = search.search(
                        event.startTime,
                        event.from,
                        event.to,
                        MAX_ROUTES,
                        progressBar::setProgress
                );

                Map<TransportLine, Color> colorMap = assignColors(routes);

                Platform.runLater(() -> {
                    MainPane.this.colorMap.set(FXCollections.observableMap(colorMap));
                    MainPane.this.routes.set(FXCollections.observableList(routes));
                    routesOverview.getSelectionModel().selectFirst();
                    progressBar.setProgress(0);
                });
                return null;
            }
        };

        new Thread(task).start();
    }

    private Map<TransportLine, Color> assignColors(List<Route> routes) {
        LinkedList<Color> colors = new LinkedList<>(ALL_COLORS);
        Map<TransportLine, Color> colorMap = new HashMap<>();
        for (Route route : routes) {
            for (RouteStep step : route.getSteps()) {
                if (step.getType() == RouteStepType.Transport) {
                    TransportLine line = ((TransportStep) step).getLine();
                    colorMap.computeIfAbsent(line, (l) -> colors.removeFirst());
                }
            }
        }
        return colorMap;
    }

    @Override
    public void mapInitialized() {
        LatLong center = new LatLong(43.2803047, 5.2400697);

        //Set the initial properties of the map.
        MapOptions mapOptions = new MapOptions();

        mapOptions.center(center)
                .mapType(MapTypeIdEnum.ROADMAP)
                .mapTypeControl(false)
                .overviewMapControl(false)
                .panControl(false)
                .rotateControl(false)
                .scaleControl(false)
                .streetViewControl(false)
                .zoomControl(false)
                .zoom(11);

        GoogleMap map = mapView.createMap(mapOptions);

        new RouteMapDrawer(map, selectedRoute, colorMap);
    }

    private static LatLong toLatLong(Coordinates coordinates) {
        return new LatLong(coordinates.latitude, coordinates.longitude);
    }

    private final static List<Color> ALL_COLORS = Arrays.asList(
            Color.DARKBLUE,
            Color.DARKCYAN,
            Color.DARKGOLDENROD,
            Color.DARKGREEN,
            Color.DARKKHAKI,
            Color.DARKMAGENTA,
            Color.DARKOLIVEGREEN,
            Color.DARKORANGE,
            Color.DARKORCHID,
            Color.DARKRED,
            Color.DARKSALMON,
            Color.DARKSEAGREEN,
            Color.DARKSLATEBLUE,
            Color.DARKSLATEGRAY,
            Color.DARKSLATEGREY,
            Color.DARKTURQUOISE,
            Color.DARKVIOLET,
            Color.DEEPPINK,
            Color.DEEPSKYBLUE
    );
}
