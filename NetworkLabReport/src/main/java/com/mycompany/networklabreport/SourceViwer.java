/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.networklabreport;

import java.io.*;
import java.net.*;
public class SourceViwer {
    public static void main (String [] args)
    {
        try{
            URL u = new URL("http://www.bing.com");
            URLConnection uc = u.openConnection();
            InputStream stream = uc.getInputStream();
            BufferedInputStream buffer = new BufferedInputStream(stream);
            InputStreamReader reader = new InputStreamReader(buffer);
            int c;
            while((c=reader.read())!=-1)
            {
                System.out.print((char)c);
            }
            
            
        }
        catch(IOException ex)
        {
            System.err.println(ex);
        }
    }
}
