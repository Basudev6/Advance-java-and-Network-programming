
package com.mycompany.internetaddress;

import java.net.*;
public class HostName {
    public static void main(String[] args) {
        try{
            // create  a new InetAddress object representing an Ip address
            InetAddress address = InetAddress.getByName("www.youtube.com");
            System.out.println("Ip address:"+ address.getHostAddress());
            
            // Create a new InetAddress object representing a hostname
            
            InetAddress address2 = InetAddress.getByName("142.250.195.142");
            System.out.println("Hostname:"+ address2.getHostName());
        }
        catch(UnknownHostException e)
        {
            System.err.println("Error creating InetAddress"+ e.getMessage());
        }
    }
}
