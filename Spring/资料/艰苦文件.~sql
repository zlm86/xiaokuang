create directory Spring_D as 'D:\Spring\Spring';

create temporary tablespace  Spring_temp  tempfile 'D:\Spring\Spring\Spring_TEMP.DBF' size 32M autoextend on next 32M extent management local;
create tablespace  Spring_data   logging datafile 'D:\Spring\Spring\Spring_DATA.DBF' size 200M autoextend on next 10M extent management local;

drop tablespace Spring_temp including contents and datafiles;  
drop tablespace Spring_data including contents and datafiles;  

create user Spring identified by Spring

default tablespace  Spring_data
temporary tablespace Spring_temp;

grant connect,resource to  Spring;
grant dba to  Spring;
grant unlimited tablespace to  Spring;


grant read,write on directory Spring_D to Spring;


µÇÂ¼Spring
-- Create table
create table STUDENT
(
  ID           VARCHAR2(32) not null,
  USERNAME     VARCHAR2(32),
  USERAGE      INTEGER,
  USERBIRTHDAY TIMESTAMP(6)
)
tablespace SPRING_DATA
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64
    next 8
    minextents 1
    maxextents unlimited
  );


 
