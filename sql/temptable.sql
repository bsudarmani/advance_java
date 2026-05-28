/*Normal table */
use PCA153;
create table emp_salary
(
emp_id int identity(1,1) primary key,
emp_fname varchar(20) not null, /* not null clause */
emp_lname varchar(20) not null,
emp_salary int check(emp_salary>15000), /* check clause */
emp_isdelete int default 0              /* default clause */
);

insert into emp_salary values('sudar','kumar',20000,0);
insert into emp_salary values('dass','kali',30000,0);
insert into emp_salary values('wamiqa','gabbi',16000,1);
insert into emp_salary values('muthu','lakshmi',17000,1);

select * from emp_salary;

/* soft delete and common tempary table applied(cte)*/
create table emp_remove as
select emp_id from emp_salary where emp_isdelete=1;
