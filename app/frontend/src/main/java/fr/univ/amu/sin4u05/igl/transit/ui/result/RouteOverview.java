package fr.univ.amu.sin4u05.igl.transit.ui.result;

import fr.univ.amu.sin4u05.igl.routes.Route;
import fr.univ.amu.sin4u05.igl.routes.RouteStep;
import fr.univ.amu.sin4u05.igl.routes.TransportStep;
import fr.univ.amu.sin4u05.igl.routes.TransportLine;
import fr.univ.amu.sin4u05.igl.transit.ui.util.FXUtil;
import javafx.beans.property.SimpleMapProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import org.kordamp.ikonli.fontawesome5.FontAwesomeSolid;
import org.kordamp.ikonli.javafx.FontIcon;

import java.util.List;

import static griffon.javafx.beans.binding.MappingBindings.mapAsString;

public class RouteOverview extends VBox {

    private final SimpleObjectProperty<Route> route = new SimpleObjectProperty<>();
    private final SimpleMapProperty<TransportLine, Color> colorMap = new SimpleMapProperty<>();

    @FXML
    private HBox stepList;

    @FXML
    private Label duration;

    @FXML
    private Label times;

    public RouteOverview() {
        FXUtil.loadFXML("/fr/univ/amu/sin4u05/igl/transit/ui/result/RouteOverview.fxml", this, this);
    }

    public Route getRoute() {
        return route.get();
    }

    public SimpleObjectProperty<Route> routeProperty() {
        return route;
    }

    public ObservableMap<TransportLine, Color> getColorMap() {
        return colorMap.get();
    }

    public SimpleMapProperty<TransportLine, Color> colorMapProperty() {
        return colorMap;
    }

    @FXML
    private void initialize() {

        route.addListener((observable, oldValue, newValue) -> {
            ObservableList<Node> stepElements = stepList.getChildren();

            stepElements.clear();
            if (newValue == null) return;

            List<RouteStep> steps = newValue.compressRoute().getSteps();
            for (int i = 0; i < steps.size(); i++) {
                RouteStep step = steps.get(i);
                if (step.getDuration().isZero()) continue;

                if (i != 0) {
                    FontIcon angleIcon = FontIcon.of(FontAwesomeSolid.ANGLE_RIGHT, 11);
                    angleIcon.setIconColor(Paint.valueOf("grey"));
                    HBox angle = new HBox(new Label(null, angleIcon));
                    stepElements.add(angle);
                }

                switch (step.getType()) {
                    case Transport:
                        TransportLine line = ((TransportStep) step).getLine();
                        stepElements.add(new LineView(line, colorMap.get(line)));
                        break;
                    case Connection:
                        stepElements.add(new WalkView(step.getDuration()));
                        break;
                }
            }
        });

        duration.textProperty().bind(mapAsString(route, (route) ->
                route == null ? "" : route.getDuration().toMinutes() + " min"
        ));

        times.textProperty().bind(mapAsString(route, (route) ->
                route == null ? "" :
                        route.getDepartureTime().toLocalTime().toString() +
                                " – " + route.getArrivalTime().toLocalTime().toString()
        ));
    }
}
