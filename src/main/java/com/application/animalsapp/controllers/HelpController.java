package com.application.animalsapp.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button heclpCloseButton;

    @FXML
    private Label helpLabel;

    @FXML
    void initialize() {
        String info = "Список животных -> показать список зарегистрированных животных\n" +
                        "Добавить животное -> добавить новое животное\n" +
                        "Центр обучения -> обучить животное новой команде";
        helpLabel.setText(info);
        heclpCloseButton.setOnAction(actionEvent -> {
            heclpCloseButton.getScene().getWindow().hide();
        });

    }

}
