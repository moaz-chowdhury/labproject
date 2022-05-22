package com.example.labproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class c_learning {

    @FXML
    private Button about_c;

    @FXML
    private Label label;

    @FXML
    private Button back;

    @FXML
    private ProgressBar bar;

    @FXML
    private CheckBox cb1;

    @FXML
    private CheckBox cb2;

    @FXML
    private CheckBox cb03;

    @FXML
    private CheckBox cb4;

    @FXML
    private CheckBox cb5;

    @FXML
    private CheckBox cb6;

    @FXML
    private CheckBox cb7;

    @FXML
    private CheckBox cb8;

    double points;
    double point;

    @FXML
    private Button test;

    @FXML
    void About_C(ActionEvent event) {
        try {
            about_c.getScene().getWindow().hide();
            Stage login = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("about_c.fxml"));
            Scene scene = new Scene(root);
            login.setScene(scene);
            login.show();
            login.setResizable(false);

        } catch (Exception e) {
            System.out.println(" Error signup : " + e);
        }

    }

    @FXML
    void Test(ActionEvent event) {
        try {
            test.getScene().getWindow().hide();
            Stage login = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("c_test.fxml"));
            Scene scene = new Scene(root);
            login.setScene(scene);
            login.show();
            login.setResizable(false);

        } catch (Exception e) {
            System.out.println(" Error signup : " + e);
        }
    }

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
    void Bar(MouseEvent event) {

    }

    @FXML
    void CB1(ActionEvent event) {
        if(cb1.isSelected()){
            points = points + 0.125;
            bar.setProgress(points);
            point = point + 12.5;
            label.setText(Double.toString(point) + "%");


            String c1 = label.getText();
            try {
                FileWriter output = new FileWriter("progress.txt");

                PrintWriter printWriter = new PrintWriter(output);
                printWriter.println(c1);  //New line
                printWriter.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            points = points - 0.125;
            bar.setProgress(points);
            point = point - 12.5;
            label.setText(Double.toString(point) + "%");
        }
    }

    @FXML
    void CB2(ActionEvent event) {
        if(cb2.isSelected()){
            points = points + 0.125;
            bar.setProgress(points);
            point = point + 12.5;
            label.setText(Double.toString(point) + "%");

            String c1 = label.getText();
            try {
                FileWriter output = new FileWriter("progress.txt");

                PrintWriter printWriter = new PrintWriter(output);
                printWriter.println(c1);  //New line
                printWriter.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            points = points - 0.125;
            bar.setProgress(points);
            point = point - 12.5;
            label.setText(Double.toString(point) + "%");
        }
    }

    @FXML
    void CB03(ActionEvent event) {
        if(cb03.isSelected()){
            points = points + 0.125;
            bar.setProgress(points);
            point = point + 12.5;
            label.setText(Double.toString(point) + "%");

            String c1 = label.getText();
            try {
                FileWriter output = new FileWriter("progress.txt");

                PrintWriter printWriter = new PrintWriter(output);
                printWriter.println(c1);  //New line
                printWriter.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            points = points - 0.125;
            bar.setProgress(points);
            point = point - 12.5;
            label.setText(Double.toString(point) + "%");
        }
    }

    @FXML
    void CB4(ActionEvent event) {
        if(cb4.isSelected()){
            points = points + 0.125;
            bar.setProgress(points);
            point = point + 12.5;
            label.setText(Double.toString(point) + "%");

            String c1 = label.getText();
            try {
                FileWriter output = new FileWriter("progress.txt");

                PrintWriter printWriter = new PrintWriter(output);
                printWriter.println(c1);  //New line
                printWriter.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            points = points - 0.125;
            bar.setProgress(points);
            point = point - 12.5;
            label.setText(Double.toString(point) + "%");
        }
    }

    @FXML
    void CB5(ActionEvent event) {
        if(cb5.isSelected()){
            points = points + 0.125;
            bar.setProgress(points);
            point = point + 12.5;
            label.setText(Double.toString(point) + "%");

            String c1 = label.getText();
            try {
                FileWriter output = new FileWriter("progress.txt");

                PrintWriter printWriter = new PrintWriter(output);
                printWriter.println(c1);  //New line
                printWriter.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            points = points - 0.125;
            bar.setProgress(points);
            point = point - 12.5;
            label.setText(Double.toString(point) + "%");
        }
    }

    @FXML
    void CB6(ActionEvent event) {
        if(cb6.isSelected()){
            points = points + 0.125;
            bar.setProgress(points);
            point = point + 12.5;
            label.setText(Double.toString(point) + "%");

            String c1 = label.getText();
            try {
                FileWriter output = new FileWriter("progress.txt");

                PrintWriter printWriter = new PrintWriter(output);
                printWriter.println(c1);  //New line
                printWriter.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            points = points - 0.125;
            bar.setProgress(points);
            point = point - 12.5;
            label.setText(Double.toString(point) + "%");
        }
    }

    @FXML
    void CB7(ActionEvent event) {
        if(cb7.isSelected()){
            points = points + 0.125;
            bar.setProgress(points);
            point = point + 12.5;
            label.setText(Double.toString(point) + "%");

            String c1 = label.getText();
            try {
                FileWriter output = new FileWriter("progress.txt");

                PrintWriter printWriter = new PrintWriter(output);
                printWriter.println(c1);  //New line
                printWriter.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            points = points - 0.125;
            bar.setProgress(points);
            point = point - 12.5;
            label.setText(Double.toString(point) + "%");
        }
    }

    @FXML
    void CB8(ActionEvent event) {
        if(cb8.isSelected()){
            points = points + 0.125;
            bar.setProgress(points);
            point = point + 12.5;
            label.setText(Double.toString(point) + "%");

            String c1 = label.getText();
            try {
                FileWriter output = new FileWriter("progress.txt");

                PrintWriter printWriter = new PrintWriter(output);
                printWriter.println(c1);  //New line
                printWriter.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            points = points - 0.125;
            bar.setProgress(points);
            point = point - 12.5;
            label.setText(Double.toString(point) + "%");
        }
    }

}
