
// Sending message from server to client

package com.mycompany.myserver2;
import java.io.*;
import java.net.*;
public class MyServer2 {

    public static void main(String[] args) throws IOException
    {
        // create server socket
        ServerSocket serverSocket = new ServerSocket(12345);
        
        while(true){
            // wait for client to connect
            Socket clientSocket;
            clientSocket = serverSocket.accept();
            
            // get output stream to send data to client
            OutputStream outputStream;
            outputStream = clientSocket.getOutputStream();
            
            //create data output steam to write data to output stream
            
            DataOutputStream dataOutputStream;
            dataOutputStream = new DataOutputStream(outputStream);
            
            // send data to client
            String data = "Hello Client";
            dataOutputStream.writeUTF(data);
            
            // close streams and socket
            
            dataOutputStream.close();
            outputStream.close();
            clientSocket.close();
            
        }
        
    }
}
