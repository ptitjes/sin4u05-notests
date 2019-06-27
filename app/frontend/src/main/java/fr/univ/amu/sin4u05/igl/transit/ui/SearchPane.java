package fr.univ.amu.sin4u05.igl.transit.ui;

import fr.univ.amu.sin4u05.igl.routes.Station;
import fr.univ.amu.sin4u05.igl.routes.TransportNetwork;
import fr.univ.amu.sin4u05.igl.transit.ui.util.FXUtil;
import fr.univ.amu.sin4u05.igl.transit.ui.util.TimeSpinner;
import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.transform.Scale;
import javafx.util.StringConverter;
import org.controlsfx.control.PopOver;
import org.controlsfx.control.textfield.AutoCompletionBinding;
import org.controlsfx.control.textfield.AutoCompletionBinding.ISuggestionRequest;
import org.controlsfx.control.textfield.TextFields;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SearchPane extends VBox {

    @FXML
    private TextField fromStation;

    @FXML
    private TextField toStation;

    @FXML
    private Label startTimeLabel;

    private LocalTime startTime = null;

    private TransportNetwork dataSet;

    public SearchPane() {
        FXUtil.loadFXML("/fr/univ/amu/sin4u05/igl/transit/ui/SearchPane.fxml", this, this);
    }

    @FXML
    private void initialize() {
    }

    public void setDataSet(ObservableValue<TransportNetwork> dataSet) {
        dataSet.addListener((observable, oldValue, ds) -> {
            this.dataSet = ds;
            initializeCompletions();
        });
    }

    @FXML
    private void swapFromTo() {
        String from = fromStation.getText();
        String to = toStation.getText();
        fromStation.setText(to);
        toStation.setText(from);

        fireSearch();
    }

    @FXML
    private void showTimePopover(Event event) {
        PopOver popOver = new PopOver();

        VBox box = new VBox();
        box.setPadding(new Insets(20));
        box.setSpacing(15);

        ToggleGroup group = new ToggleGroup();

        RadioButton nowButton = new RadioButton("Now");
        nowButton.setToggleGroup(group);
        nowButton.setSelected(startTime == null);

        HBox atPane = new HBox();
        atPane.setSpacing(10);

        RadioButton atButton = new RadioButton("At:");
        atButton.setToggleGroup(group);
        atButton.setSelected(startTime != null);

        TimeSpinner atTimeSpinner = new TimeSpinner(startTime != null ? startTime : LocalTime.now());

        atPane.getChildren().addAll(atButton, atTimeSpinner);

        box.getChildren().addAll(nowButton, atPane);

        atTimeSpinner.valueProperty().addListener((observable, oldValue, newValue) -> {
            startTime = newValue;
            atButton.setSelected(true);
            updateStartTimeLabel();
            fireSearch();
        });

        group.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            startTime = newValue == nowButton ? null : atTimeSpinner.getValue();
            updateStartTimeLabel();
            fireSearch();
        });

        popOver.setContentNode(box);
        popOver.setArrowLocation(PopOver.ArrowLocation.TOP_RIGHT);
        popOver.show(startTimeLabel, -5);
    }

    private void updateStartTimeLabel() {
        startTimeLabel.setText(startTime == null ? "Now" : "At: " + startTime.toString());
    }

    @FXML
    private void refresh() {
        fireSearch();
    }

    private void fireSearch() {
        Station from = dataSet.getStationByName(fromStation.getText());
        Station to = dataSet.getStationByName(toStation.getText());

        this.fireEvent(new SearchEvent(from, to,
                startTime == null ? LocalDateTime.now() : LocalDate.now().atTime(startTime)
        ));
    }

    private void initializeCompletions() {
        bindAutoCompletion(fromStation);
        bindAutoCompletion(toStation);
    }

    private void bindAutoCompletion(TextField textField) {

        List<Station> stations = dataSet == null ? Collections.emptyList() : dataSet.getAllStations();

        AutoCompletionBinding<Station> binding = TextFields.bindAutoCompletion(textField,
                (ISuggestionRequest request) -> filterStations(stations, request.getUserText()),
                stationStringConverter);

        binding.setMinWidth(400);
        binding.setPrefWidth(500);
        binding.setVisibleRowCount(20);
        binding.setOnAutoCompleted(event -> fireSearch());
    }

    private List<Station> filterStations(List<Station> stations, String filter) {
        return stations.stream().filter(s -> s.getName().toLowerCase().contains(filter.toLowerCase()))
                .collect(Collectors.toList());
    }

    private StringConverter<Station> stationStringConverter = new StringConverter<>() {
        @Override
        public String toString(Station object) {
            return object.getName();
        }

        @Override
        public Station fromString(String string) {
            return dataSet.getStationByName(string);
        }
    };
}

