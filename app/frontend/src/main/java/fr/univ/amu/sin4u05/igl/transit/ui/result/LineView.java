package fr.univ.amu.sin4u05.igl.transit.ui.result;

import fr.univ.amu.sin4u05.igl.routes.TransportLine;
import fr.univ.amu.sin4u05.igl.transit.ui.UIConstants;
import fr.univ.amu.sin4u05.igl.transit.ui.util.FXUtil;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import org.kordamp.ikonli.javafx.FontIcon;

import static griffon.javafx.beans.binding.MappingBindings.mapAsString;
import static griffon.javafx.beans.binding.MappingBindings.mapObject;

public class LineView extends HBox {

    private SimpleObjectProperty<TransportLine> route = new SimpleObjectProperty<>();
    private SimpleObjectProperty<Color> color = new SimpleObjectProperty<>();

    @FXML
    private Label icon;

    @FXML
    private Label label;

    public LineView(TransportLine route, Color color) {
        setRoute(route);
        setColor(color);
        FXUtil.loadFXML("/fr/univ/amu/sin4u05/igl/transit/ui/result/LineView.fxml", this, this);
    }

    @FXML
    private void initialize() {
        icon.graphicProperty().bind(mapObject(route, l -> FontIcon.of(UIConstants.LINE_TYPE_ICONS.get(l.getType()), 12)));
        label.textProperty().bind(mapAsString(route, TransportLine::getShortName));
        label.backgroundProperty().bind(mapObject(color, c -> new Background(new BackgroundFill(
                c,
                new CornerRadii(3, 3, 3, 3, false),
                Insets.EMPTY
        ))));
    }

    public TransportLine getRoute() {
        return route.get();
    }

    public SimpleObjectProperty<TransportLine> routeProperty() {
        return route;
    }

    public void setRoute(TransportLine route) {
        this.route.set(route);
    }

    public Color getColor() {
        return color.get();
    }

    public SimpleObjectProperty<Color> colorProperty() {
        return color;
    }

    public void setColor(Color color) {
        this.color.set(color);
    }
}
