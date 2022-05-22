package com.example.labproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CTest {

    @FXML
    private Button back;

    @FXML
    private CheckBox q1a;

    @FXML
    private CheckBox q1b;

    @FXML
    private CheckBox q1c;

    @FXML
    private CheckBox q1d;

    @FXML
    private CheckBox q2a;

    @FXML
    private CheckBox q2b;

    @FXML
    private CheckBox q2c;

    @FXML
    private CheckBox q2d;

    @FXML
    private CheckBox q3a;

    @FXML
    private CheckBox q3b;

    @FXML
    private CheckBox q3c;

    @FXML
    private CheckBox q3d;

    @FXML
    private CheckBox q4a;

    @FXML
    private CheckBox q4b;

    @FXML
    private CheckBox q4c;

    @FXML
    private CheckBox q4d;

    @FXML
    private CheckBox q5a;

    @FXML
    private CheckBox q5b;

    @FXML
    private CheckBox q5c;

    @FXML
    private CheckBox q5d;

    @FXML
    private Label show_1;

    @FXML
    private Label show_2;

    @FXML
    private Label show_3;

    @FXML
    private Label show_4;

    @FXML
    private Label show_5;

    @FXML
    private Label total;

    int marks = 0;

    @FXML
    void Back(ActionEvent event) {
        try {
            back.getScene().getWindow().hide();
            Stage login = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("CP.fxml"));
            Scene scene = new Scene(root);
            login.setScene(scene);
            login.show();
            login.setResizable(false);

        } catch (Exception e) {
            System.out.println(" Error signup : " + e);
        }

    }

    @FXML
    void Q1A(ActionEvent event) {
        if(q1a.isSelected()){

            show_1.setText("int $main;");
        }
    }

    @FXML
    void Q1B(ActionEvent event) {
        if(q1b.isSelected()){

            show_1.setText("int $main;");
        }
    }

    @FXML
    void Q1C(ActionEvent event) {
        if(q1c.isSelected()){

            show_1.setText("int $main;");
        }
    }

    @FXML
    void Q1D(ActionEvent event) {
        if(q1d.isSelected()){
            marks = marks + 2;

            show_1.setText("Your answer is correct");
        }

    }

    @FXML
    void Q2A(ActionEvent event) {
        if(q2a.isSelected()){

            show_2.setText("int my_num = 100000;");
        }

    }

    @FXML
    void Q2B(ActionEvent event) {
        if(q2b.isSelected()){
            marks = marks + 2;

            show_2.setText("Your answer is correct");
        }
    }

    @FXML
    void Q2C(ActionEvent event) {
        if(q2c.isSelected()){

            show_2.setText("int my_num = 100000;");
        }
    }

    @FXML
    void Q2D(ActionEvent event) {
        if(q2d.isSelected()){

            show_2.setText("int my_num = 100000;");
        }

    }

    @FXML
    void Q3A(ActionEvent event) {
        if(q3a.isSelected()){
            marks = marks + 2;

            show_3.setText("Your answer is correct");
        }

    }

    @FXML
    void Q3B(ActionEvent event) {
        if(q3b.isSelected()){

            show_3.setText("#");
        }
    }

    @FXML
    void Q3C(ActionEvent event) {
        if(q3c.isSelected()){

            show_3.setText("#");
        }
    }

    @FXML
    void Q3D(ActionEvent event) {
        if(q3d.isSelected()){

            show_3.setText("#");
        }

    }

    @FXML
    void Q4A(ActionEvent event) {
        if(q4a.isSelected()){

            show_4.setText("None of the mentioned");
        }
    }

    @FXML
    void Q4B(ActionEvent event) {
        if(q4b.isSelected()){

            show_4.setText("None of the mentioned");
        }
    }

    @FXML
    void Q4C(ActionEvent event) {
        if(q4c.isSelected()){

            show_4.setText("None of the mentioned");
        }
    }

    @FXML
    void Q4D(ActionEvent event) {
        if(q4d.isSelected()){
            marks = marks + 2;

            show_4.setText("Your answer is correct");
        }
    }

    @FXML
    void Q5A(ActionEvent event) {
        if(q5a.isSelected()){

            show_5.setText("24");
        }

    }

    @FXML
    void Q5B(ActionEvent event) {
        if(q5b.isSelected()){

            show_5.setText("24");
        }
    }

    @FXML
    void Q5C(ActionEvent event) {
        if(q5c.isSelected()){
            marks = marks + 2;

            show_5.setText("Your answer is correct");
        }
    }

    @FXML
    void Q5D(ActionEvent event) {
        if(q5d.isSelected()){

            show_5.setText("24");
        }

    }

    @FXML
    private Button view;

    @FXML
    void View(ActionEvent event){
        total.setText(Integer.toString(marks) + "/10");
    }

}

