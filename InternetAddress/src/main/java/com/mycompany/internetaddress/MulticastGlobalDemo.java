
package com.mycompany.internetaddress;

import java.net.*;
public class MulticastGlobalDemo {
    public static void main(String[] args) {
        try{
            
//             InetAddress address = InetAddress.getByName("FF0E::1");
//                if(address.isMCGlobal())
//                {
//                    System.out.println("The address is a Multicast Global address");
//                }
//                else
//                {
//                    System.out.println("The address is not a Multicast Global address");
//                }

//                InetAddress address = InetAddress.getByName("FF02::1");
//                if(address.isMCLinkLocal())
//                {
//                    System.out.println("The address is a Multicast Link Local address");
//                }
//                else
//                {
//                    System.out.println("The address is not a Multicast Link Local address");
//                }

//                InetAddress address = InetAddress.getByName("FF01::FF");
//                if(address.isMCNodeLocal())
//                {
//                    System.out.println("The address is a Multicast Node Local address");
//                }
//                else
//                {
//                    System.out.println("The address is not a Multicast Node Local address");
//                }
                
//                InetAddress address = InetAddress.getByName("FF08::1");
//                if(address.isMCOrgLocal())
//                {
//                    System.out.println("The address is a Multicast organization Local address");
//                }
//                else
//                {
//                    System.out.println("The address is not a Multicast organization Local address");
//                }
                    
//               InetAddress address = InetAddress.getByName("FF05::1");
//                if(address.isMCSiteLocal())
//                {
//                    System.out.println("The address is a Multicast site Local address");
//                }
//                else
//                {
//                    System.out.println("The address is not a Multicast site Local address");
//                }

                InetAddress address = InetAddress.getByName("224.10.10.20");
                if(address.isMulticastAddress())
                {
                    System.out.println("The address is a Multicast address");
                }
                else
                {
                    System.out.println("The address is not a Multicast address");
                }
                   
        }
        catch(UnknownHostException e)
        {
            System.err.println(e);
        }             
    }
}
