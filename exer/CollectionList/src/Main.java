import javax.sound.midi.SysexMessage;
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
    public   void getInfo()
    {
        System.out.println("id:"+id +"  name:"+name+"  salary:"+salary);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Employee> elist=new ArrayList<>();
    while (true)
    {
        System.out.println("Enter the number to perform operation");
        System.out.println("\n 1.Add \n 2.update \n 3.delete \n 4.display \n 5.count \n 6.clear \n 7.exit");
        int choice=sc.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("Enter the id");
                int id=sc.nextInt();
                System.out.println("Enter the name");
                String name=sc.next();
                System.out.println("Enter the salary");
                Double salary=sc.nextDouble();
                elist.add(new Employee(id,name,salary));
                break;
            case 2:
                System.out.println("Enter the id");
                int s_id=sc.nextInt();
                boolean flag=false;
                for(Employee e:elist)
                {
                    if(e.id==s_id)
                    {
                        System.out.println("Enter the new salary");
                        e.salary=sc.nextDouble();
                        flag=true;
                    }
                }
                if(flag!=true)
                {
                    System.out.println("Employee is not found");
                }
                break;
            case 3:
                if(elist.isEmpty()) {
                    System.out.println("employeee is not found");
                }
                System.out.println("Enter the id");
                int s_id1=sc.nextInt();
                boolean flag1=elist.removeIf(e->e.id==s_id1);
                if(flag1!=true)
                {
                    System.out.println("Employee is not found");
                }
                else
                {
                    System.out.println("Employee removed successfully");
                }
                break;
            case 4:
                if(elist.isEmpty()){System.out.println("Employee list is empty");}
                 System.out.println("Display Employee");
                 for(Employee e:elist)
                 {
                    e.getInfo();
                 }
                 break;
            case 5:
                System.out.println("Total Employee:"+elist.stream().count());
                break;
            case 6:
                if(elist.isEmpty())
                {
                    System.out.println("Employee list is empty");
                }
                elist.clear();
                System.out.println("All the data cleared successfully");
                break;
            case 7:
                return;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
    }
}