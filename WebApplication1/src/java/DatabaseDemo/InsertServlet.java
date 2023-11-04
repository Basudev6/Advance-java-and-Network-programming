package DatabaseDemo;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class InsertServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("un");
        String address = request.getParameter("address");
  

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcajava", "root", "");
            PreparedStatement pst = con.prepareStatement("insert into student value(?,?,?)");

            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setString(3, address);

            int a = pst.executeUpdate();
            out.println(a+" Row is inserted");

            pst.close();
            con.close();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
       
    }
}
