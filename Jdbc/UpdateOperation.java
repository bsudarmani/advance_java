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
        String query="update students set stu_dept=? where stu_id=?";
        String query2="select * from students";
        Connection con=DriverManager.getConnection(url, username, password);
        while(true)
        {
        System.out.println("Enter the id");
        int stu_id=sc.nextInt();
        System.out.println("Enter the new dept name");
        String stu_dept=sc.next();
        PreparedStatement pst=con.prepareStatement(query);
        pst.setString(1,stu_dept);
        pst.setInt(2, stu_id);
        int row=pst.executeUpdate();
        if(row>0)
            System.out.println("row affected:"+row);
        else
            System.out.println("Not insert the value");
        System.out.println("do you continue(yes/no)");
        String choice=sc.next();
        if(choice.equals("no"))
            break;
        }
        System.out.println("After the update the value");
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
   
// }


