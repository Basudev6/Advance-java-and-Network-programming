// To find the ip address of the local machine
package com.mycompany.internetaddress;

import java.net.*;

public class GetLocalIpAddress {
    public static void main(String [] args)
    {
        try{
            // Get the local IP address
            InetAddress localAddress = InetAddress.getLocalHost();
            System.out.println("Local IP Address:"+ localAddress.getHostAddress());
        }
        catch(UnknownHostException e)
        {
            System.err.println("Error getting local Ip address:"+ e.getMessage());
        }
    }
    
}
