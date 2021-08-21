create database test;

use test;

create table user
( 
id int,
name varchar(25),
email varchar(50)
);

insert into user values(10,"test","test@gm");
insert into user values(20,"leaf","leaf@gm");

commit;