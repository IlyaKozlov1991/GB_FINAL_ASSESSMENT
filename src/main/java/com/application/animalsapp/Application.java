package com.application.animalsapp;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Pufy", 1, "Turn");
        Dunkey dunkey1 = new Dunkey("Ia", 4, "Go");
        String nc = cat1.Name;
        String nd = dunkey1.Name;
        System.out.println("Animals: " + nc + " " + nd);

//        launch();
        }
}