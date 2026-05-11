import java.util.*;
import java.io.*;
class Message
{
    String message;
    Message(String message)
    {
        this.message=message;
    }
    public String toString()
    {
        return message;
    }
}
class SMS extends Message
{
    SMS(String message)
    {
        super(message);
    }
}
class EmailSMS extends Message
{
    EmailSMS(String message)
    {
        super(message);
    }
}
class SMSServicce
{
    public static void show_sms(List<?super EmailSMS> msg,EmailSMS message)
    {
        msg.add(message);
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        List<EmailSMS> emaillist=new ArrayList<>();
        while(true)
        {
         System.out.println("\n 1.Add message \n 2.Display msg \n3.exit");
         int choice=sc.nextInt();
         switch (choice)
         {
             case 1:
                  System.out.println("Enter the message");
                  String message=sc.next();
                  SMSServicce.show_sms(emaillist,new EmailSMS(message));
                  break;
             case 2:
                 System.out.println("Display the message");
                System.out.println(emaillist);
                break;
             default:
                 return;
         }
        }
    }
}