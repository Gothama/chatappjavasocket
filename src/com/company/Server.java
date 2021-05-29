package com.company;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
	// write your code here
        System.out.println("Server is running");
        ServerSocket serverSocket = new ServerSocket(6002);
        System.out.println("Server socket created");
        Socket client = serverSocket.accept();
        System.out.println("Server accepted a client");

       //receive data
        InputStream inputStream = client.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        DataOutputStream dataOutputStream = new DataOutputStream(client.getOutputStream());

        //continuous reading data from the client
        String inputData;
        while((inputData = bufferedReader.readLine())!=null){
            System.out.println("Client says: " + inputData);
            switch (inputData){
                case "Hello from the client":
                    dataOutputStream.writeBytes("Hello from the server \n");
                    break;
                case "How are you?":
                    dataOutputStream.writeBytes("Im fine how are you \n");
                    break;

                case "I am fine":
                    dataOutputStream.writeBytes("Okay good to know \n");
                    break;

                case "Thank you":
                    dataOutputStream.writeBytes("You are welcome \n");
                    break;

                default:
                    dataOutputStream.writeBytes("I didnt understand \n");
            }

            if(inputData.equals("exit")){
                break;
            }
        }
        //send some data to client

        /*DataOutputStream dataOutputStream = new DataOutputStream(client.getOutputStream());
        dataOutputStream.writeBytes("Hello from the server \n");*/

        client.close();
    }
}
