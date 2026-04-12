import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int TokenNumber=1;
        Queue<Integer> tokenque=new LinkedList<>();
     while (true)
     {
         System.out.println("Enter the number to perform operation \n 1.Generate Token \n 2.Serve Token \n 3.Display Token \n 4.Exit");
         int choice=sc.nextInt();
         switch (choice)
         {
             case 1:
                 if(tokenque.size()==Integer.MAX_VALUE)
                 {
                     System.out.println("queue is fully...");
                 }
                 tokenque.add(TokenNumber);
                 System.out.println("Genereted token:"+ TokenNumber);
                 TokenNumber++;
                 break;
             case 2:
                 if(tokenque.isEmpty())
                 {
                     System.out.println("Queue is empty");
                 }
                 else {
                     int ser_token = tokenque.poll();
                     System.out.println("Current Token:" + tokenque);
                     System.out.println("Total Token:" + tokenque.size());
                 }
                 break;
             case 3:
                 if(tokenque.isEmpty())
                 {
                     System.out.println("Queue is Empty");
                 }
                 else
                 {
                     System.out.println("Current Token:"+tokenque);
                     System.out.println("Total Token:"+tokenque.size());
                 }
                 break;
             case 4:
                 return;
             default:
                 System.out.println("Invalid option..");
                 break;
         }
     }
    }
}