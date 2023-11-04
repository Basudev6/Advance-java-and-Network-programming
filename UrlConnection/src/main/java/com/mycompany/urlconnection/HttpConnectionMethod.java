package com.mycompany.urlconnection;

import java.net.*;
import java.io.*;

public class HttpConnectionMethod {

    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.example.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        // set request method
        connection.setRequestMethod("GET");

        // set connection timeouts
        connection.setConnectTimeout(5000);
        connection.setReadTimeout(5000);

        // Enable/disable redirects
        connection.setInstanceFollowRedirects(false);
        //set request headers
        connection.setRequestProperty("User-Agent", "Mozilla/5.0");
        // Enable output/input
        connection.setDoOutput(true);
        connection.setDoInput(true);
        //Enable streaming mode
        connection.setChunkedStreamingMode(0);
        // set proxy

        Proxy proxy = new Proxy(Proxy.Type.HTTP,new InetSocketAddress("proxy.example.com",8080));
        
        // connect to the server
        connection.connect();
        
        // disconnect from the server
        connection.disconnect();
                
        // get server response
                
        int responseCode = connection.getResponseCode();
        InputStream in;
        if (responseCode >= 400) {
            in = connection.getErrorStream();

        } else {
            in = connection.getInputStream();
        }
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String line;
        StringBuilder response = new StringBuilder();
        while((line = reader.readLine()) !=null)
        {
            response.append(line);
        }
        reader.close();
        System.out.println("Response Code: "+responseCode);
        
        System.out.println("Response Body:"+ response.toString());
    }
}
