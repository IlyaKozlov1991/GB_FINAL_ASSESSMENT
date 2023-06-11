module com.application.animalsapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.application.animalsapp to javafx.fxml;
    exports com.application.animalsapp;
}