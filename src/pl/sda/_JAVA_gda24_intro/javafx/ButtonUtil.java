package pl.sda._JAVA_gda24_intro.javafx;

import javafx.scene.control.Button;

public class ButtonUtil {
    public static void setOnAction(Button button) {
        button.setOnAction(e -> {
            System.out.println("Button was clicked!");
        });
    }
}
