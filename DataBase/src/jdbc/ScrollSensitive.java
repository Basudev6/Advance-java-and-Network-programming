
package jdbc;

import java.sql.*;
public class ScrollSensitive {
    public static void main(String[] args) throws Exception {
       
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcajava","root","");
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery("select * from student");
            
            rs.absolute(2);
            System.out.println(rs.getRow());
            
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            
            rs.first();
            System.out.println(rs.getRow());
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+ rs.getString(3));
            
            st.close();
            con.close();

    }
}
