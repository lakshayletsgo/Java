package Online_Bank;
import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try {
             c = DriverManager.getConnection("jdbc:mysql:///bankManagementSystem","root","Lakshay@123_");
            s = c.createStatement();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
