//Wap to show the ip address type of the given address

package com.mycompany.internetaddress;

import java.net.*;
public class IpAddressType {

    public static void main(String[] args) {
        try{
            // Get the local IP address
            InetAddress IpAddress = InetAddress.getLocalHost();
            
            //Determine whether the IP address is IPv4 or IPv6
            if(IpAddress instanceof Inet4Address){
                System.out.println("Local Ip address is IPv4 "+ IpAddress.getHostAddress());
            }
            else if(IpAddress instanceof Inet6Address){
                System.out.println("Local Ip address is IPv6 "+ IpAddress.getHostAddress());
            }
            else{
                System.out.println("Local Ip address format is unknown");
            }
        }
        catch(UnknownHostException e)
        {
            System.err.println("Error getting local IP address: "+e.getMessage());
        }
    }
}
