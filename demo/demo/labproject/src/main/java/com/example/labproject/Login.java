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
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ResourceBundle;
import java.util.Scanner;

import static javafx.scene.control.Alert.*;

public class Login implements Initializable, Runnable {

    @FXML
    private Label loginmsg;

    @FXML
    private Button forgot;

    @FXML
    private Button in;

    @FXML
    private AnchorPane main;

    @FXML
    private PasswordField pass;

    @FXML
    private CheckBox remember;

    @FXML
    private Button sgup;

    @FXML
    private TextField usnm;

    @FXML
    private ImageView progress;

    @FXML
    void SignUp(ActionEvent event) {
        try {

            in.getScene().getWindow().hide();
            Stage signup = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("Sign UP.fxml"));
            Scene scene = new Scene(root);
            signup.setScene(scene);
            signup.show();
            signup.setResizable(false);

        } catch (Exception e) {
            System.out.println(" Error signup : " + e);
        }
    }


    @FXML
    void checkbox(ActionEvent event) {

    }

    @FXML
    void forgotpass(ActionEvent event) {

    }

    @FXML
    void login(ActionEvent event) throws IOException {

        progress.setVisible(true);
        PauseTransition pt = new PauseTransition();
        pt.setDuration(Duration.seconds(5));
        pt.setOnFinished(e -> {
            System.out.println("Login Sucsesful");
        });
        pt.play();


        Path path = Paths.get("output.txt");
        Path path1 = Paths.get("progress.txt");

        //Counts number of line in text file
        long count = Files.lines(path).count();
        long count1 = Files.lines(path1).count();

        /// read each line
        for (int i = 0; i < count; i++)
        {
            for (int u = 0; u < count1; u++){
                String line1 = Files.readAllLines(path1).get(u);
                if(!line1.trim().equals("")){
                    String[] profile1= line1.split(",");
                    String progress = profile1[0];
                    Storage.setProgress(progress);
                }
            }
            String line = Files.readAllLines(path).get(i);

            if(!line.trim().equals("")) {

                //According to format Name, Email, Password, Age, Gender
                String[] profile = line.split(",");

                String name = profile[0];
                String password = profile[1];
                String email = profile[2];
                String gender = profile[3];

                //Email Matched!

                if (name.trim().equals(usnm.getText())) { //Note trim() method remove space from front and behind of string if there is any
                    //Now checking if password match
                    if (password.trim().equals(pass.getText())) {

                        Alert msg = new Alert(AlertType.CONFIRMATION);
                        msg.setTitle(usnm.getText());
                        msg.setContentText("Username and password matched");
                        msg.showAndWait();

                        //Store values
                        Storage.setName(name);
                        Storage.setPassword(password);
                        Storage.setEmail(email);
                        Storage.setGender(gender);

                        run();

                        break; //Email match and pass match, Close loop

                    }
                }
            }
        }

        if(Storage.getName() == null) {
            System.out.println("No such email");

            Alert msg = new Alert(AlertType.ERROR);
            msg.setTitle(usnm.getText());
            msg.setContentText("No such Email : " +usnm.getText());
            msg.showAndWait();

        } else if (Storage.getPassword() == null){
            System.out.println("No such username");

            Alert msg = new Alert(AlertType.ERROR);
            msg.setTitle(usnm.getText());
            msg.setContentText("Wrong password");
            msg.showAndWait();
        }

    }

    private void openWindow()
    {
        System.out.println("Profile open");

        try {
            in.getScene().getWindow().hide();
            Stage signup = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
            Scene scene = new Scene(root);
            signup.setScene(scene);
            signup.show();
            signup.setResizable(false);



        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(" Error signup : " + e);
        }


    }


    @FXML
    void password(ActionEvent event) {

    }

    @FXML
    void username(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        progress.setVisible(false);
        usnm.setStyle("-fx-text-inner-color :#23766E");
        pass.setStyle("-fx-text-inner-color :#23766E");

    }

    @Override
    public void run() {
        if (Storage.storage.isEmpty()) {
            Socket sc = null;
            try {
                sc = new Socket("localhost", 6666);
                DataOutputStream writer = new DataOutputStream(sc.getOutputStream());

                if (sc.isConnected()) {
                    System.out.println("Connected");

                    writer.writeUTF(Storage.getName());
                    writer.writeUTF(Storage.getGender());
                    writer.writeUTF(Storage.getEmail());
                    writer.writeUTF(Storage.getPassword());
                    writer.flush();

                    openWindow();
                    //open login window
                    //openWindow();

                    writer.close();
                    sc.close();

                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
