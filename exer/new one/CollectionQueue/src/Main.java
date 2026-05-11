import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tokenum=1;
        Queue<Integer> token=new LinkedList<>();
        while(true)
        {
            System.out.println("\nenter the number\n1.generate queue \n2.serve queue \n3.display \n4.exit");
            int ch=sc.nextInt();
            switch (ch)
            {
                case 1:
                    if(token.size()==Integer.MAX_VALUE)
                    {
                        System.out.print("Queue is full");
                    }
                    token.offer(tokenum);
                    System.out.print("generate token:"+token);
                    tokenum++;
                    break;
                case 2:
                    if(token.isEmpty())
                    {
                        System.out.print("Queue is empty");
                    }
                    int c_token=token.poll();
                    System.out.print("current token:"+token);
                    System.out.print("total token:"+token.size());
                    break;
                case 3:
                    if(token.isEmpty())
                    {
                        System.out.print("Queue is empty");
                    }
                    System.out.print("current token:"+token);
                    System.out.print("Total token:"+token.size());
                    break;
                default:
                    return;
            }
        }
    }
}