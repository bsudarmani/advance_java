create database PCA153;

use PCA153;

drop table if exists employee;
create table employee(
emp_id int identity(1,1) primary key,
emp_first_name varchar(20) not null,
emp_last_name varchar(20),
emp_email varchar(50) not null unique,
emp_designation varchar(30) not null,
emp_salary Bigint default 10000,
emp_incharge_id int,
);

drop table if exists employee_info;
create table employee_info
(
emp_id int references employee(emp_id),
emp_age int not null,
emp_address varchar(30) not null,
emp_contact_no Bigint default 9999999999,
emp_work_location varchar(50),
emp_exper int not null,
);

insert into employee (emp_first_name,emp_last_name, emp_email, emp_designation, emp_salary, emp_incharge_id)
values ('Arun','kumar', 'arun@gmail.com', 'CEO', 50000, null);

insert into employee (emp_first_name,emp_last_name, emp_email, emp_designation, emp_salary, emp_incharge_id)
values ('Bala',null, 'bala@gmail.com', 'DIRECTOR', 35000, 1);

insert into employee (emp_first_name,emp_last_name, emp_email, emp_designation, emp_salary, emp_incharge_id)
values ('Charan',null, 'charan@gmail.com', 'TECH TEAM', 30000, 1);

insert into employee (emp_first_name,emp_last_name, emp_email, emp_designation, emp_salary, emp_incharge_id)
values ('Divya','saran','divya@gmail.com', 'TEAM LEAD', 32000, 2);

insert into employee (emp_first_name,emp_last_name, emp_email, emp_designation, emp_salary, emp_incharge_id)
values ('Eshwar','kumar', 'eshwar@gmail.com', 'EMPLOYEE', 28000, 4);

insert into employee (emp_first_name,emp_last_name,emp_email, emp_designation, emp_salary, emp_incharge_id)
values ('siva','paul','siva@gmail.com', 'INTERN', 10000, 0);

/*---*/

insert into employee_info (emp_id, emp_age, emp_address, emp_contact_no,emp_work_location,emp_exper)
values (1, 35, 'Chennai', 9876543210,'chennai',10);

insert into employee_info (emp_id, emp_age, emp_address, emp_contact_no,emp_work_location,emp_exper)
values (2, 28, 'Coimbatore', 9876501234,null,5);

insert into employee_info (emp_id, emp_age, emp_address, emp_contact_no,emp_work_location,emp_exper)
values (3, 26, 'Madurai', 9876505678,'kerala',3);

insert into employee_info (emp_id, emp_age, emp_address, emp_contact_no,emp_work_location,emp_exper)
values (5, 27, 'Salem', 9876512345,'chennai',4);

update employee_info
set emp_work_location=null where emp_id=5;

--join
select * from employee;
select * from employee_info;


--inner join
select a.* from employee a
join employee_info b on a.emp_id=b.emp_id;

--left join
select a.*,b.emp_address,b.emp_contact_no,emp_exper from employee a
left join employee_info b on a.emp_id=b.emp_id;

--right join
select a.emp_id,a.emp_first_name,emp_last_name,b.* from employee a
right join employee_info b on a.emp_id=b.emp_id;

--full join
select a.*,b.* from employee a
full join employee_info b on a.emp_id=b.emp_id;