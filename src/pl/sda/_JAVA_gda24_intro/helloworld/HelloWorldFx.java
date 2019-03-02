package pl.sda._JAVA_gda24_intro.helloworld;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloWorldFx extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Hello World from JavaFX!");

        Button button = new Button("Click me!");
        button.setOnAction(e -> System.out.println("Button was clicked!"));

        VBox box = new VBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().addAll(label, button);

        primaryStage.setTitle("Hello World - JavaFX");
        primaryStage.setScene(new Scene(box, 300, 200));
        primaryStage.show();
    }
}
