module com.application.animalsapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.application.animalsapp to javafx.fxml;
    opens com.application.animalsapp.controllers to javafx.fxml;
    exports com.application.animalsapp;
    exports com.application.animalsapp.controllers;
}