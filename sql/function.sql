use PCA153;

/*create an function and calculate Salary */
CREATE FUNCTION dbo.AnnualSal
(
@monthlySal DECIMAL(10,2)
)
returns DECIMAL(12,2)
as
 begin
    return @monthlySal*12;
 end;

 select * from Employeeaggr;
 select EmpName,Department,Salary as MonthlySal,
 dbo.AnnualSal(Salary) as YearlySal from Employeeaggr;

 /*alter  bonus calculation */

 alter function dbo.bonusCal
 (
  @emp_salary DECIMAL(10,2),
  @emp_bonus DECIMAL(10,2)
 )
 returns DECIMAL(12,2)
 as
  begin
    return @emp_salary+@emp_bonus;
  end;

  select * from Employeeaggr;
  select EmpName,Department,dbo.bonusCal(Salary,Salary/2) as BonusAmount from Employeeaggr;

  /*Grade Employees Based on Salary */

  create function dbo.tableval
  (
  @dept varchar(10)
  )
  returns Table
  as
     return(select * from  Employeeaggr where  Department=@dept);

  select * from dbo.tableval('Finance');
