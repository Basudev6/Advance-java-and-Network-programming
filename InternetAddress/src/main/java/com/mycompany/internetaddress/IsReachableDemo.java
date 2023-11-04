
package com.mycompany.internetaddress;

import java.net.*;
import java.io.*;
public class IsReachableDemo {
    public static void main(String[] args) {
        try{
            InetAddress address = InetAddress.getByName("www.google.com");
            boolean reachable = address.isReachable(5000);
            if(reachable)
            {
                System.out.println("The host is reachable");
            }
            else
            {
                System.out.println("The host is not reachable");
            }
        }
        catch(IOException e){
            System.out.println("Error occured:"+ e.getMessage());
        }
    }
    
}
