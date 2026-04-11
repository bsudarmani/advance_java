import java.util.*;
import java.io.*;
class Employee
{
    double salary;
    Employee(double salary)
    {
        this.salary=salary;
    }
    public double getSalary()
    {
        return salary;
    }
}
class Developer extends Employee
{
    Developer(double salary)
    {
        super(salary);
    }
}
class Tester extends Employee
{
    Tester(double salary)
    {
        super(salary);
    }
}
class ReportSalary
{
    public static void showsalary(List<? extends Employee> employees)
    {
        double total=0;
        for(Employee e:employees)
        {
            total+=e.getSalary();
        }
        System.out.println("Total Salary:"+total);
    }
}
public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    ArrayList<Developer> devList=new ArrayList<>();
    ArrayList<Tester> testList=new ArrayList<>();
      while (true)
      {
          System.out.println("Enter the number to perform operation \n 1. Add Salary Tester \n 2.Add Salary Developer \n 3.Display Salary \n 4.Exit");
          int choice=sc.nextInt();
          switch (choice)
          {
              case 1:
                  System.out.println("Enter the Salary amount from Tester");
                  double salary=sc.nextDouble();
                  testList.add(new Tester(salary));
                  break;

              case 2:
                  System.out.println("Enter the salary amount from Developer");
                  double salary1=sc.nextDouble();
                  devList.add(new Developer(salary1));
                  break;
              case 3:
                  System.out.println("Display the salary from tester");
                  ReportSalary.showsalary(testList);

                  System.out.println("Display the salary from Developer");
                  ReportSalary.showsalary(devList);
                  break;
              case 4:
                  return;
              default:
                  System.out.println("Invalid option");

          }
      }
    }
}