use PCA153;

/*DLL commands (create,alter,drop,truncate)*/
/* create */
create table stu_demo
(
  stu_id int identity(1,1) primary key,
  stu_name varchar(30) not null
);

/* alter */
alter table stu_demo add stu_gender varchar(30);

/*drop table */
drop table if exists stu_demo;

/*truncate table */
truncate table stu_demo;

/*DML commands (insert,update,delete) */
/*insert*/
insert into stu_demo values('mani','b'); 
insert into stu_demo values('sudar','b');
insert into stu_demo values('kugan','b');

/*select */
select * from stu_demo;

/*update*/
update stu_demo 
set stu_name='sudarmani' where stu_id=2;

/*delete*/
delete from stu_demo where stu_id=3;