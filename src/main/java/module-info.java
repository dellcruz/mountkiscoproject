module com.health.mountkiscohospital {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.health.mountkiscohospital to javafx.fxml;
    exports com.health.mountkiscohospital;
    opens com.health.mountkiscohospital.controller to javafx.fxml;
    exports com.health.mountkiscohospital.controller;
    opens com.health.mountkiscohospital.helper to javafx.fxml;
    exports com.health.mountkiscohospital.helper;
}