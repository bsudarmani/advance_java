use PCA153;

CREATE TABLE Employeeaggr
(
    EmpID INT PRIMARY KEY,
    EmpName VARCHAR(50) NOT NULL,
    Department VARCHAR(30),
    Salary DECIMAL(10,2) CHECK (Salary > 0),
    Age INT CHECK (Age >= 18)
);

INSERT INTO Employeeaggr VALUES
(101, 'Sudar', 'IT', 50000, 22),
(102, 'Arun', 'HR', 35000, 25),
(103, 'Kavin', 'IT', 60000, 24),
(104, 'Priya', 'Finance', 45000, 26),
(105, 'Divya', 'HR', 30000, 23);


/* view */
select * from Employeeaggr;

/*count */
select count(*) as TotalEmp from Employeeaggr; 

/*min*/
select min(Salary) as minSal from Employeeaggr;

/*max */
select max(Salary) as maxSal from Employeeaggr;

/* avg */
select avg(Salary) as avgSal from Employeeaggr;

/* sum */
select sum(Salary) as SumSal from Employeeaggr;

/*multiple aggr */
select count(*) as TotalEmp,
min(Salary) as minSal,
max(Salary) as maxSal,
avg(Salary) as avgSal,
sum(Salary) as SumSal
from Employeeaggr; 

/* group by  */
select * from Employeeaggr;
select Department,count(*) as DepCount from Employeeaggr
group by Department;

select * from Employeeaggr;
select Department,Max(Salary) as DepMax from Employeeaggr
group by Department;

/* having */
select * from Employeeaggr;
select Department,sum(Salary) as Sumdept 
from Employeeaggr group by Department
having Max(Salary)>40000;

/*secon Higest Salary */
select * from Employeeaggr;
select Max(Salary) as secondHigh from Employeeaggr 
where Salary<(select Max(Salary) from Employeeaggr);

/*Employees earning above average salary*/
select * from Employeeaggr
where Salary<(select AVG(Salary) from Employeeaggr);