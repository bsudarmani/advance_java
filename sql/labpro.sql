use PCA153;

create table s_pro
(
 stu_id int,
 stu_name varchar(30),
 stu_age int,
 stu_dept varchar(30)
);
create procedure s_procedure
@action varchar(10),
@stu_id int,
@stu_name varchar(30),
@stu_age int,
@stu_dept varchar(30)
as
begin
   if lower(@action)='i'
    begin
     insert into s_pro(stu_id,stu_name,stu_age,stu_dept) values(@stu_id,@stu_name,@stu_age,@stu_dept);
    end
end

select * from s_pro;

exec s_procedure @action='i',@stu_id=1,@stu_name='sudar',@stu_age=23,@stu_dept='cse';