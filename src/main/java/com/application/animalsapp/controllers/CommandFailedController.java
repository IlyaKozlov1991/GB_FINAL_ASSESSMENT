package com.application.animalsapp.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CommandFailedController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button commandCloseButton;

    @FXML
    private Label commandLabel;

    @FXML
    void initialize() {
        String info = "Животное не найдено!\n" +
                "Проверьте правильность написания имени.";
        commandLabel.setText(info);
        commandCloseButton.setOnAction(actionEvent -> {
            commandCloseButton.getScene().getWindow().hide();
        });
    }

}
