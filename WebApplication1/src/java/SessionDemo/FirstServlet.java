/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SessionDemo;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class FirstServlet extends HttpServlet {
     public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("un");
       
        
        out.println("<html><body>");
        out.println("<form action='SecondServlet' method='post'>");
        out.println("<input type='submit' value='go'>");
        out.println("</form>");
        out.println("</body></html>");
        out.close();
        
        HttpSession session =request.getSession();
        session.setAttribute("n",name);
        
       
    }
    
}
