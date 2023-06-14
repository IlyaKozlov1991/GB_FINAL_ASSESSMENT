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

public class AddCommandController {

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
    private Label choiseLable1;

    @FXML
    private Label choiseLable2;

    @FXML
    private Label choiseLable21;

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
    private Label trainingCenterLabel;

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
        commandsText.setDisable(false);
        addNewButton.setOnAction(actionEvent1 -> {
            choiseLable21.setText(nameText.getText());
            setAddNewButton();
            nameText.clear();
            commandsText.clear();
        });
    }

    private void setAddNewButton() {
        String classHolder = choiseLable2.getText();
        DataBaseConnector connector = new DataBaseConnector();
        switch (classHolder) {
            case "Кошка":
                connector.addCommand("cats", nameText.getText(),commandsText.getText());
                break;
            case "Собака":
                connector.addCommand("dogs", nameText.getText(),commandsText.getText());
                break;
            case "Хомяк":
                connector.addCommand("hamsters", nameText.getText(),commandsText.getText());
                break;
            case "Лошадь":
                connector.addCommand("horses", nameText.getText(),commandsText.getText());
                break;
            case "Осел":
                connector.addCommand("donkeys", nameText.getText(),commandsText.getText());
                break;
            case "Верблюд":
                connector.addCommand("camels", nameText.getText(),commandsText.getText());
                break;
        }
        nameText.setVisible(false);
        commandsText.setVisible(false);
    }

}
