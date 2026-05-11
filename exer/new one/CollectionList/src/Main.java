import java.util.*;
import java.io.*;
class Employee
{
    int id;
    String name;
    double salary;
    Employee(int id,String name,double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public String getInfo()
    {
        return " "+id +" " +name +" "+salary ;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Employee> list=new ArrayList<>();
        while (true)
        {
            System.out.println("\nEnter the to perform operation" +
                    "\n1.Add \n2.Update \n3.delete \n4.display \n5.count \n6.clear \n7.exit");
            int ch=sc.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("Enter the id");
                    int id=sc.nextInt();
                    System.out.println("Enter the name");
                    String name=sc.next();
                    System.out.println("Enter the salary");
                    double salary=sc.nextDouble();
                    list.add(new Employee(id,name,salary));
                    break;
                case 2:
                    System.out.println("Enter the id");
                    boolean flag=false;
                    int u_id=sc.nextInt();
                    for(Employee e:list)
                    {
                        if(e.id==u_id) {
                            System.out.println("Enter the new Salary");
                            double new_salary=sc.nextDouble();
                            e.salary=new_salary;
                            flag=true;
                        }
                    }
                    if(flag)
                        System.out.println("Employee found and updated it..");
                    else
                        System.out.println("Employee not found");
                    break;
                case 3:
                    if(list.isEmpty())
                        System.out.println("Employee list is empty");

                    System.out.println("Enter the employee id");
                    int e_id1=sc.nextInt();
                    boolean flag1=list.removeIf(e->e.id==e_id1);
                    if(flag1==true)
                        System.out.println("Employee removed successfully");
                    else
                        System.out.println("Not removed ");
                    break;
                case 4:
                    if(list.isEmpty())
                        System.out.println("Employee list is empty");
                    System.out.println("Display data");
                    for(Employee e:list)
                    {
                        System.out.println(e.getInfo());
                    }
                    break;
                case 5:
                    System.out.println("count:"+list.stream().count());
                    break;
                case 6:
                    if(list.isEmpty())
                        System.out.println("list is empty");
                    list.clear();
                    System.out.println("list is clear successfully");
                    break;

                default:
                    return;

            }
        }

    }
}