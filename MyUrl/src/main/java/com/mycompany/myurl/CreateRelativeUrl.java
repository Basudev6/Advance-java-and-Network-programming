
package com.mycompany.myurl;

import java.net.*;
public class CreateRelativeUrl {
    public static void main(String [] args) throws MalformedURLException{
        // define a base url
        URL baseURL = new URL("https://www.example.com/api/");
        
        // define a relative url
        String relativeURL = "data?param1=value1&param2=value2#section1";
        
        // Resolve the relative URL with respect to the base URL
        URL resolvedURL = new URL(baseURL,relativeURL);
        
        // Get the absolute URL
        
        String absoluteURL = resolvedURL.toString();
        System.out.println("Resolved URL: "+ absoluteURL);
        
    }
    
}
