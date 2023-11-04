/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practical;

/**
 *
 * @author Basudev
 */
import java.net.*;
import java.util.*;
public class Practical {

    
      public static void main (String [] args) throws SocketException
    {
        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
        while(interface.hasMoreElements())
            {
                
                NetworkInterface ni = interfaces.netxtElement();
                System.out.println(ni);
            }
                
    }
    
    
}
