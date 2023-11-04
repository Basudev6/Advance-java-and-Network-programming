
package SessionDemo;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class SecondServlet extends HttpServlet {
     public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
     {
         
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
         
         HttpSession session = request.getSession();
         String name = (String)session.getAttribute("n");
         out.println("Welcome "+name);
     }
    
}
