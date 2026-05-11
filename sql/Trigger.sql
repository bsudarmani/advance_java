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


/* DML Trigger(After) */
create trigger dml_trigger
on employees
after insert
as
  begin
  print 'hello'
  end

  /* DML Trigger(for) correctly worked*/
create trigger dml_trigger1
on employees
for insert
as
  begin
  print 'hello'
  end


/* DML Trigger(instead of) correctly worked 
create trigger dml_trigger2
on employees
instead of insert
as
  begin
  print 'hello dml cmd'
  end */
  
  

  /*real time example */
  create trigger dml_trigger3
  on employee
  for insert
  as
   begin
     select * from inserted
   end



insert into employees values(4,'saru','saru@gmail.com');
  select * from employees;


  /* System trigger */
  select name from sys.triggers;
 




