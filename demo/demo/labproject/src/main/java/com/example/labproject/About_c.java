package com.example.labproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class About_c {

    @FXML
    private Button backl;

    @FXML
    void Back(ActionEvent event) {
        try {
            backl.getScene().getWindow().hide();
            Stage login = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("c_learningg.fxml"));
            Scene scene = new Scene(root);
            login.setScene(scene);
            login.show();
            login.setResizable(false);

        } catch (Exception e) {
            System.out.println(" Error signup : " + e);
        }

    }

}
