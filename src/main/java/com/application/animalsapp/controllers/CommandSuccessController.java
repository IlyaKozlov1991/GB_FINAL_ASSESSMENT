package com.application.animalsapp.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CommandSuccessController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button commandCloseButton1;

    @FXML
    private Label commandLabel1;

    @FXML
    void initialize() {
        commandLabel1.setText("Животное обучено новой команде!");
        commandCloseButton1.setOnAction(actionEvent -> {
            commandCloseButton1.getScene().getWindow().hide();
        });
    }

}