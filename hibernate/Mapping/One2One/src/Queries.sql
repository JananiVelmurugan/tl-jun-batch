CREATE DATABASE relationship_db;  

CREATE TABLE employee(
empno INT,
username VARCHAR(20),
department VARCHAR(10)
constraint fk_empno empno references person(empid)
);

INSERT INTO employee VALUES(101,'Janani04',10);
INSERT INTO employee VALUES(102,'Naresh08',10);
INSERT INTO employee VALUES(103,'Suyambu09',10);
INSERT INTO employee VALUES(104,'Sairam02',10);
INSERT INTO employee VALUES(105,'Sentamil',10);

CREATE TABLE department(
id INT,
NAME VARCHAR(10)
);

INSERT INTO department VALUES(10,'Training');

CREATE TABLE person(
empid INT,
firstname VARCHAR(20),
lastname VARCHAR(20)
);

INSERT INTO person VALUES(101,'Janani','Velmurugan');

CREATE TABLE course
(
id INT,
NAME VARCHAR(20),
duration INT
);

INSERT INTO course VALUES(1,'C',1);
INSERT INTO course VALUES(2,'C++',2);
INSERT INTO course VALUES(3,'Java',3);

CREATE TABLE employee_course
(
empno INT,
id INT
);

INSERT INTO employee_course VALUES(101,3);
INSERT INTO employee_course VALUES(101,2);
INSERT INTO employee_course VALUES(101,1);
INSERT INTO employee_course VALUES(102,3);
INSERT INTO employee_course VALUES(102,2);
INSERT INTO employee_course VALUES(103,2);
INSERT INTO employee_course VALUES(104,1);
INSERT INTO employee_course VALUES(105,1);
