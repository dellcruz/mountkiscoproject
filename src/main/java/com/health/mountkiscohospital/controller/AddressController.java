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

public class AddressController {

        @FXML
        Button continueButton;

        @FXML
        public void gotoAddressRegistrationPage(MouseEvent event){
          Navigation.gotoPage(event, "address-registration-view.fxml", getClass());

        }
    }


