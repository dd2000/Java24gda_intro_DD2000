package pl.sda._JAVA_gda24_intro.javafx;

import javafx.application.Application;
import javafx.beans.property.ObjectProperty;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class WithoutFXML extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button button = new Button("Hello world!");
        Text text = new Text("Click the button to change label");

        button.setOnAction(e -> text.setText("Button was clicked!"));

        TextField textField = new TextField();
        Label label = new Label();
        ObjectProperty<Font> fontProperty = label.fontProperty();
        fontProperty.setValue(new Font(24));
        textField.setOnAction(e -> label.setText(textField.getText()));

        VBox box = new VBox();
        ObservableList<Node> children = box.getChildren();
        children.addAll(button, text, textField, label);

        primaryStage.setTitle("Without FXML");
        primaryStage.setScene(new Scene(box, 300, 200));
        primaryStage.show();
    }
}
