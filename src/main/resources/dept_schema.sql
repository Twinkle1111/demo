drop table if exists department;


create table department
(departmentid int not null primary key,
name text,
empid int foreign key(empid) references employee(id));