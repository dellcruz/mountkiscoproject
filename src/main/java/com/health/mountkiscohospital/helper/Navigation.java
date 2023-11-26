package com.health.mountkiscohospital.helper;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Navigation {
    private static Parent root;


    public  static void gotoPage(MouseEvent event, String filename, Class<?> clazz){
        FXMLLoader loader = new FXMLLoader(clazz.getResource(filename));
        try{
            root = (Parent)loader.load();
        }catch(IOException var4){
            var4.printStackTrace();
        }
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
       stage.setScene(scene);
       stage.show();
    }
}
