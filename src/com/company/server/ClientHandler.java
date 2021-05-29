package com.company.server;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientHandler implements Runnable{
    private Socket client;

    public ClientHandler(Socket socket) {

        this.client = socket;
    }
    @Override
    public void run(){
        try {
            //Thread.sleep(30000);
            //receive data
            InputStream inputStream = client.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            DataOutputStream dataOutputStream = new DataOutputStream(client.getOutputStream());
            Scanner l = new Scanner(System.in);
            String k;
            //continuous reading data from the client
            String inputData;
            while ((inputData = bufferedReader.readLine()) != null) {
                System.out.println("Client says: " + inputData);
                 /*switch (inputData) {
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
                }*/



                if (inputData.equals("exit")) {
                    dataOutputStream.writeBytes("Bye Cu \n");
                    break;
                }
                k = l.nextLine();
                System.out.println("Server says: " + k );
                dataOutputStream.writeBytes(k +" \n");
            }

            client.close();
        } catch (IOException  e) {
            e.printStackTrace();
        }

    }
}
