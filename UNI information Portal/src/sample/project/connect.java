
package sample.project;
import java.sql.*;
/**
 *
 * @author yash tonger
 */
public class connect {
    
    Connection c;
    Statement s;
    
    connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql://localhost:3306/unimanagement","root","Qwerty@123");
            s=c.createStatement();
            
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
