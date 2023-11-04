
package com.mycompany.myurl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.net.URLConnection;

public class Authentication {
    public static void main(String[] args) throws Exception {
        String username = "myUsername";
        String password = "myPassword";
        Authenticator.setDefault(new Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(username,password.toCharArray());
                
                
            }
        });
        
        // create url and open connection
        
        URL url = new URL ("http://example.com");
        URLConnection connection = url.openConnection();
        
        try(//Read the response
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream())))
        {
            String line;
            while((line=reader.readLine())!=null)
            {
                System.out.println(line);   
            }
        }
        
    }
    
}
