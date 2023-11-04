
package CookiesDemo;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class FirstServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("un");
       
        Cookie ck = new Cookie("n",name);
        response.addCookie(ck);
        
        
        out.println("<html><body>");
        out.println("<form action='SecondServlet' method='post'>");
        out.println("<input type='submit' value='go'>");
        out.println("</form>");
        out.println("</body></html>");
        out.close();
     
        
    }
    
}
