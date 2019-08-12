import java.sql.*;
import java.io.*;
public class new1 {

public static void main(String[] args) {
    // TODO Auto-generated method stub
    try
    {  
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection(  
        "jdbc:mysql://localhost:3306/bedrock","root","password");  

        Statement stmt=con.createStatement();  
        ResultSet rs=stmt.executeQuery("select * from student");  
        while(rs.next())  
        System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5));  
        con.close();
    }

    catch(Exception e)
    {
        System.out.println(e);
    }

        }  

}


