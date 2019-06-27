package fr.univ.amu.sin4u05.igl.transit.ui;

import fr.univ.amu.sin4u05.igl.transit.gtfs.GTFSDataLoader;
import fr.univ.amu.sin4u05.igl.transit.gtfs.GTFSDataSet;
import fr.univ.amu.sin4u05.igl.transit.search.TransitSearch;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class Main extends Application {

    private static final String GTFS_DATA_PATH = "data/Gtfs_RTM___2019-06-27.zip";

    private static final int WIDTH = 1280;
    private static final int HEIGHT = 800;

    @Override
    public void start(Stage stage) {

        MainPane mainPane = new MainPane();

        Scene scene = new Scene(mainPane, WIDTH, HEIGHT);
        scene.getStylesheets().add("style/base.css");
        stage.setScene(scene);
        stage.setTitle("Transport Route Planner");
        stage.setResizable(true);

        stage.show();

        loadDataSet(scene, mainPane, new File(GTFS_DATA_PATH));
    }

    private void loadDataSet(Scene scene, MainPane mainPane, File dataFile) {
        WorkIndicatorDialog loadingDialog =
                new WorkIndicatorDialog(scene.getWindow(), "Loading data...");

        loadingDialog.executeTask(new Task<>() {
            @Override
            public Void call() throws IOException {
                GTFSDataSet dataSet = GTFSDataLoader.load(dataFile);
                TransitSearch search = new TransitSearch(dataSet);

                Platform.runLater(() -> {
                    mainPane.setDataSet(dataSet);
                    mainPane.setSearch(search);
                });
                return null;
            }
        });
    }

    public static void main(String[] args) {
        launch();
    }
}
