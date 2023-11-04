/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.networklabreport;

import java.net.*;
import java.util.*;
public class InterfaceLister {
    public static void main (String [] args) throws SocketException
    {
        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
        while(interfaces.hasMoreElements())
            {
                
                NetworkInterface ni = interfaces.nextElement();
                System.out.println(ni);
            }
                
    }
    
}
