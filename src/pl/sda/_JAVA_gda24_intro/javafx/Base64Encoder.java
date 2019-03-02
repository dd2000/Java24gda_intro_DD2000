package pl.sda._JAVA_gda24_intro.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Base64;

public class Base64Encoder extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) {
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        Button button = new Button("Encode!");

        button.setOnAction(e -> {
            String value = textField1.getText();
            String encoded = Base64.getEncoder().encodeToString(value.getBytes());
            textField2.setText(encoded);

            ClipboardContent clipboardContent = new ClipboardContent();
            clipboardContent.putString(encoded);

            Clipboard clipboard = Clipboard.getSystemClipboard();
            clipboard.setContent(clipboardContent);
        });
//        button.setOnAction(e -> encode(textField1, textField2));

        VBox box = new VBox();
        box.getChildren().addAll(textField1, button, textField2);

        primaryStage.setScene(new Scene(box));
        primaryStage.show();
    }

    private void encode(TextField textField1, TextField textField2) {
        String value = textField1.getText();
        String encoded = Base64.getEncoder().encodeToString(value.getBytes());
        textField2.setText(encoded);

        ClipboardContent clipboardContent = new ClipboardContent();
        clipboardContent.putString(encoded);

        Clipboard clipboard = Clipboard.getSystemClipboard();
        clipboard.setContent(clipboardContent);
    }
}
