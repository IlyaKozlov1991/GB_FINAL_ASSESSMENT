package com.application.animalsapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

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
        });
    }

    private void setAddNewButton() {
        String classHolder = choiseLable2.getText();
        DataBaseConnector connector = new DataBaseConnector();
        switch (classHolder) {
            case "Кошка":
                Cat cat = new Cat(nameText.getText(), birthText1.getText(), commandsText.getText());
                connector.writeDB("cats", cat.Name, cat.Birth, cat.Commands);
                break;
            case "Собака":
                Dog dog = new Dog(nameText.getText(), birthText1.getText(), commandsText.getText());
                connector.writeDB("dogs", dog.Name, dog.Birth, dog.Commands);
                break;
            case "Хомяк":
                Hamster hamster = new Hamster(nameText.getText(), birthText1.getText(), commandsText.getText());
                connector.writeDB("hamsters", hamster.Name, hamster.Birth, hamster.Commands);
                break;
            case "Лошадь":
                Horse horse = new Horse(nameText.getText(), birthText1.getText(), commandsText.getText());
                connector.writeDB("horses", horse.Name, horse.Birth, horse.Commands);
                break;
            case "Осел":
                Donkey donkey = new Donkey(nameText.getText(), birthText1.getText(), commandsText.getText());
                connector.writeDB("donkeys", donkey.Name, donkey.Birth, donkey.Commands);
                break;
            case "Верблюд":
                Camel camel = new Camel(nameText.getText(), birthText1.getText(), commandsText.getText());
                connector.writeDB("camels", camel.Name, camel.Birth, camel.Commands);
                break;
        }
        nameText.setVisible(false);
        birthText1.setVisible(false);
        commandsText.setVisible(false);
    }

}

