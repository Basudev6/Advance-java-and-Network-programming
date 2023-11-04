
package jdbc;

import java.sql.*;
public class UpdatePreparedSt {
    public static void main(String[] args) throws Exception 
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcajava", "root", "");
        PreparedStatement pst = con.prepareStatement("update student set name=?,address=? where id=?");
        
        pst.setInt(3,1);
        pst.setString(1,"Ram");
        pst.setString(2, "Kathmandu");
        
        pst.executeUpdate();
        
        pst.close();
        con.close();
    }
}
