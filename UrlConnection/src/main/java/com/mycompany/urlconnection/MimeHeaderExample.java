
package com.mycompany.urlconnection;

import java.net.*;
import java.io.*;
public class MimeHeaderExample {
    public static void main(String[] args) throws Exception{
        URL url = new URL("https://youtube.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        
        int responseCode = connection.getResponseCode();
        String contentType = connection.getHeaderField("Content-Type");
        String contentEncoding = connection.getHeaderField("Content-Encoding");
        String contentDisposition = connection.getHeaderField("Content-Disposition");
        
        System.out.println("Response Code: "+ responseCode);
        System.out.println("Content-Type: "+ contentType);
        System.out.println("Content-Encoding: "+ contentEncoding);
        System.out.println("Content-Disposition: "+contentDisposition);
        connection.disconnect();
        
        
    }
}
