package com.company;

import java.io.*;
import java.net.Socket;

public class ChatClient {
    public static void main(String[] args) throws IOException {
        // write your code here
       /* System.out.println("Client is running");
        Socket socket = new Socket("localhost" , 6002);

        //InputStream , OutputStream
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        dataOutputStream.writeBytes("Hello 1 from the client \n");
        dataOutputStream.writeBytes("Hello 2 from the client \n");
        dataOutputStream.writeBytes("Hello 3 from the client \n");
        dataOutputStream.writeBytes("Hello 4 from the client \n");
        dataOutputStream.writeBytes("Hello 5 from the client \n");
        dataOutputStream.writeBytes("exit\n");

        //Get Data from the server
       InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String recievedData = bufferedReader.readLine();
        System.out.println("Data recieved from the server: " + recievedData);*/

       Client client = new Client();
       client.start();
       client.sendMessage("Hello from the client");
        client.sendMessage("How are you?");
        client.sendMessage("I am fine");
        client.sendMessage("Thank you");
        client.sendMessage("exit");
       //send data to the server



        System.out.println("Client finished the execution");

    }
}
