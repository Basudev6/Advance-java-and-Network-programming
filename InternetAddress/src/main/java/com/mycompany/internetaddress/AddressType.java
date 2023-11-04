
package com.mycompany.internetaddress;

import java.net.*;
public class AddressType {
    public static void main(String[] args)
    {
        try{
    
////            InetAddress address = InetAddress.getByName("0.0.0.0");
////            InetAddress address = InetAddress.getByName("169.254.0.1");
//              InetAddress address = InetAddress.getByName("FF0E::1");
//            if(address.isAnyLocalAddress()){
//                System.out.println("The address is the 'any' local address");
//            }
//            else{
//                System.out.println("The address is not the 'any' local  address");
//            }

                InetAddress address = InetAddress.getByName("127.0.0.1");
                if(address.isLoopbackAddress())
                {
                    System.out.println("The address is a loopback address");
                }
                else
                {
                    System.out.println("The address is not a loopback address");
                }
        }
        catch(UnknownHostException e)
        {
            System.out.println("Invalid address");
        }
    }
}
