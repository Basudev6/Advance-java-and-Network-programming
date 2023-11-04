
package jdbc;

import java.sql.*;
public class ScrollUpdate {
    public static void main(String[] args) throws Exception {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcajava","root","");
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery("select * from items");
            
            rs.absolute(2);
            System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getString(3));
            int inc = 20;
            int pricee = rs.getInt(2);
            String name = rs.getString(3);
            System.out.println("Previous Price:"+ pricee);
            System.out.println("Previous Name:"+name);
            rs.updateString(3, "apple");
            rs.updateInt(2,pricee +inc);
            rs.updateRow();
            
            System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getString(3));
            
            st.close();
            con.close();

    }
}
