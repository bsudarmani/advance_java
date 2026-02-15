import java.util.*;
import java.io.*;
import java.sql.*;

public class MySqlExample {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
      try
      {
        Class.forName("com.mysql.jdbc.Driver");
        final String url="jdbc:mysql://localhost:3306/jdbc";
        final String username="root";
        String password="";
        String query2="select * from students";
        Connection con=DriverManager.getConnection(url, username, password);
        ResultSet s=con.createStatement().executeQuery(query2);
        System.out.println("Stu_id\tstu_name\tstu_dept");
        System.out.println("----------------------------");
        while(s.next())
        {
        
        System.out.println(s.getInt(1)+"  \t  "+ s.getString(2)+"  \t  "+s.getString(3));
        }
        con.close();
      }
      catch(ClassNotFoundException | SQLException e)
      {
        System.out.println("database is not connected");
      }
    }
   
}


