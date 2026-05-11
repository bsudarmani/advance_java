import java.util.*;
import java.io.*;
class Employee
{
    public double salary;
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
class SalaryReport
{
    public static  void showReport(List<?extends Employee> employees)
    {
        double totalSalry=0;
        for(Employee e:employees)
        {
          totalSalry+=e.getSalary();
        }
        System.out.println("totalSalary:"+totalSalry);
    }
}
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      ArrayList<Developer> dev=new ArrayList<>();
      ArrayList<Tester> tes=new ArrayList<>();
      while(true)
      {
          System.out.println("\n Enter the number to perform operation " +
                  "\n1.Add Developer \n2.Add tester \n 3.Display Salary \n 4.exit");
          int choice=sc.nextInt();
          switch (choice)
          {
              case 1:
                 System.out.println("Enter the salary");
                 double salary1=sc.nextDouble();
                 dev.add(new Developer(salary1));
                 break;
              case 2:
                  System.out.println("Enter the salary");
                  double salary2=sc.nextDouble();
                  tes.add(new Tester(salary2));
                  break;
              case 3:
                  System.out.println("Total Salary of developer");
                  SalaryReport.showReport(dev);
                  System.out.println("Total Salary of tester");
                  SalaryReport.showReport(tes);
                  break;
              default:
                  return;
          }
      }
    }
}