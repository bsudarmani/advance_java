import java.util.*;
import java.io.*;

public class Main {

    static HashMap<String,Double> map=new HashMap<>();
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

      while (true) {
          System.out.println("Enter the number to perform operation \n 1.Add product \n2.update product \n3.remove product \n 4.search product \n 5.display product \n 6.exit");
          int choice= sc.nextInt();
          switch (choice)
          {
              case 1:
                  System.out.println("Enter the product name");
                  String name=sc.next();
                  System.out.println("Enter the product price");
                  double price=sc.nextDouble();
                  addproduct(name,price);
                  break;
              case 2:
                  System.out.println("Enter the product name");
                  String name1=sc.next();
                  updateproduct(name1);
                  break;
              case 3:
                  System.out.println("Enter the product name");
                  String name2=sc.next();
                  removeproduct(name2);
                  break;
              case 4:
                  System.out.println("Enter the product name");
                  String name3=sc.next();
                  searchproduct(name3);
                  break;
              case 5:
                  displayproduct();
                  break;
              case 6:
                  return;
              default:
                  System.out.println("Invalid option");
                  break;
          }
      }
    }

    private static void displayproduct() {
        if(map.isEmpty())
        {
            System.out.println("Product is not available");
        }
        else
        {
            for(Map.Entry<String,Double> m: map.entrySet())
            {
                System.out.println(m.getKey()+ "->"+ m.getValue());
            }
        }
    }

    private static void searchproduct(String name3) {
        if(map.containsKey(name3))
        {
            System.out.println("product name:"+ name3 + " product price:"+map.get(name3));
        }
        else
        {
            System.out.println("Product is not available");
        }
    }

    private static void removeproduct(String name2) {
        if(map.remove(name2)!=null)
        {
            System.out.println("Product removed successfully");
        }
        else
        {
            System.out.println("Product is not available");
        }
    }

    private static void updateproduct(String name1)
    {
        if(map.containsKey(name1))
        {
            double newsalary=sc.nextDouble();
            map.put(name1,newsalary);
            System.out.println("price updated successfully");
        }
        else
        {
            System.out.println("Product is not available");
        }
    }
    public static void addproduct(String name,double price)
    {
     if(map.containsKey(name))
     {
         System.out.println("product is already available");
     }
     else
     {
         map.put(name,price);
         System.out.println("Product added successfully");
     }
    }
}