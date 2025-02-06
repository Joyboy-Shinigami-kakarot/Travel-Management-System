create  database travelmanagementsystem;

show databases;

use travelmanagementsystem;

create table account(username varchar(20),name varchar(20),password varchar(20),question varchar(100),answer varchar(50));

show tables;

drop table account;

create table account(username varchar(20),name varchar(20),password varchar(20),question varchar(100),answer varchar(50));

create table customer(username varchar(20),id varchar(30),number varchar(30),name varchar(30),gender varchar(20),country varchar(30),address varchar(50),phone varchar(12),email varchar(40));

select* from customer;

create table bookpackage(username varchar(20),package varchar(30),persons varchar(20),id varchar(30),number varchar(30),phone varchar(12),price varchar(20));

select * from bookpackage;

create table hotel(name varchar(30), costperperson varchar(20), acroom varchar(10), foodincluded varchar(10));

insert into hotel values('Raddison Blues Hotel', '34000', '1000','1700');
insert into hotel values('River View Hotel', '24000', '1600','1000');
insert into hotel values('Sonargoan Hotel', '49000', '1240','2900');

create table bookhotel(username varchar(20),name varchar(30),persons varchar(10),days varchar(10),ac varchar(10),food varchar(10),id varchar(10),number varchar(10),phone varchar(15),price varchar(20));

select * from hotel;

select * from account;
truncate TABLE account;
truncate TABLE customer;
truncate TABLE bookpackage;
drop table bookhotel;

CREATE TABLE hotelbooked (
    username VARCHAR(20),
    hotelname VARCHAR(30),
    persons VARCHAR(10),
    days VARCHAR(10),
    id VARCHAR(10),
    number VARCHAR(10),
    phone VARCHAR(15),
    price VARCHAR(20)
);
CREATE TABLE food_ac (
    username VARCHAR(20),
    ac VARCHAR(10),
    food VARCHAR(10)
);
SELECT 
    h.username, h.hotelname AS name, h.persons, h.days, 
    f.ac, f.food, h.id, h.number, h.phone, h.price 
FROM 
    hotelbooked h 
JOIN 
    food_ac f ON h.username = f.username;
    
select * from hotelbooked;
select * from food_ac;    


