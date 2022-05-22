package com.example.labproject;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args){
        try {
            ServerSocket server = new ServerSocket(6666);
            System.out.println("Connected to server");

            while (true) {
                Socket sc = server.accept();
                Storage storages = new Storage(sc);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}