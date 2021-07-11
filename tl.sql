CREATE OR REPLACE PROCEDURE print_contact(
    in_customer_id in CUSTOMER_PERSONAL_INFO.CUSTOMER_ID%TYPE,
    out_customer_name out CUSTOMER_PERSONAL_INFO.CUSTOMER_NAME%TYPE  
)
IS
  r_contact CUSTOMER_PERSONAL_INFO%ROWTYPE;
BEGIN
  -- get contact based on customer id
  SELECT *
  INTO r_contact
  FROM CUSTOMER_PERSONAL_INFO
  WHERE customer_id = IN_customer_id;

  -- print out contact's information
  dbms_output.put_line( r_contact.CUSTOMER_name || ' ' ||
  r_contact.GUARDIAN_name || '<' || r_contact.mail_ID ||'>' );
  
    out_customer_name:= r_contact.CUSTOMER_name;
EXCEPTION
   WHEN OTHERS THEN
      dbms_output.put_line( SQLERRM );
END;

var name varchar2(20);
EXECUTE print_contact('C-001',:name);
print name;
EXEC print_contact('C-001');

-- mysql 
-- create database emp_db;

-- oracle
create table employee_info
(
    id number(10),
    name varchar(20)
);

select *
from employee_info;

insert into employee_info values(100,'raj');
insert into employee_info values(200,'suraj');
insert into employee_info values(300,'reji');

commit;

update employee_info 
set name='raja'
where id = 100;

delete from employee_info
where id=300;

