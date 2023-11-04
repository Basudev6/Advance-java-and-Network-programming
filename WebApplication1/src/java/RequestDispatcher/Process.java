
package RequestDispatcher;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Process extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("un");
        
        if(name.equals("ram"))
        
        
    }
}
