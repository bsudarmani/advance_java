use PCA153;


select * from Employeeaggr;

select LEN(EmpName) as length from Employeeaggr;

select UPPER(EmpName) as UpperCase from Employeeaggr;

select LOWER(EmpName) as LowerCase from Employeeaggr;

select CONCAT(EmpName,' ',Department,'-IN') as ConcatString from Employeeaggr;

select SUBSTRING(EmpName,1,5) as SubStr from Employeeaggr;

select TRIM('  Hello World ') as TrimStr;

select REPLACE('Hello World','World','sql')as ReplaceStr;

select LEFT('Hello world',5) as leftStr;

select RIGHT('Hello world',5) as RightStr;

select REVERSE(EmpName) as ReveStr from Employeeaggr;

select * from Employeeaggr;

/* real time exampe */

select CONCAT(LOWER(EmpName),'@ibmcorp.com') as OfficalMail from  Employeeaggr;

/* password gen */

select CONCAT(LOWER(LEFT(EmpName,2)),UPPER(RIGHT(EmpName,2)),'@',EmpID) as Passordgen from Employeeaggr;