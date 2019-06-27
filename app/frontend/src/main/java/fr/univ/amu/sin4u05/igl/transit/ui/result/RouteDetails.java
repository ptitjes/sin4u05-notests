package fr.univ.amu.sin4u05.igl.transit.ui.result;

import fr.univ.amu.sin4u05.igl.routes.*;
import fr.univ.amu.sin4u05.igl.transit.ui.UIConstants;
import fr.univ.amu.sin4u05.igl.transit.ui.util.FXUtil;
import fr.univ.amu.sin4u05.igl.transit.ui.util.StopIterator;
import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleMapProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableDoubleValue;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;
import javafx.fxml.FXML;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeLineCap;
import org.kordamp.ikonli.fontawesome5.FontAwesomeSolid;
import org.kordamp.ikonli.javafx.FontIcon;
import org.kordamp.ikonli.material.Material;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static griffon.javafx.beans.binding.MappingBindings.mapObject;

public class RouteDetails extends ScrollPane {

    private static final int PADDING = 10;
    private static final int TIME_WIDTH = 45;
    private static final int NODE_WIDTH = 20;

    private static final Paint WALK_COLOR = Color.DARKGRAY;

    private final SimpleObjectProperty<Route> route = new SimpleObjectProperty<>();
    private final SimpleMapProperty<TransportLine, Color> colorMap = new SimpleMapProperty<>();

    @FXML
    private StackPane stackPane;

    @FXML
    private VBox stepList;

    @FXML
    private Pane linesPane;

    @FXML
    private Group linesCanvas;

    public RouteDetails() {
        FXUtil.loadFXML("/fr/univ/amu/sin4u05/igl/transit/ui/result/RouteDetails.fxml", this, this);
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
        setFitToWidth(true);

        stackPane.prefWidthProperty().bind(Bindings.add(-PADDING * 2, this.widthProperty()));
        stackPane.prefHeightProperty().bind(Bindings.add(-PADDING * 2, this.heightProperty()));

        linesPane.prefWidthProperty().bind(stackPane.widthProperty());
        linesPane.prefHeightProperty().bind(stackPane.heightProperty());

        route.addListener((observable, oldValue, newValue) -> handleNewRoute(newValue));
    }

    private void handleNewRoute(Route route) {
        ObservableList<Node> views = stepList.getChildren();
        ObservableList<Node> lines = linesCanvas.getChildren();

        views.clear();
        lines.clear();

        if (route == null) return;

        RouteStopView lastView = null;
        StopIterator stops = new StopIterator(route.compressRoute().getSteps());
        while (stops.next()) {
            StationStop current = stops.current();

            TransportLine transportLine = stops.transportLine();
            Paint color = transportLine == null ? WALK_COLOR : colorMap.get(transportLine);

            RouteStopView view;
            if (stops.isFirst() || stops.hasOutgoingTransport()) {
                view = new RouteStopView(current, stops.departureTime(), true, color);
            } else {
                view = new RouteStopView(current, stops.arrivalTime(), true, color);
            }
            views.add(view);

            if (!stops.isLast()) {
                RouteStep step = stops.outgoingStep();
                if (stops.hasOutgoingTransport()) {
                    TransportStep transportStep = stops.outgoingTransport();
                    views.add(new TransportView(transportStep, color));
                } else {
                    views.add(new ConnectionView(step.getDuration()));
                }
            }

            if (lastView != null) {
                Line line = new Line();
                line.startXProperty().bind(lastView.anchorX());
                line.startYProperty().bind(lastView.anchorY());
                line.endXProperty().bind(view.anchorX());
                line.endYProperty().bind(view.anchorY());

                boolean hasIngoingConnection = stops.hasIngoingConnection();

                line.setStroke(hasIngoingConnection ? WALK_COLOR : color);
                line.setStrokeWidth(4);
                line.setStrokeLineCap(StrokeLineCap.ROUND);

                if (hasIngoingConnection) {
                    line.getStrokeDashArray().addAll(0d, 8d);
                    line.setStrokeDashOffset(-1.5d);
                }

                lines.add(line);
            }

            lastView = view;
        }
    }

    private static abstract class AbstractView extends GridPane {
        void addColumn(int width, Priority hgrow, HPos halignment, boolean fillWidth) {
            if (width == -1) {
                getColumnConstraints().add(
                        new ColumnConstraints(width, width, Double.MAX_VALUE, hgrow, halignment, fillWidth));
            } else {
                getColumnConstraints().add(
                        new ColumnConstraints(USE_PREF_SIZE, width, USE_PREF_SIZE, hgrow, halignment, fillWidth));
            }
        }
    }

    private static class RouteStopView extends AbstractView {

        private final Group node;
        private final Circle nodeDisc;

        RouteStopView(StationStop stop, LocalDateTime dateTime, boolean mark, Paint color) {

            addColumn(TIME_WIDTH, Priority.NEVER, HPos.RIGHT, false);
            addColumn(NODE_WIDTH, Priority.NEVER, HPos.CENTER, false);
            addColumn(-1, Priority.ALWAYS, HPos.LEFT, true);

            Label dateTimeLabel = new Label(dateTime.format(DateTimeFormatter.ofPattern("HH:mm")));
            dateTimeLabel.setMinWidth(TIME_WIDTH);
            dateTimeLabel.getStyleClass().add("route-stop-time");
            dateTimeLabel.setStyle(mark ? "-fx-font-weight: bold;" : "-fx-font-size: 10px");
            dateTimeLabel.setAlignment(Pos.BASELINE_RIGHT);
            add(dateTimeLabel, 0, 0);

            node = new Group();
            add(node, 1, 0);

            nodeDisc = new Circle(mark ? 5d : 3d, color);
            node.getChildren().add(nodeDisc);

            if (mark) {
                Circle nodeInset = new Circle(2, Color.WHITE);
                nodeInset.centerXProperty().bind(nodeDisc.centerXProperty());
                nodeInset.centerYProperty().bind(nodeDisc.centerYProperty());
                node.getChildren().add(nodeInset);
            }

            Label stationLabel = new Label(stop.getName());
            stationLabel.setStyle(mark ? "-fx-font-weight: bold;" : "-fx-font-size: 10px");
            add(stationLabel, 2, 0);
        }

        public ObservableDoubleValue anchorX() {
            return layoutXProperty().add(node.layoutXProperty()).add(nodeDisc.centerXProperty());
        }

        public ObservableDoubleValue anchorY() {
            return layoutYProperty().add(node.layoutYProperty()).add(nodeDisc.centerYProperty());
        }
    }

    private static class TransportView extends AbstractView {

        private VBox detailBox;
        private SimpleBooleanProperty visible = new SimpleBooleanProperty(false);

        public TransportView(TransportStep step, Paint color) {

            addColumn(TIME_WIDTH + NODE_WIDTH, Priority.NEVER, HPos.LEFT, false);
            addColumn(-1, Priority.ALWAYS, HPos.LEFT, true);

            HBox box = new HBox();
            box.setSpacing(5);
            box.setAlignment(Pos.CENTER_LEFT);

            Label icon = new Label();
            icon.setMinWidth(20);
            icon.setGraphic(FontIcon.of(UIConstants.LINE_TYPE_ICONS.get(step.getLine().getType()), 18));

            Label line = new Label(step.getLine().getShortName());
            line.setMinWidth(USE_PREF_SIZE);
            line.setBackground(new Background(new BackgroundFill(
                    color,
                    new CornerRadii(3, 3, 3, 3, false),
                    Insets.EMPTY
            )));
            line.setTextFill(Color.WHITE);
            line.setPadding(new Insets(2, 3, 2, 4));
            line.setStyle("-fx-font-weight: bold;");

            Label label = new Label(step.getHeadSign());

            box.getChildren().addAll(icon, line, label);
            add(box, 1, 0);

            List<RouteStep> stepDetails = step.getStepDetails();

            if (stepDetails.size() > 1) {
                box = new HBox();
                box.setSpacing(10);
                box.setPadding(new Insets(5, 5, 5, 5));
                box.setAlignment(Pos.CENTER_LEFT);

                Label detailIcon = new Label();
                detailIcon.setMinWidth(20);
                detailIcon.graphicProperty().bind(mapObject(visible, v ->
                        FontIcon.of(v ? FontAwesomeSolid.ANGLE_DOUBLE_UP : FontAwesomeSolid.ANGLE_DOUBLE_DOWN, 14)));

                Label stationCountLabel = new Label("Duration: " +
                        stepDetails.size() + " stations (" +
                        step.getDuration().toMinutes() + " min)");

                box.getChildren().addAll(detailIcon, stationCountLabel);
                add(box, 1, 1);

                detailBox = new VBox();
                detailBox.setSpacing(5);

                StopIterator detail = new StopIterator(stepDetails);
                while (detail.next()) {
                    if (detail.isFirst() || detail.isLast()) continue;
                    detailBox.getChildren().add(new RouteStopView(detail.current(), detail.arrivalTime(), false, color));
                }

                setOnMouseClicked(event -> {
                    visible.set(!visible.get());
                    if (visible.get()) {
                        add(detailBox, 0, 2, 2, 1);
                    } else {
                        getChildren().remove(detailBox);
                    }
                });
            }
        }
    }

    private static class ConnectionView extends AbstractView {

        ConnectionView(Duration duration) {

            addColumn(TIME_WIDTH + NODE_WIDTH, Priority.NEVER, HPos.RIGHT, false);
            addColumn(-1, Priority.ALWAYS, HPos.LEFT, true);

            HBox box = new HBox();
            box.setSpacing(5);
            box.setAlignment(Pos.CENTER_LEFT);

            Label icon = new Label();
            icon.setMinWidth(20);
            icon.setGraphic(FontIcon.of(Material.DIRECTIONS_WALK, 18));

            Label label = new Label(duration.toSeconds() == 0 ?
                    "Connection" : "Walk for " + duration.toMinutes() + " min");

            box.getChildren().addAll(icon, label);

            add(box, 1, 0);
        }
    }
}
