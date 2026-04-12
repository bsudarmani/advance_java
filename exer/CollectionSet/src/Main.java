import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<String> emailset=new HashSet<String>();
     while(true)
     {
         System.out.println("Enter the number to perform operation \n 1.Register email \n 2.View Email \n 3.Remove Email \n 4.Exit");
         int choice=sc.nextInt();
         switch (choice)
         {
             case 1:
                 System.out.println("Enter the email");
                 String email=sc.next().toLowerCase();
                 if(!email.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)+$") )
                 {
                     System.out.println("Please enter the valid email");
                 }
                 else if(emailset.contains(email))
                 {
                     System.out.println("Email already registered");
                 }
                 else
                 {
                     emailset.add(email);
                     System.out.println("Email registered successfully");
                 }
                 break;
             case 2:
                 if(emailset.isEmpty())
                 {
                     System.out.println("Emailset is empty");
                 }
                 for(String e:emailset)
                 {
                     System.out.println("->"+e);
                 }
                 break;
             case 3:
                  System.out.println("Enter the email");
                  String u_email=sc.next().toLowerCase();
                  if(emailset.remove(u_email))
                  {
                      System.out.println("Email deleted successfully");
                  }
                  else
                  {
                      System.out.println("Not email found");
                  }
                 break;
             case 4:
                 return;
             default:
                 System.out.println("Invalid option");
                 break;
         }
     }
    }
}