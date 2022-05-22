package com.example.labproject;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

public class Storage {

    public static ArrayList<Storage> storage = new ArrayList<>();

    private static String Name;
    private static String Gender;
    private static String Email;
    private static String password;
    private static String Progress;

    public Storage(String Name, String Gender, String Email, String password){
        this.Name = Name;
        this.Gender = Gender;
        this.Email = Email;
        this.password = password;

    }


    // This is how u should do it but u can also make field public and use them directly
    // for example -> 'Public static String Name' then use it as 'Storage.name'

    public static String getName() {
        return Name;
    }
    public static void setName(String name) {
        Name = name;
    }


    public static String getGender() {
        return Gender;
    }
    public static void setGender(String gender) {
        Gender = gender;
    }
    public static String getEmail() {
        return Email;
    }
    public static void setEmail(String email) {
        Email = email;
    }


    public static String getPassword() {
        return password;
    }
    public static void setPassword(String password) {
        Storage.password = password;
    }

    public static String getProgress() {
        return Progress;
    }
    public static void setProgress(String progress) {
        Progress = progress;
    }

    public Storage(Socket sc) throws IOException {
        DataInputStream reader = new DataInputStream(sc.getInputStream());

        String Name= reader.readUTF();
        String Gender = reader.readUTF();
        String Email = reader.readUTF();
        String password = reader.readUTF();

        reader.close();

    }
}