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

/* ctas*/
select * into emp_remove from emp_salary;

select * from emp_salary;
select * from emp_remove;

/*temp table*/
create table #emp_temp
(
emp_id int identity(1,1),
emp_name varchar(20)
);

insert into #emp_temp values('sudar');
insert into #emp_temp values('mani');

select * from #emp_temp;

/*global table*/
create table ##emp_global
(
emp_id int identity(1,1),
emp_name varchar(20)
);

insert into ##emp_global values('sudar');
insert into ##emp_global values('mani');

select * from ##emp_global;


/*cte table */
with ctetable as
(
select * from ##emp_global
)
select * into ctetbaleper from ctetable;


select * from ctetbaleper;
