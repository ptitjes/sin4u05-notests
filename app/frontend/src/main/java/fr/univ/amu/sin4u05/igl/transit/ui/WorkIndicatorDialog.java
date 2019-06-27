package fr.univ.amu.sin4u05.igl.transit.ui;

import javafx.concurrent.Task;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.transform.Scale;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;

public class WorkIndicatorDialog {

    private final String labelString;

    private final Stage dialog = new Stage(StageStyle.UNDECORATED);

    private final ProgressIndicator progressIndicator =
            new ProgressIndicator(ProgressIndicator.INDETERMINATE_PROGRESS);

    public WorkIndicatorDialog(Window owner, String labelString) {
        this.labelString = labelString;

        dialog.initModality(Modality.WINDOW_MODAL);
        dialog.initOwner(owner);
        dialog.setResizable(false);
    }

    public <V> void executeTask(Task<V> task) {
        task.setOnRunning((e) -> this.show());
        task.setOnSucceeded((e) -> this.hide());
        task.setOnFailed((e) -> {
            // eventual error handling by catching exceptions from task.get()
        });
        new Thread(task).start();
    }

    public void show() {
        setupDialog();
    }

    public void hide() {
        dialog.close();
    }

    private void setupDialog() {
        Group root = new Group();

        BorderPane mainPane = new BorderPane();
        root.getChildren().add(mainPane);

        VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setAlignment(Pos.CENTER);
        vbox.setMinSize(330, 120);

        Label label = new Label();
        label.setText(labelString);

        vbox.getChildren().addAll(label, new Region(), progressIndicator);

        mainPane.setTop(vbox);

        Scene scene = new Scene(root, 330, 120, Color.WHITE);
        scene.getStylesheets().add("style/base.css");
        dialog.setScene(scene);
        dialog.show();
    }
}
