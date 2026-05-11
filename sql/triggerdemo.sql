use PCA153;

create table emp_triggers
(
 emp_id int primary key,
 emp_name varchar(30) not null
 );

 create table emp_trihis
 (
  emp_id int,
  operation varchar(30),
  oper_date DATETIME
  );
 SELECT * FROM sys.triggers;
 drop trigger emp_trig;
  create trigger emp_trig
  on emp_triggers
  after insert,update,delete
  as
   begin
       if exists(select * from inserted) and not exists(select * from deleted)
       insert into emp_trihis(emp_id,operation,oper_date)
       select emp_id,'ins',GETDATE() from inserted
       
       if exists(select * from deleted) and not exists(select * from inserted)
       insert into emp_trihis(emp_id,operation,oper_date)
       select emp_id,'del',GETDATE() from deleted

       if exists(select * from inserted) and  exists (select * from deleted)
       insert into emp_trihis(emp_id,operation,oper_date)
       select emp_id,'update',GETDATE() from inserted    
   end

   insert into emp_triggers values(1,'s');
  
   truncate table emp_triggers;
   truncate table emp_trihis;
  select * from emp_triggers;
  select * from emp_trihis;

  insert into emp_triggers values(2,'s');
  update emp_triggers 
  set emp_name='sudar' where emp_id=1;
  delete from emp_triggers where emp_id=1;