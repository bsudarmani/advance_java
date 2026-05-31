use PCA153;

select * from Employeeaggr;

/*create view */
create view internview
as
select EmpName,Department,Age from Employeeaggr;

select * from internview;

/*alter view */
alter view internview
as
select EmpName,Department,Salary,Age from Employeeaggr;

/*drop view*/
create view trainee
as
select EmpID,EmpName,Department,Salary,Age from Employeeaggr;

drop view internview;

/*view with aggeration */
create view trainee
as
select Department,AVG(Salary) as avgSal  from Employeeaggr
group by Department;

select * from trainee;

update Employeeaggr 
set Age=30 where EmpName='Sudar';
select * from Employeeaggr;
select * from internview;