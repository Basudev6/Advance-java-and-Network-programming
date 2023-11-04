/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.networklabreport;

import java.io.*;
import java.net.*;
public class AllHeader {
   public static void main(String[]args)
   {
       try{
           URL u = new URL("https://tufohss.edu.np");
           URLConnection uc = u.openConnection();
           for(int j=1;;j++)
           {
               String header = uc.getHeaderField(j);
               if(header==null)
                   break;
               System.out.println(uc.getHeaderFieldKey(j)+":"+header);
           }
        }
        catch(Exception e)
        {
            System.err.println(e);
        }

   }
}
