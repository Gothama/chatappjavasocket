package com.company.client;

import java.io.IOException;
import java.util.Scanner;

public class ChatClient3 {
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


        Scanner j = new Scanner(System.in);
        String h;
        do{
            h = j.nextLine();
            client.sendMessage(h);
        }
        while(!h.equals("exit"));



        System.out.println("Client finished the execution");

    }
}
