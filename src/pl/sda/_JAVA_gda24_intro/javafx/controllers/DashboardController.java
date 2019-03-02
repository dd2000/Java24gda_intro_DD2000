package pl.sda._JAVA_gda24_intro.javafx.controllers;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import pl.sda._JAVA_gda24_intro.javafx.ExampleApp;

import java.io.IOException;
import java.net.URL;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.Set;

public class DashboardController implements Initializable {
    @FXML
    private ComboBox<String> comboBox;

    private Set<String> layouts = new HashSet<>();

    public DashboardController() {
        this.layouts.add("hello.fxml");
        this.layouts.add("alert.fxml");
        this.layouts.add("input.fxml");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.comboBox.setPromptText("Select layout to show:");

        ObservableList<String> items = this.comboBox.getItems();
        items.addAll(this.layouts);

        this.comboBox.setOnAction(e -> selectLayout());
    }

    private void selectLayout() {
        String layoutName = this.comboBox.getValue();
        try {
            Parent root = FXMLLoader.load(getClass().getResource(resolveLayoutPath(layoutName)));
            ExampleApp.getPrimaryStage().setScene(new Scene(root));
            ExampleApp.getPrimaryStage().setOnCloseRequest(e -> {
                e.consume();
                loadDashboardLayout();
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadDashboardLayout() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(resolveLayoutPath(ExampleApp.DASHBOARD_LAYOUT_NAME)));
            ExampleApp.getPrimaryStage().setScene(new Scene(root));
            ExampleApp.getPrimaryStage().setOnCloseRequest(e -> ExampleApp.getPrimaryStage().close());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String resolveLayoutPath(String layoutName) {
        return "../" + ExampleApp.LAYOUTS_DIR + "/" + layoutName;
    }
}
