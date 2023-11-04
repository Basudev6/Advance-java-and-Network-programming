
package com.mycompany.networklabreport;

import java.net.URI;
public class ResolveURL {
    public static void main(String[] args) throws Exception {
        String uribase = "https://www.test.org/";
        String urirelative = "languages/../java";
        URI uriBase = new URI(uribase);
        System.out.println("Base URL= "+uriBase.toString());
        URI uriRelative = new URI(urirelative);
        System.out.println("Relative URL= "+uriRelative.toString());
        
        URI uriResolved = uriBase.resolve(uriRelative);
        System.out.println("Resolved URI="+uriResolved.toString());
    }
   
}
