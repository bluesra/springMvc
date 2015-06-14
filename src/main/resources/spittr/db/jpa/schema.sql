DROP database if exists isharedb;
CREATE DATABASE isharedb;

CREATE USER 'ais'@'localhost' IDENTIFIED BY 'ais0078';
CREATE USER 'ais'@'%' IDENTIFIED BY 'ais0078';
GRANT all privileges on isharedb.* to 'ais'@'%';
GRANT all privileges on isharedb.* to 'ais'@'localhost';


flush privileges;

#CREATE USER 'jeffrey'@'localhost' IDENTIFIED BY 'mypass';
#GRANT all privileges on isharedb.* to 'jeffrey'@'%' identified by 'ais0078';


drop table if exists spitter;
drop table if exists spittle;

create table spitter (
  ID int unsigned not null auto_increment primary key,
  username varchar(25) not null,
  password varchar(25) not null,
  fullName varchar(100) not null,
  email varchar(50) not null,
  updateByEmail boolean not null,
  status varchar(10) not null
);

create table spittle (
  ID int unsigned not null auto_increment primary key,
  spitter int not null,
  message varchar(1000) not null,
  postedTime datetime not null

);

insert into spitter(username, password, fullName, email, updateByEmail, status) VALUES ('jack', '123', 'jack yang', 'blu@w2.com', FALSE ,'ok');