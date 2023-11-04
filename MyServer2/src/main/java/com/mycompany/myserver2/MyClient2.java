 // Sending message from server to client
package com.mycompany.myserver2;

import java.io.*;
import java.net.*;
public class MyClient2 {
    public static void main(String[] args) throws IOException 
    {
        
        // create socket to connect to server
        Socket socket;
        socket= new Socket("localhost",12345);
        
        // get input stream to receive data from server
        InputStream inputStream;
        inputStream = socket.getInputStream();
        
        // create data input stream to read data from input stream
        DataInputStream dataInputStream;
        dataInputStream = new DataInputStream(inputStream);
        
        // receive data from server
        
        String data = dataInputStream.readUTF();
        System.out.println("Received data from server:"+ data);
        
        // close streams and sockets
        dataInputStream.close();
        inputStream.close();
        socket.close();        
    }
}
