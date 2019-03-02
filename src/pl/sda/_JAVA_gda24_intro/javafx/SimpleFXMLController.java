package pl.sda._JAVA_gda24_intro.javafx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class SimpleFXMLController implements Initializable {
    @FXML
    private Button button1;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ButtonUtil.setOnAction(button1);
    }

    // you can define more methods here to handle code in the constructor
}
