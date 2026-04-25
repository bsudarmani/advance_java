use PCA153;

create table student_mark1
(
 stu_id varchar(30),
 sub_mark int
);

create table student_mark2
(
 stu_id varchar(30),
 sub_mark int
);

insert into student_mark1 values('1',50);
insert into student_mark1 values('2',60);
insert into student_mark1 values('3',70);
insert into student_mark1 values('4',90);

insert into student_mark2 values('2',50);
insert into student_mark2 values('2',70);
insert into student_mark2 values('2',75);



/* union */
select sub_mark from student_mark1
union
select sub_mark from student_mark2;

/* union all */
select sub_mark from student_mark1
union all
select sub_mark from student_mark2;

select * from student_mark1;
select * from student_mark2;
/*intersect*/
select sub_mark from student_mark1
intersect
select sub_mark from student_mark2;


select * from student_mark1;
select * from student_mark2;
/* except */
select sub_mark from student_mark1
except
select sub_mark from student_mark2;