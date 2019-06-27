package fr.univ.amu.sin4u05.igl.transit.ui.result;

import fr.univ.amu.sin4u05.igl.transit.ui.util.FXUtil;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

import java.time.Duration;

import static griffon.javafx.beans.binding.MappingBindings.mapAsString;

public class WalkView extends HBox {

    private SimpleObjectProperty<Duration> duration = new SimpleObjectProperty<>();

    @FXML
    private Label walkingTime;

    public WalkView() {
        this(null);
    }

    public WalkView(Duration duration) {
        setDuration(duration);
        FXUtil.loadFXML("/fr/univ/amu/sin4u05/igl/transit/ui/result/WalkView.fxml", this, this);
    }

    @FXML
    private void initialize() {
        walkingTime.textProperty().bind(mapAsString(duration, (d) -> "" + d.toMinutes()));
    }

    public void setDuration(Duration duration) {
        this.duration.set(duration);
    }

    public Duration getDuration() {
        return duration.get();
    }

    public SimpleObjectProperty<Duration> durationProperty() {
        return duration;
    }
}
