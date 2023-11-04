// Sending message from client to server

package com.mycompany.myserver;
import java.io.*;
import java.net.*;

public class MyClient {
    public static void main(String[] args) {
        try{
            Socket s;
            s = new Socket("localhost",6666);
            DataOutputStream dout;
            dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF(("Hello Server"));
            dout.flush();
            dout.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
