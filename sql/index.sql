use PCA153;

select * from Employeeaggr;

/*clustered index */
create index emp_salindex
on Employeeaggr(EmpID);

/*non clustered index */
create nonclustered index emp_salaryindex
on Employeeaggr(Salary);

/* check exsisting table */
exec sp_helpindex 'Employeeaggr';
exec sp_helpindex 'UsersLogin';


CREATE TABLE UsersLogin
(
    UserID INT PRIMARY KEY,
    Email VARCHAR(100),
    PasswordHash VARCHAR(200)
);

insert into UsersLogin values(1,'sudar@gmail.com','sudar@2005');
insert into UsersLogin values(2,'mani@gmail.com','mani@2005');
insert into UsersLogin values(3,'anbu@gmail.com','anbu@2005');
insert into UsersLogin values(4,'guna@gmail.com','guna@2005');
insert into UsersLogin values(5,'rajan@gmail.com','rajan@2005');

/* real time login System */
create nonclustered index LoginEmail
on UsersLogin(Email);

select * from UsersLogin where Email='sudar@gmail.com';

/* composite index */
create nonclustered index LoginEmailandPass
on UsersLogin(Email,PasswordHash);

select * from UsersLogin where Email='sudar@gmail.com' and PasswordHash='sudar@2005';

/*unique index */
create  unique index LoginSystem
on UsersLogin(Email);

select * from UsersLogin where Email='sudar@gmail.com';

drop index emp_salindex on Employeeaggr;
exec sp_helpindex 'Employeeaggr';
