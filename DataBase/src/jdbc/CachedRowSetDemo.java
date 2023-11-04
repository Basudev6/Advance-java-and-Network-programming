
package jdbc;
import java.sql.*;
import javax.sql.rowset.*;
public class CachedRowSetDemo {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcajava","root","");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from student");
        
        RowSetFactory rsf = RowSetProvider.newFactory();
        CachedRowSet crs = rsf.createCachedRowSet();
        crs.populate(rs);
        
        con.close();
        
        while(crs.next())
        {
            System.out.println(crs.getInt(1)+" "+ crs.getString(2)+" "+ crs.getString(3));
        }
        
    }
}
