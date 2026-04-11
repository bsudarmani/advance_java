import java.util.*;
import java.io.*;
class GenericStorage<T>
{
    public final ArrayList<T> list=new ArrayList<>();
    public void addItem(T item)
    {
        list.add(item);
    }
    public void getItem()
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
        return name + "," + age;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        GenericStorage<String> strStorage=new GenericStorage<>();
        GenericStorage<Integer> intStorage=new GenericStorage<>();
        GenericStorage<Person> perStroage=new GenericStorage<>();
      while(true)
      {
          System.out.println("Enter the choice to perform operation");
          System.out.println("\n 1.Add String \n 2.Add Integer \n 3.Add Object \n 4.Display All \n 5.Exit");
          int choice=sc.nextInt();
          switch (choice)
          {
              case 1:
                  System.out.println("Enter the String");
                  String str=sc.next();
                  strStorage.addItem(str);
                  break;
              case 2:
                  System.out.println("Enter the Integer");
                  int num=sc.nextInt();
                  intStorage.addItem(num);
                  break;
              case 3:
                  System.out.println("Enter the name");
                  String name=sc.next();
                  System.out.println("Enter the age");
                  int age=sc.nextInt();
                  perStroage.addItem(new Person(name,age));
                  break;
              case 4:
                  System.out.println("Display all");
                  System.out.print("Integer:");
                  intStorage.getItem();
                  System.out.print("String:");
                  strStorage.getItem();
                  System.out.print("Person:");
                  perStroage.getItem();
                  break;
              case 5:
                  return;
              default:
                  System.out.println("Invalid option");
                  break;
          }
      }
    }
}