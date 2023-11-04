
package jdbc;

import java.sql.*;
public class InsertDemo {
    public static void main(String[] args) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcajava", "root", "");
        Statement st = con.createStatement();
        int a = st.executeUpdate("insert into student values(3,'kamal','Pokhara')");
        
        System.out.println(a+ " row is inserted");
        
        st.close();
        con.close();
        
    }
}
