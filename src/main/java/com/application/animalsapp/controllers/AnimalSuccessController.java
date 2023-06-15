package com.application.animalsapp.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.application.animalsapp.DataBaseConnector;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class AnimalSuccessController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button successCloseButton;

    @FXML
    private Label successLabel;

    @FXML
    void initialize() {
        DataBaseConnector connector = new DataBaseConnector();
        successLabel.setText("Животное успешно добавлено в базу данных!" +
                "\nСчетчик успешных добавений: " + connector.readCounter());
        successCloseButton.setOnAction(actionEvent -> {
            successCloseButton.getScene().getWindow().hide();
        });

    }

}
