package com.example.labproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Explore {

    @FXML
    private Button cp;

    @FXML
    private Button home;

    @FXML
    private Button javafx;

    @FXML
    private Button oop;

    @FXML
    private Button robo;

    @FXML
    void CP(ActionEvent event) {
        try {
            cp.getScene().getWindow().hide();
            Stage login = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("cp.fxml"));
            Scene scene = new Scene(root);
            login.setScene(scene);
            login.show();
            login.setResizable(false);

        } catch (Exception e) {
            System.out.println(" Error signup : " + e);
        }

    }

    @FXML
    void Home(ActionEvent event) {
        try {
            home.getScene().getWindow().hide();
            Stage login = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
            Scene scene = new Scene(root);
            login.setScene(scene);
            login.show();
            login.setResizable(false);

        } catch (Exception e) {
            System.out.println(" Error signup : " + e);
        }

    }

    @FXML
    void JavaFX(ActionEvent event) {

    }

    @FXML
    void OOP(ActionEvent event) {

    }

    @FXML
    void Robotics(ActionEvent event) {

    }


}
