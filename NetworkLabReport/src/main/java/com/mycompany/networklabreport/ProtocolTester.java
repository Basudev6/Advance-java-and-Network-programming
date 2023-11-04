/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.networklabreport;

import java.net.*;
public class ProtocolTester {
    public static void main(String[] args) {
        testProtocol("http://www.adc.org");
        testProtocol("http://www.amazon.com/exec");
        testProtocol("ftp://ibiblio.org/pub/language/java/javafaq/");
        testProtocol("mailto:elharo@ibiblio.org");
        testProtocol("telnet://dibner.poly.edu/");
        testProtocol("gopher://gopher.anc.org.za/");
        
    }
    public static void testProtocol(String url)
    {
        try{
            URL u = new URL(url);
            System.out.println(u.getProtocol()+ " is supported");
        }
        catch(MalformedURLException ex)
        {
            String protocol = url.substring(0,url.indexOf(':'));
            System.out.println(protocol+" is not supported");
        }
    }
}
