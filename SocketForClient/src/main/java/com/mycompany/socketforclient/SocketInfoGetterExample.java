
package com.mycompany.socketforclient;
import java.io.IOException;
import java.net.Socket;
public class SocketInfoGetterExample {
    public static void main(String [] args) throws IOException
    {
        Socket socket = new Socket("www.google.com",80);
        System.out.println("Remote IP address: "+ socket.getInetAddress());
        System.out.println("Remote port number: "+ socket.getPort());
        System.out.println("Local IP address: "+ socket.getLocalAddress());
        System.out.println("Local port number: "+ socket.getLocalPort());
        System.out.println("SO_TIMEOUT value: "+ socket.getSoTimeout());
        System.out.println("SO_KEEPALIVE enable: "+ socket.getKeepAlive());
        System.out.println("TCP_NODELY enable: "+ socket.getTcpNoDelay());
        System.out.println("SO_REUSEADDR enable: "+ socket.getReuseAddress());
        System.out.println("SO_OOBINLINE enable: "+ socket.getOOBInline());
        socket.close();
    }

}
