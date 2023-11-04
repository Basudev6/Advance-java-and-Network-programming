
package jdbc;

import java.sql.*;

public class InsertPreparedSt {
        public static void main(String[] args) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcajava", "root", "");
        PreparedStatement pst = con.prepareStatement("insert into student values(?,?,?)");
        
        pst.setInt(1,10);
        pst.setString(2,"Ram");
        pst.setString(3, "Kathmandu");
        
        pst.executeUpdate();
        
        pst.close();
        con.close();
        
    }
}
