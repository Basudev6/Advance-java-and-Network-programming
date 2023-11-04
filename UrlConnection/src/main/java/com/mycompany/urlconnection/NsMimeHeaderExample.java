
package com.mycompany.urlconnection;

import java.net.*;
import java.io.*;
public class NsMimeHeaderExample {
    public static void main(String[] args) throws Exception{
        URL url = new URL("http://example.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: "+ responseCode);
        String acceptRange = connection.getHeaderField("Accept-Ranges"); // it represent address and time to accept
        System.out.println("Accept-Ranges: "+ acceptRange); 
        String vary = connection.getHeaderField("vary"); // vary client server
        System.out.println("Vary: "+vary);
        String cachedControl = connection.getHeaderField("Cache-Control");
        System.out.println("Cache-Control: "+ cachedControl);
        String server = connection.getHeaderField("Server");
        System.out.println("Server: "+ server);
        
     
    }
    
}
