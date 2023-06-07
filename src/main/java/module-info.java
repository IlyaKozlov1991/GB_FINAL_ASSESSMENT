module com.application.animalsapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.application.animalsapp to javafx.fxml;
    exports com.application.animalsapp;
}