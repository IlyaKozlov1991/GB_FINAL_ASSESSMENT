package com.application.animalsapp.controllers;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.application.animalsapp.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class RegisterController {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addButton;

    @FXML
    private Label addLabel;

    @FXML
    private Button exitButton1;

    @FXML
    private Button helpButton;

    @FXML
    private Button listButton;

    @FXML
    private Button trainingButton;

    @FXML
    void initialize() {
        addButton.setOnAction(actionEvent -> {
            FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("add-animal.fxml"));
            Stage stage = new Stage();
            Scene scene = null;
            try {
                scene = new Scene(fxmlLoader.load(), 590, 400);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage.setTitle("Добавить новое животное");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        });
        trainingButton.setOnAction(actionEvent -> {
            FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("add-command.fxml"));
            Stage stage = new Stage();
            Scene scene = null;
            try {
                scene = new Scene(fxmlLoader.load(), 590, 400);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage.setTitle("Добавить новую команду");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        });
        listButton.setOnAction(actionEvent -> {
            FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("animals-list.fxml"));
            Stage stage = new Stage();
            Scene scene = null;
            try {
                scene = new Scene(fxmlLoader.load(), 590, 400);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage.setTitle("Зарегистрированные животные");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        });

        helpButton.setOnAction(actionEvent -> {
            FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("help-window.fxml"));
            Stage stage = new Stage();
            Scene scene = null;
            try {
                scene = new Scene(fxmlLoader.load(), 400, 150);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage.setTitle("Help");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        });

        exitButton1.setOnAction(actionEvent -> {
            System.exit(0);
        });
    }

}
