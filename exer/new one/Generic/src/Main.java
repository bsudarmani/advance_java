import java.util.*;
import java.io.*;
class GenericStorage<T>
{
    public final ArrayList<T> list=new ArrayList<>();
    public void set(T item)
    {
        list.add(item);
    }
    public void get()
    {
        System.out.println(list);
    }
}
class Person
{
    String name;
    int age;
    Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public String toString()
    {
        return ""+name+""+age;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     GenericStorage<String> stringstorage=new GenericStorage<>();
     GenericStorage<Integer> intstorage=new GenericStorage<>();
     GenericStorage<Person> personstorage=new GenericStorage<>();
     while(true)
     {
         System.out.println("Enter the number to perform operation \n1.Add string \n2.Add Integer \n3.Add Object \n4.display");
         int n=sc.nextInt();
         switch (n)
         {
             case 1:
                 System.out.println("Enter the String ");
                 String name=sc.next();
                 stringstorage.set(name);
                 break;
             case 2:
                 System.out.println("Enter the Integer");
                 int num=sc.nextInt();
                 intstorage.set(num);
                 break;
             case 3:
                 System.out.println("Enter the name");
                 String name1=sc.next();
                 System.out.println("Enter tha age");
                 int age=sc.nextInt();
                 personstorage.set(new Person(name1,age));
                 break;
             case 4:
                 System.out.println("Display the String");
                 stringstorage.get();
                 System.out.println("Display the integer");
                 intstorage.get();
                 System.out.println("Displaythe person");
                 personstorage.get();
                 break;
             default:
                 return;
         }
     }
    }
}