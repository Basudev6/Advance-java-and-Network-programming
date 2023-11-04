
package jdbc;

import java.sql.*;
public class SelectPreparedSt {
    public static void main(String[] args) throws Exception
    {
     Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcajava","root","");
     PreparedStatement pst = con.prepareStatement("select * from student");
     
     ResultSet rs = pst.executeQuery();
     
     while(rs.next())
     {
         System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
     }
     
     pst.close();
     con.close();
     
     
    }
}
