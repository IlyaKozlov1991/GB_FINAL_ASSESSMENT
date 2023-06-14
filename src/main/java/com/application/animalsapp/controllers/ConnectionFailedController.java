package com.application.animalsapp.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ConnectionFailedController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button connectionCloseButton;

    @FXML
    private Label connectionLabel;

    @FXML
    void initialize() {
        String info = "Отсутствует подключение к серверу!\n" +
                "Проверьте подключение.";
        connectionLabel.setText(info);
        connectionCloseButton.setOnAction(actionEvent -> {
            connectionCloseButton.getScene().getWindow().hide();
        });
    }

}
