package com.health.mountkiscohospital.controller;

import com.health.mountkiscohospital.helper.Navigation;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class IndexController {
    @FXML
    Button register;
    @FXML
    Button login;

    @FXML
    void gotoRegistrationPage(MouseEvent event){
        Navigation.gotoPage(event,"registration-view.fxml", getClass());


    }
    @FXML
    void gotoLoginPage(MouseEvent event){
        Navigation.gotoPage(event,"login-view.fxml", getClass());

    }
}
