package com.application.animalsapp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class AppController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView mainBackground;

    @FXML
    private Label sloganLabel1;

    @FXML
    private Label sloganLabel2;

    @FXML
    private Label sloganLabel3;

    @FXML
    private Label sloganLabel4;

    @FXML
    private Label sloganLabel5;

    @FXML
    private Label sloganLabel6;

    @FXML
    private Button startButton;

    @FXML
    private Label wellcomeLabel;

    @FXML
    void initialize() {
        startButton.setOnAction(actionEvent -> {
            startButton.getScene().getWindow().hide();

            FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("register.fxml"));
            Stage stage = new Stage();
            Scene scene = null;
            try {
                scene = new Scene(fxmlLoader.load(), 590, 400);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage.setTitle("Добро пожаловать!");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        });
    }

}