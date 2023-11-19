module com.health.mountkiscohospital {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.health.mountkiscohospital to javafx.fxml;
    exports com.health.mountkiscohospital;
}