//import java.util.*;
//import java.io.*;
//import java.sql.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//    try
//    {
//
//       Class.forName("com.mircosoft.sqlserver.jdbc.SQLServerDriver");
//       final String username="";
//       final String password="";
//       final String url="jdbc:sqlserver://DESKTOP-R66JUEU\\SQLEXPRESS;databaseName=PCA153;Integrated Security=True;Persist Security Info=False;Pooling=False;MultipleActiveResultSets=False;Encrypt=True;TrustServerCertificate=True;";
//       Connection con=DriverManager.getConnection(url,username,password);
//       String query1="insert into student values(?,?,?)";
//       String query2="select * from student";
//       while (true)
//       {
//           System.out.println("Enter your id");
//           int id=sc.nextInt();
//           System.out.println("Enter your name");
//           String name=sc.next();
//           System.out.println("Enter yout dept");
//           String dept=sc.next();
//
//           PreparedStatement ps=con.prepareStatement(query1);
//           ps.setInt(1,id);
//           ps.setString(2,name);
//           ps.setString(3,dept);
//           int row=ps.executeUpdate();
//           if(row>0)
//           {
//               System.out.println("Row affected successfully");
//           }
//           else
//           {
//               System.out.println("Not Row affected..");
//           }
//           System.out.println("Do you continue(yes/no)");
//           String choice=sc.next();
//           if(choice=="no")
//           {
//               break;
//           }
//       }
//       System.out.println("Display the data");
//       ResultSet rs=con.createStatement().executeQuery(query2);
//       while (rs.next())
//       {
//           System.out.println("\nStu_id\tstu_name\tstu_dept");
//           System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
//       }
//
//    }
//    catch (ClassCastException |ClassNotFoundException |SQLException e)
//    {
//        System.out.println(e.getMessage());
//        System.out.println("db is not connected");
//    }
//    }
//}

import java.util.*;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // ✅ Correct Driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String url ="jdbc:sqlserver://localhost:1433;databaseName=PCA153;encrypt=true;trustServerCertificate=true;";
            String username = "";
            String password = "";

            Connection con = DriverManager.getConnection(url);

            String query1 = "insert into student values(?,?,?)";
            String query2 = "select * from student";

            while (true) {
                System.out.println("Enter your id");
                int id = sc.nextInt();

                System.out.println("Enter your name");
                String name = sc.next();

                System.out.println("Enter your dept");
                String dept = sc.next();

                PreparedStatement ps = con.prepareStatement(query1);
                ps.setInt(1, id);
                ps.setString(2, name);
                ps.setString(3, dept);

                int row = ps.executeUpdate();

                if (row > 0) {
                    System.out.println("Row inserted successfully");
                } else {
                    System.out.println("Insert failed");
                }

                System.out.println("Do you continue (yes/no)");
                String choice = sc.next();

                if (choice.equalsIgnoreCase("no")) {
                    break;
                }
            }

            System.out.println("Display the data");

            ResultSet rs = con.createStatement().executeQuery(query2);

            System.out.println("\nStu_id\tstu_name\tstu_dept");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("DB is not connected ❌");
        }
    }
}