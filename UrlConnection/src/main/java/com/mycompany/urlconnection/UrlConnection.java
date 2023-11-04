// Wap to implement url connection method.


package com.mycompany.urlconnection;

import java.net.*;
import java.io.*;
import java.util.Date;

public class UrlConnection  {

    public static void main(String[] args) throws Exception {
        
        try{
            URL url = new URL("https://youtube.com");
            URLConnection connection = url.openConnection();
            System.out.println("Content-Type: "+ connection.getContentType());
        }
        catch(MalformedURLException e)
        {
            System.err.println(e);
        }
        catch(IOException e)
        {
            System.err.println(e);
        }
      
    }
}
