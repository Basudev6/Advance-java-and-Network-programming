
package basicservlet;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class MyHttpServlet extends HttpServlet {
    
   
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("un");
        
        out.println("<html><body>");
        out.println("Hello "+ name);
        out.println("</body></html>");
        out.close();
    }
	
     
}
