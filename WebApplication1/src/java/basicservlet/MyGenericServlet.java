
package basicservlet;

import javax.servlet.*;
import java.io.*;
public class MyGenericServlet extends GenericServlet{
    
        public void service(ServletRequest request,ServletResponse response) throws ServletException,IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<html><body>");
        out.println("This is my web app using Generic Servlet");
        out.println("</body></html>");
        out.close();
    }
    
}
