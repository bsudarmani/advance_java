use PCA153;

create table clg_stu
(
 stu_id int primary key,
 stu_name varchar(30)not null
 );

 create table clg_stu_mark
 (
  stu_id int references clg_stu(stu_id),
  stu_total int not null
  );

  insert into clg_stu values(1,'sudar');
  insert into clg_stu values(2,'mani');
   insert into clg_stu values(3,'kabilan');
  insert into clg_stu values(4,'mano');

  insert into clg_stu_mark values(1,40);
  insert into clg_stu_mark values(2,50);

  select * from clg_stu;
  select * from clg_stu_mark;

  /*inner join */
  select s.stu_id,s.stu_name,e.stu_total from clg_stu  s
  join  clg_stu_mark  e on s.stu_id=e.stu_id;

  /*left join */
  select s.stu_id,s.stu_name,e.stu_total from clg_stu s
  left join clg_stu_mark e on s.stu_id=e.stu_id;

  /*right join */
  select s.stu_id,s.stu_name,e.stu_total from clg_stu s
  right join clg_stu_mark e on s.stu_id=e.stu_id;

  /* full join */
  select s.stu_id,s.stu_name,e.stu_total from clg_stu s
  full join clg_stu_mark e  on s.stu_id=e.stu_id;