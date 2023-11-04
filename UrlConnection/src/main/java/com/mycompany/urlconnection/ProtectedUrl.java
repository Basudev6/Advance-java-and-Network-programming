
package com.mycompany.urlconnection;

import java.net.*;
import java.io.*;
public class ProtectedUrl {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://www.youtube.com");
            URLConnection conn = url.openConnection();
            
            // set doInput and doOutput to true
            
            conn.setDoInput(true);
            conn.setDoOutput(true);
            
            // check if the connection has been established
            if(!conn.getDoInput()|| !conn.getDoOutput())
            {
                System.out.println("Error:connection not established");
            }
            
            // set ifModifiedSince to the current time
            conn.setIfModifiedSince(System.currentTimeMillis());
            
            // check if the connection useds caching
            if(!conn.getUseCaches()){
                System.out.println("Caching is not enabled");
                
          
            }
            // print out the URL object associated with the connection
            
            System.out.println("URL: "+conn.getURL());
            
            
        }
        catch(MalformedURLException e)
        {
            e.printStackTrace();
            
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
