package com.application.animalsapp;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class AnimalsListController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Animal, String> homeBirth;

    @FXML
    private TableColumn<Animal, String> homeCommands;

    @FXML
    private TableColumn<Animal, String> homeName;

    @FXML
    private TableColumn<Animal, String> packBirth;

    @FXML
    private TableColumn<Animal, String> packCommands;

    @FXML
    private TableColumn<Animal, String> packName;

    @FXML
    private TableView<Animal> showHome;

    @FXML
    private TableView<Animal> showPack;

    @FXML
    private TabPane showPane;

    @FXML
    private Tab tabHome;

    @FXML
    private Tab tabPack;

    @FXML
    void initialize() {
        tabHome.setContent(showHome());
        tabPack.setContent(showPack());
    }

    private TableView showHome() {
        DataBaseConnector connector = new DataBaseConnector();
        ObservableList<Animal> temp2 = FXCollections.observableArrayList(connector.readHome());
        homeName.setCellValueFactory(new PropertyValueFactory<Animal, String>("Name"));
        homeBirth.setCellValueFactory(new PropertyValueFactory<Animal, String>("Birth"));
        homeCommands.setCellValueFactory(new PropertyValueFactory<Animal, String>("Commands"));
        showHome.setItems(temp2);
        return  showHome;
    }

    private TableView showPack() {
        DataBaseConnector connector = new DataBaseConnector();
        ObservableList<Animal> temp2 = FXCollections.observableArrayList(connector.readPack());
        packName.setCellValueFactory(new PropertyValueFactory<Animal, String>("Name"));
        packBirth.setCellValueFactory(new PropertyValueFactory<Animal, String>("Birth"));
        packCommands.setCellValueFactory(new PropertyValueFactory<Animal, String>("Commands"));
        showPack.setItems(temp2);
        return showPack;
    }
}

