use PCA153;

select * from employee;

/* print statement*/
CREATE PROCEDURE prosample
AS
 print 'hello'

exec prosample

/*select*/

create procedure prosample1
as
  begin
  select * from employee
  end

  
exec prosample1
execute prosample1
execute dbo.prosample1


  /* stored procedure with parameter*/
  drop procedure prosample2;
  create procedure prosample2
  @salary bigint
  as 
    begin
    select * from employee where emp_salary=@salary
     end

exec prosample2 @salary=50000;


/* alter procedure */

alter procedure prosample2
@emp_id int
as
 begin
    select * from employee where emp_id=@emp_id
 end

 exec prosample2 @emp_id=5;

 /* find the procedures in the database schema*/
 select * from sys.procedures where name='prosample3';
 select * from sys.procedures;

 use PCA153;
 drop procedure dbo.prosample3;


 /*action perfomd */
create procedure prosample3
(
  @emp_name varchar(30),
  @emp_email varchar(30),
  @emp_designation varchar(30),
  @emp_salary bigint,
  @emp_incharge_id int,
  @action varchar(10)
)
as
begin
   if lower(@action)='i'
   begin
       insert into employee(emp_name,emp_email, emp_designation, emp_salary, emp_incharge_id)
       values
(@emp_name,@emp_email,@emp_designation,@emp_salary,@emp_incharge_id)
   end
end

select * from employee;
truncate table employee;

exec prosample3 
@emp_name='sudarmani',
@emp_email='sudarmani@gmail.com',
@emp_designation='INTERN',
@emp_salary=12000,
@emp_incharge_id=5,
@action='i';


/*view procedure */
select * from employee;

/* output parameter */

create procedure prosample4
(
@emp_id int,
@emp_salary bigint out
)
as
 begin
   select @emp_salary=emp_salary from employee where emp_id=@emp_id
 end

declare @result bigint
exec prosample4
  @emp_id=1,
  @emp_salary=@result out

select @result as salary