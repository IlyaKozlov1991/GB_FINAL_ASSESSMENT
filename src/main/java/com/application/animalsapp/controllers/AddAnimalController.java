package com.application.animalsapp.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.application.animalsapp.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddAnimalController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuItem addCamel;

    @FXML
    private MenuItem addCat;

    @FXML
    private MenuItem addDog;

    @FXML
    private MenuItem addDonkey;

    @FXML
    private MenuItem addHamster;

    @FXML
    private MenuItem addHorse;

    @FXML
    private Button addNewButton;

    @FXML
    private Label addNewLabel;

    @FXML
    private TextField birthText1;

    @FXML
    private Label choiseLable1;

    @FXML
    private Label choiseLable2;

    @FXML
    private MenuButton chooseMenu;

    @FXML
    private TextArea commandsText;

    @FXML
    private Menu homePetsMenu;

    @FXML
    private TextField nameText;

    @FXML
    private Menu packAnimalsMenu;

    @FXML
    void initialize() {
        addCat.setOnAction(actionEvent -> {
            choiseLable2.setText("Кошка");
            myEventAction();
        });
        addDog.setOnAction(actionEvent -> {
            choiseLable2.setText("Собака");
            myEventAction();
        });
        addHamster.setOnAction(actionEvent -> {
            choiseLable2.setText("Хомяк");
            myEventAction();
        });
        addHorse.setOnAction(actionEvent -> {
            choiseLable2.setText("Лошадь");
            myEventAction();
        });
        addDonkey.setOnAction(actionEvent -> {
            choiseLable2.setText("Осел");
            myEventAction();
        });
        addCamel.setOnAction(actionEvent -> {
            choiseLable2.setText("Верблюд");
            myEventAction();
        });
    }

    private void myEventAction() {
        nameText.setDisable(false);
        birthText1.setDisable(false);
        commandsText.setDisable(false);
        addNewButton.setOnAction(actionEvent1 -> {
            setAddNewButton();
            nameText.clear();
            birthText1.clear();
            commandsText.clear();
            nameText.setDisable(true);
            birthText1.setDisable(true);
            commandsText.setDisable(true);
        });
    }

    private void setAddNewButton() {
        String classHolder = choiseLable2.getText();
        DataBaseConnector connector = new DataBaseConnector();
        switch (classHolder) {
            case "Кошка":
                Cat cat = new Cat(nameText.getText(), birthText1.getText(), commandsText.getText());
                connector.addAnimal("cats", cat.getName(), cat.getBirth(), cat.getCommands());
                showSuccess();
                break;
            case "Собака":
                Dog dog = new Dog(nameText.getText(), birthText1.getText(), commandsText.getText());
                connector.addAnimal("dogs", dog.getName(), dog.getBirth(), dog.getCommands());
                showSuccess();
                break;
            case "Хомяк":
                Hamster hamster = new Hamster(nameText.getText(), birthText1.getText(), commandsText.getText());
                connector.addAnimal("hamsters", hamster.getName(), hamster.getBirth(), hamster.getCommands());
                showSuccess();
                break;
            case "Лошадь":
                Horse horse = new Horse(nameText.getText(), birthText1.getText(), commandsText.getText());
                connector.addAnimal("horses", horse.getName(), horse.getBirth(), horse.getCommands());
                showSuccess();
                break;
            case "Осел":
                Donkey donkey = new Donkey(nameText.getText(), birthText1.getText(), commandsText.getText());
                connector.addAnimal("donkeys", donkey.getName(), donkey.getBirth(), donkey.getCommands());
                showSuccess();
                break;
            case "Верблюд":
                Camel camel = new Camel(nameText.getText(), birthText1.getText(), commandsText.getText());
                connector.addAnimal("camels", camel.getName(), camel.getBirth(), camel.getCommands());
                showSuccess();
                break;
        }
    }

    private void showSuccess() {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("animal-success.fxml"));
        Stage stage = new Stage();
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 400, 150);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setTitle("Success");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

}

