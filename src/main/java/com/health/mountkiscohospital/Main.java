package com.health.mountkiscohospital;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Main extends Application {
    public Main(){

    }

    public static void main(String[] args) {
        launch(new String[0]);
    }
    public void start(Stage stage) throws Exception{

        FXMLLoader fxmLoader = new FXMLLoader(Main.class.getResource("index.fxml"));;
        Scene scene = new Scene((Parent)fxmLoader.load(), 600, 500);
        stage.setTitle("Mount Kisco Hospital | Home");
        stage.setScene(scene);
        stage.show();
    }
}