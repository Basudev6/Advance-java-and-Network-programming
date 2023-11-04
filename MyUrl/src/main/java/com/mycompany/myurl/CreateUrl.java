// write a program to create url.
package com.mycompany.myurl;

import java.net.*;
public class CreateUrl {
    public static void main (String [] args) throws MalformedURLException{
        // create a url object from individual components
        // MalformedURLException which can occur if the input URL is not valid.
        
        String protocol = "https";
        String host = "www.example.com";
        int port = 80; // default port for https is 443
        String path = "/api/date";
        
        URL url = new URL(protocol,host,port,path);
        System.out.println(url);
        
        // Access components of the URL
        
        System.out.println("Protocol: "+ url.getProtocol());
        System.out.println("Host: " +url.getHost());
        System.out.println("Path: "+ url.getPath());
     
    }
    
}
