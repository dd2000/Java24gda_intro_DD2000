package pl.sda._JAVA_gda24_intro.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ExampleApp extends Application {
    public static String LAYOUTS_DIR = "views";
    public static String DASHBOARD_LAYOUT_NAME = "dashboard.fxml";

    private static Stage primaryStage;

    public static Stage getPrimaryStage() {
        return ExampleApp.primaryStage;
    }

    private static void setPrimaryStage(Stage primaryStage) {
        ExampleApp.primaryStage = primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        setPrimaryStage(primaryStage);

        Parent root = FXMLLoader.load(getClass().getResource(resolveLayoutPath(ExampleApp.DASHBOARD_LAYOUT_NAME)));
        primaryStage.setTitle("JavaFX examples");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private String resolveLayoutPath(String layoutName) {
        return ExampleApp.LAYOUTS_DIR + "/" + layoutName;
    }
}
