
package com.mycompany.myurl;

import java.net.*;
public class UrlDecodeDemo {
    public static void main(String[] args) throws MalformedURLException {
        
        // construct a URL object
        String urlString = "https://www.example.com/search?q=javaprogramming";
        URL url = new URL(urlString);
        
        // Get the encoded URL string
        
        String encodedUrl = url.toString();
        
        System.out.println("Original URL:"+ urlString);
        System.out.println("Encoded URL:"+ encodedUrl);
        
    }
}
