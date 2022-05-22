package com.example.labproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AboutUs {

    @FXML
    private Button explore;

    @FXML
    private Button home;

    @FXML
    void Explore(ActionEvent event) {
        try {

            explore.getScene().getWindow().hide();
            Stage signup = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("explore.fxml"));
            Scene scene = new Scene(root);
            signup.setScene(scene);
            signup.show();
            signup.setResizable(false);

        } catch (Exception e) {
            System.out.println(" Error signup : " + e);
        }

    }

    @FXML
    void Home(ActionEvent event) {
        try {

            home.getScene().getWindow().hide();
            Stage signup = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
            Scene scene = new Scene(root);
            signup.setScene(scene);
            signup.show();
            signup.setResizable(false);

        } catch (Exception e) {
            System.out.println(" Error signup : " + e);
        }

    }

}
