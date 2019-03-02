package pl.sda._JAVA_gda24_intro.javafx.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class AlertController implements Initializable {
    @FXML
    private Button button;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        button.setOnAction(e -> new AlertWindow("Alert window", "Message provided from the controller"));
    }
}
