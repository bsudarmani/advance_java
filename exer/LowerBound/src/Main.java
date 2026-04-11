import java.util.*;
import java.io.*;
class Message
{
    public String message;
    Message(String message)
    {
        this.message=message;
    }
    public String toString()
    {
        return message;
    }
}
class SMSMessage extends Message
{
    SMSMessage(String message)
    {
        super(message);
    }
}
class EmailMessage extends Message
{
    EmailMessage(String message)
    {
        super(message);
    }
}
class SendMessage
{
    public static void msg_send(List<?super SMSMessage> message,SMSMessage add)
    {
        message.add(add);
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Message> messList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the number to perform operation \n 1. Add Message \n 2.Display Message \n 3.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Message");
                    String message = sc.next();
                    SendMessage.msg_send(messList, new SMSMessage(message));
                    break;
                case 2:
                    System.out.println(messList);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}