use PCA153;

select * from Employeeaggr;

/* 1.employee earning above avg salary */
select * from Employeeaggr
where Salary>(select AVG(Salary) from Employeeaggr);

/* 2.find the highest paid employee */
select * from Employeeaggr 
where Salary=(select MAX(Salary) from Employeeaggr);

/* 3.second highest salary */
select MAX(Salary) as SecondHigh from Employeeaggr
where Salary<(select MAX(Salary) from Employeeaggr);

/* 4.Employee in IT Dept */
select * from Employeeaggr
where Department=(Select Department from Employeeaggr where EmpName='kavin');

/*5. Deparatment having highest Average Salary*/
select Department,Max(Salary) as MaxSal from Employeeaggr
Group by Department
having Avg(Salary)=
(select Max(AvgSal) from (
select Department,Avg(Salary) as Avgsal from Employeeaggr
group by Department
)as temp
);
/*type of subqueries */
/* single row SubQuery */
select * from Employeeaggr
where Salary<(select Avg(Salary) from Employeeaggr);

/*Multirow SubQuery */
select * from Employeeaggr where Department In
(select Department from Employeeaggr where Salary>50000);

/* correlated SubQuery */
select e1.* from Employeeaggr as e1
where Salary>(select AVG(Salary) from Employeeaggr e2 where e1.Department=e2.Department);
/* alternative sol is join */

