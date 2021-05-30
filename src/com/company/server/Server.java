package com.company.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException, InterruptedException { //main thread
	// write your code here
        System.out.println("Server is running");
        ServerSocket serverSocket = new ServerSocket(6002);
        System.out.println("Server socket created");
    int k=0;
        while(k<=1) {
            k++;
            Socket client = serverSocket.accept();
            System.out.println("Server accepted a client");
            ClientHandler clientHandler = new ClientHandler(client);
            Thread thread = new Thread(clientHandler);
            thread.start();
        }
        System.out.println("Sorry only a maximum of 2 Clients can connect to this server");
    }
}
