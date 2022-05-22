package com.example.labproject;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class SignUP implements Initializable {

    @FXML
    private AnchorPane parentPane;

    @FXML
    private TextField Email;

    @FXML
    private Button create;

    @FXML
    private RadioButton female;

    @FXML
    private Button loginPG;

    @FXML
    private RadioButton male;

    @FXML
    private RadioButton otherG;

    @FXML
    private PasswordField pass;

    @FXML
    private TextField usname;

    @FXML
    private ToggleGroup gender;

    @FXML
    private ImageView process;

    @FXML
    void CreateID(ActionEvent event) throws SQLException {
        process.setVisible(true);
        PauseTransition pt = new PauseTransition();
        pt.setDuration(Duration.seconds(5));
        pt.setOnFinished(e -> {
            System.out.println("SignUp Sucsesful");
        });
        pt.play();


        String str = usname.getText() + ", " + pass.getText() + ", " + Email.getText() + ", " + getGender();
        try {
            FileWriter output = new FileWriter("output.txt", true);

            PrintWriter printWriter = new PrintWriter(output);
            printWriter.println(str);  //New line
            printWriter.close();

            Alert msg = new Alert(Alert.AlertType.CONFIRMATION);
            msg.setTitle(usname.getText());
            msg.setContentText("SIGNUP SUCCESSFUL");
            msg.showAndWait();

        }

        catch (FileNotFoundException e) {
            e.getStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    @FXML
    void GoToLogin(ActionEvent event) {
        try {
            loginPG.getScene().getWindow().hide();
            Stage login = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            Scene scene = new Scene(root);
            login.setScene(scene);
            login.show();
            login.setResizable(false);

        } catch (Exception e) {
            System.out.println(" Error signup : " + e);
        }

    }

    @FXML
    void Password(ActionEvent event) {

    }

    @FXML
    void UserName(ActionEvent event) {

    }

    @FXML
    void mail(ActionEvent event) {

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        process.setVisible(false);
        usname.setStyle("-fx-text-inner-color :#a0a2ab");
        pass.setStyle("-fx-text-inner-color :#a0a2ab");
        Email.setStyle("-fx-text-inner-color :#a0a2ab");

    }

    public String getGender(){
        String gen = " ";

        if(male.isSelected()){
            gen = "Male";
        }else if(female.isSelected()){
            gen = "Female";
        }else if (otherG.isSelected()){
            gen = "Other";
        }


        return gen;
    }

}
