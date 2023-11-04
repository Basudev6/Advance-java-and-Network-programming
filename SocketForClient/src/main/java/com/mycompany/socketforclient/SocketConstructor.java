
package com.mycompany.socketforclient;


import java.io.IOException;

import java.net.*;
public class SocketConstructor {
    
    public static void main(String[] args) throws IOException {
        
        // connect to a remote server by hostname and port
        
        Socket socket1 = new Socket("www.example.com",80);
        
        // connect to a remote server by IP address and port
        InetAddress address = InetAddress.getByName("192.0.2.1");
        Socket socket2 = new Socket(address,80);
        
        //connect to a remote server with a specific local interface and port
        InetAddress localAddress = InetAddress.getByName("192.168.0.1");
        Socket socket3 = new Socket("www.example.com",80,localAddress,0);
        
        // create an unconnected socket object
        Socket socket4 = new Socket();
        
        // connect the socket to a remote server
        socket4.connect(new InetSocketAddress("www.example.com",80));
        
        // create a socket address with a hostname and port
        InetSocketAddress address1 = new InetSocketAddress("www.example.com",80);
        
        // create a socket address with an IP address and port
        InetAddress address2 = InetAddress.getByName("192.0.2.1");
        InetSocketAddress address3 = new InetSocketAddress(address2,80);
        
        // close the sockets
        socket1.close();
        socket2.close();
        socket3.close();
        socket4.close();
    
    }
}
