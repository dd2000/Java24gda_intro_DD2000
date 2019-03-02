package pl.sda._JAVA_gda24_intro.javafx.controllers;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertWindow {
    public AlertWindow(String title, String message) {
        Stage stage = new Stage();
        stage.setTitle(title);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setWidth(300);
        stage.setHeight(300);

        Text text = new Text(message);

        Button button = new Button("Close");
        button.setOnAction(e -> stage.close());

        VBox box = new VBox(20, text, button);
        box.setAlignment(Pos.CENTER);

        stage.setScene(new Scene(box));
        stage.show();
    }
}
