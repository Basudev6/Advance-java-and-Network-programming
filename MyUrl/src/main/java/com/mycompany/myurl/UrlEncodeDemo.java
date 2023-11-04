
package com.mycompany.myurl;

import java.io.UnsupportedEncodingException;
import java.net.*;
public class UrlEncodeDemo {
    public static void main(String[] args) throws MalformedURLException,UnsupportedEncodingException {
        
            
       
        // Define key-value pairs
        String key1= "param1";
        String value1 = "value1";
        String key2 = "param2";
        String value2 = "value2";
        
        // Create StringBuilder object
        StringBuilder stringBuilder= new StringBuilder();
        
        // Append key-value pairs
        stringBuilder.append(URLEncoder.encode(key1,"UTF-8"));
        stringBuilder.append("=");
        stringBuilder.append(URLEncoder.encode(value1, "UTF-8"));
        stringBuilder.append("&");
        stringBuilder.append(URLEncoder.encode(key2, "UTF-8"));
        stringBuilder.append("=");
        stringBuilder.append(URLEncoder.encode(value2, "UTF-8"));
        
        // Get encoded string
        
        String encodedData = stringBuilder.toString();
        System.out.println("x-www-form-urlencoded data:"+ encodedData);
       
        
        
    }
    
}
