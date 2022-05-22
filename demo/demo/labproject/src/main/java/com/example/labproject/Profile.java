package com.example.labproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Profile {

    @FXML
    private Button home;

    @FXML
    private Button show_profile;

    @FXML
    private Label show_email;

    @FXML
    private Label prog;

    @FXML
    private Label show_gender;

    @FXML
    private Label show_name;

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
    void Show_Profile(ActionEvent event) {
        show_name.setText(Storage.getName());
        show_gender.setText(Storage.getGender());
        show_email.setText(Storage.getEmail());
        prog.setText(Storage.getProgress());
    }

}
