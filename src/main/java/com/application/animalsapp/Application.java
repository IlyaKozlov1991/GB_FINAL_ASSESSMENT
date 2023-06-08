package com.application.animalsapp;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.converter.LocalDateStringConverter;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 590, 400);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {

//        Cat cat = new Cat("Kity", "2020-06-08", "Kis-kis");
//        Horse horse = new Horse("Cloud", "2017-04-11", "Go");
//        horse.showInfo();
//        cat.showInfo();
////        String myshoot = "2023-06-08";
//        String[] temp;
//        temp = myshoot.split("-");
//        for (int i = 0; i < temp.length; i++) {
//            System.out.println(temp[i] + "/");
//        }

        List<String> commands = new ArrayList<>();
        commands.add("Come here");
        commands.add("Eat");
        commands.add("Sleep");
        Cat cat = new Cat("Kity", "2020-07-12", commands);
        cat.showInfo();

//        launch();

    }

}