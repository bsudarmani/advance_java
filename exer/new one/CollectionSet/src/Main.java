import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Set<String>emailset=new HashSet<>();
        while(true) {
            System.out.println("Enter the number to perform operation" +
                    "\n1.Register email \n2.View email \n3.remove email \n4.exit");
            int choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter the email");
                    String email=sc.next();

                        if(!email.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9]+)+$"))
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
                        System.out.println("New email entered");
                    }
                    break;
                case 2:
                    if(emailset.isEmpty())
                    {
                        System.out.println("emailset is empty");
                    }
                    System.out.println("Display the email");
                    for(String e:emailset)
                    {
                        System.out.println(e);
                    }
                    break;
                case 3:
                    if(emailset.isEmpty())
                    {
                        System.out.println("emailset is empty");
                    }
                    System.out.println("Enter the new email");
                    String new_em=sc.next();
                    if(emailset.remove(new_em))
                    {
                        System.out.println("email deleted successfuly");
                    }
                    else
                    {
                        System.out.println("email is not found");
                    }
                    break;
                default:
                    return;
            }
        }
    }
}