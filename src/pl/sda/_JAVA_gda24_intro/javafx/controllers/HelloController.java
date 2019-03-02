package pl.sda._JAVA_gda24_intro.javafx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HelloController {
    @FXML
    private Button button;

    @FXML
    private void onClick(ActionEvent event) {
        System.out.println("The button was clicked!");
    }
}
