package pl.sda._JAVA_gda24_intro.javafx.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class InputController implements Initializable {
    @FXML
    private TextField textField;

    @FXML
    private Button button;

    @FXML
    private Text text;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        button.setOnAction(e -> text.setText(textField.getText()));
    }
}
