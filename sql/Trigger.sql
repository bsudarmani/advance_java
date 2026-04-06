use PCA153;

create table employees
(
emp_id int,
emp_name varchar(20),
emp_email varchar(50),
);
insert into employees values(1,'sudar','sudar@gmail.com');
insert into employees values(2,'mani','mani@gmail.com');
select * from employees;
create table employees_his
(
 emp_id int,
 operation varchar(20),
 curr_date DATETIME,
);

create trigger emp_trigger
on employees
after insert,delete
as
begin
   insert into employees_his(emp_id,operation,curr_date)
   select emp_id,'ins',GETDATE() from inserted
   UNION ALL
   select emp_id,'del',GETDATE() from deleted
end

insert into employees values(2,'vijay','vijay@gmail.com');
select * from employees;
select * from employees_his;