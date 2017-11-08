create table customer(
id int primary key auto_increment,
firstname varchar(100) not null,
lastname varchar(100) not null
);

insert into customer(id,firstname,lastname)
values (1,'mattia','romeo');
insert into customer(id,firstname,lastname)
values (2,'valentina','romeo');