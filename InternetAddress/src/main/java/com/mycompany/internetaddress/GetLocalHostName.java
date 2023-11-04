
package com.mycompany.internetaddress;

import java.net.*;
public class GetLocalHostName {
    public static void main(String[] args) {
        try{
            //Get the local host name
            String hostName = InetAddress.getLocalHost().getHostName();
            System.out.println("Local host name:"+ hostName);
            
        }
        catch(UnknownHostException e)
        {
            System.err.println("Error getting local host name"+ e.getMessage());
        }
    }
    
}
