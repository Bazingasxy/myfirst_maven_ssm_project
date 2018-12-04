-- 产品表
CREATE TABLE product(
id varchar2(32) default SYS_GUID() PRIMARY KEY,
productNum VARCHAR2(50) NOT NULL,
productName VARCHAR2(50),
cityName VARCHAR2(50),
DepartureTime timestamp,
productPrice Number,
productDesc VARCHAR2(500),
productStatus INT,
CONSTRAINT product UNIQUE (id, productNum)
)

update product set productnum='001' where id='9F71F01CB448476DAFB309AA6DF9497F';
select * from product;
insert into PRODUCT (id, productnum, productname, cityname, departuretime, productprice, productdesc, productstatus) values ('676C5BD1D35E429A8C2E114939C5685A', '002', '北京三日游', '北京', to_timestamp('10-10-2018 10:10:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), 1200, '不错的旅行', 1);
insert into PRODUCT (id, productnum, productname, cityname, departuretime, productprice,productdesc, productstatus) values ('12B7ABF2A4C544568B0A7C69F36BF8B7', '003', '上海五日游', '上海', to_timestamp('25-04-2018 14:30:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), 1800, '魔都我来了', 0);
insert into PRODUCT (id, productnum, productname, cityname, departuretime, productprice,productdesc, productstatus) values ('9F71F01CB448476DAFB309AA6DF9497F', '001', '北京三日游', '北京', to_timestamp('10-10-2018 10:10:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), 1200, '不错的旅行', 1);
drop table product


-- 订单
drop table orders;
CREATE TABLE orders(
  id varchar2(32) default SYS_GUID() PRIMARY KEY,
  orderNum VARCHAR2(20) NOT NULL UNIQUE,
  orderTime timestamp,
  peopleCount INT,
  orderDesc VARCHAR2(500),
  payType INT,
  orderStatus INT,
  productId varchar2(32),
  memberId varchar2(32),
  FOREIGN KEY (productId) REFERENCES product(id),
  FOREIGN KEY (memberId) REFERENCES member(id)
)
select * from orders
insert into ORDERS (id, ordernum, ordertime, peoplecount, orderdesc, paytype, orderstatus, productid, memberid)
values ('0E7231DC797C486290E8713CA3C6ECCC', '12345', to_timestamp('02-03-2018 12:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), 2, '没什么', 0, 1, '676C5BD1D35E429A8C2E114939C5685A', 'E61D65F673D54F68B0861025C69773DB');
insert into ORDERS (id, ordernum, ordertime, peoplecount, orderdesc, paytype, orderstatus, productid, memberid)
values ('5DC6A48DD4E94592AE904930EA866AFA', '54321', to_timestamp('02-03-2018 12:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), 2, '没什么', 0, 1, '676C5BD1D35E429A8C2E114939C5685A', 'E61D65F673D54F68B0861025C69773DB');
insert into ORDERS (id, ordernum, ordertime, peoplecount, orderdesc, paytype, orderstatus, productid, memberid)
values ('2FF351C4AC744E2092DCF08CFD314420', '67890', to_timestamp('02-03-2018 12:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), 2, '没什么', 0, 1, '12B7ABF2A4C544568B0A7C69F36BF8B7', 'E61D65F673D54F68B0861025C69773DB');
insert into ORDERS (id, ordernum, ordertime, peoplecount, orderdesc, paytype, orderstatus, productid, memberid)
values ('A0657832D93E4B10AE88A2D4B70B1A28', '98765', to_timestamp('02-03-2018 12:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), 2, '没什么', 0, 1, '12B7ABF2A4C544568B0A7C69F36BF8B7', 'E61D65F673D54F68B0861025C69773DB');
insert into ORDERS (id, ordernum, ordertime, peoplecount, orderdesc, paytype, orderstatus, productid, memberid)
values ('E4DD4C45EED84870ABA83574A801083E', '11111', to_timestamp('02-03-2018 12:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), 2, '没什么', 0, 1, '12B7ABF2A4C544568B0A7C69F36BF8B7', 'E61D65F673D54F68B0861025C69773DB');
insert into ORDERS (id, ordernum, ordertime, peoplecount, orderdesc, paytype, orderstatus, productid, memberid)
values ('96CC8BD43C734CC2ACBFF09501B4DD5D', '22222', to_timestamp('02-03-2018 12:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), 2, '没什么', 0, 1, '12B7ABF2A4C544568B0A7C69F36BF8B7', 'E61D65F673D54F68B0861025C69773DB');
insert into ORDERS (id, ordernum, ordertime, peoplecount, orderdesc, paytype, orderstatus, productid, memberid)
values ('55F9AF582D5A4DB28FB4EC3199385762', '33333', to_timestamp('02-03-2018 12:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), 2, '没什么', 0, 1, '9F71F01CB448476DAFB309AA6DF9497F', 'E61D65F673D54F68B0861025C69773DB');
insert into ORDERS (id, ordernum, ordertime, peoplecount, orderdesc, paytype, orderstatus, productid, memberid)
values ('CA005CF1BE3C4EF68F88ABC7DF30E976', '44444', to_timestamp('02-03-2018 12:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), 2, '没什么', 0, 1, '9F71F01CB448476DAFB309AA6DF9497F', 'E61D65F673D54F68B0861025C69773DB');
insert into ORDERS (id, ordernum, ordertime, peoplecount, orderdesc, paytype, orderstatus, productid, memberid)
values ('3081770BC3984EF092D9E99760FDABDE', '55555', to_timestamp('02-03-2018 12:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), 2, '没什么', 0, 1, '9F71F01CB448476DAFB309AA6DF9497F', 'E61D65F673D54F68B0861025C69773DB');


-- 会员
drop table member;
CREATE TABLE member(
       id varchar2(32) default SYS_GUID() PRIMARY KEY,
       NAME VARCHAR2(20),
       nickname VARCHAR2(20),
       phoneNum VARCHAR2(20),
       email VARCHAR2(20) 
);
insert into MEMBER (id, name, nickname, phonenum, email)
values ('E61D65F673D54F68B0861025C69773DB', '张三', '小三', '18888888888', 'zs@163.com');
select * from member
select * from traveller
-- 旅客
drop table traveller;
CREATE TABLE traveller(
  id varchar2(32) default SYS_GUID() PRIMARY KEY,
  NAME VARCHAR2(20),
  sex VARCHAR2(20),
  phoneNum VARCHAR2(20),
  credentialsType INT,
  credentialsNum VARCHAR2(50),
  travellerType INT
)
insert into TRAVELLER (id, name, sex, phonenum, credentialstype, credentialsnum, travellertype)
values ('3FE27DF2A4E44A6DBC5D0FE4651D3D3E', '张龙', '男', '13333333333', 0, '123456789009876543', 0);
insert into TRAVELLER (id, name, sex, phonenum, credentialstype, credentialsnum, travellertype)
values ('EE7A71FB6945483FBF91543DBE851960', '张小龙', '男', '15555555555', 0, '987654321123456789', 1);

-- 订单与旅客中间表
drop table order_traveller;
CREATE TABLE order_traveller(
  orderId varchar2(32),
  travellerId varchar2(32),
  PRIMARY KEY (orderId,travellerId),
  FOREIGN KEY (orderId) REFERENCES orders(id),
  FOREIGN KEY (travellerId) REFERENCES traveller(id)
)

insert into ORDER_TRAVELLER (orderid, travellerid) 
values ('0E7231DC797C486290E8713CA3C6ECCC', '3FE27DF2A4E44A6DBC5D0FE4651D3D3E'); 
insert into ORDER_TRAVELLER (orderid, travellerid) 
values ('2FF351C4AC744E2092DCF08CFD314420', '3FE27DF2A4E44A6DBC5D0FE4651D3D3E'); 
insert into ORDER_TRAVELLER (orderid, travellerid) 
values ('3081770BC3984EF092D9E99760FDABDE', 'EE7A71FB6945483FBF91543DBE851960'); 
insert into ORDER_TRAVELLER (orderid, travellerid) 
values ('55F9AF582D5A4DB28FB4EC3199385762', 'EE7A71FB6945483FBF91543DBE851960'); 
insert into ORDER_TRAVELLER (orderid, travellerid) 
values ('5DC6A48DD4E94592AE904930EA866AFA', '3FE27DF2A4E44A6DBC5D0FE4651D3D3E'); 
insert into ORDER_TRAVELLER (orderid, travellerid) 
values ('96CC8BD43C734CC2ACBFF09501B4DD5D', 'EE7A71FB6945483FBF91543DBE851960'); 
insert into ORDER_TRAVELLER (orderid, travellerid) 
values ('A0657832D93E4B10AE88A2D4B70B1A28', '3FE27DF2A4E44A6DBC5D0FE4651D3D3E');
insert into ORDER_TRAVELLER (orderid, travellerid) 
values ('CA005CF1BE3C4EF68F88ABC7DF30E976', 'EE7A71FB6945483FBF91543DBE851960'); 
insert into ORDER_TRAVELLER (orderid, travellerid) 
values ('E4DD4C45EED84870ABA83574A801083E', 'EE7A71FB6945483FBF91543DBE851960');



select * from orders o left join product p on o.productid=p.id

select * from(
select rownum r,t.* from (select o.*,p.id pid,p.productname,p.productprice from orders o join product p on o.productid=p.id) t where rownum<=6
) where r>=3

select * from member
select * from order_traveller
select * from traveller,member
select * from orders where id='0E7231DC797C486290E8713CA3C6ECCC'
select * from product
select * from orders
select o.id oid,o.ordertime,o.peoplecount,o.paytype,o.orderstatus,
t.id tid,t.name tname,t.sex,t.phonenum tphonenum,t.credentialstype,t.credentialsnum,
p.*,
m.id mid,m.name mname,m.nickname,m.phonenum mphonenum,m.email memail from 
traveller t
left join order_traveller ot on t.id=ot.travellerid
left join orders o on ot.orderid=o.id 
left join product p on o.productid=p.id left join member m on o.memberid=m.id
where o.id='0E7231DC797C486290E8713CA3C6ECCC'

select 
o.id oid,o.ordertime,o.peoplecount,o.paytype,o.orderstatus,o.productid,o.memberid, 
t.id tid,t.name tname,t.sex,t.phonenum tphonenum,t.credentialstype,t.credentialsnum
from orders o left join order_traveller ot on ot.orderid=o.id left join traveller t on t.id=ot.travellerid

select * from traveller t left join order_traveller ot on ot.travellerid=t.id
select * from order_traveller
select 
o.id oid,o.ordertime,o.peoplecount,o.paytype,o.orderstatus,
t.id tid,t.name tname,t.sex,t.phonenum tphonenum,t.credentialstype,t.credentialsnum,
p.*,
m.id mid,m.name mname,m.nickname,m.phonenum mphonenum,m.email memail
from orders o 
left join order_traveller ot on o.id=ot.orderid
left join traveller t on t.id=ot.travellerid
left join product p on p.id=o.productid
left join member m on m.id=o.memberid where o.id='0E7231DC797C486290E8713CA3C6ECCC'



select 
o.*,
m.id memberId,m.name,m.nickname,m.phonenum,m.email,
p.id productId,p.productnum,p.productName,p.cityname,p.departuretime,p.Productprice,p.Productdesc,p.productstatus,
t.id t_id,t.name t_name,t.sex,t.phonenum t_phoneNum,t.credentialstype,t.credentialsnum,t.travellerType
from orders o 
left JOIN order_traveller ot on o.id=ot.orderid
INNER JOIN member m ON o.memberId = m.id
INNER JOIN product p ON o.productId = p.id
LEFT JOIN traveller t ON t.id = ot.travellerId
where o.id='0E7231DC797C486290E8713CA3C6ECCC'
---------------------------------------------------------------------------------

-- 用户表
CREATE TABLE users(
id varchar2(32) default SYS_GUID() PRIMARY KEY,
email VARCHAR2(50) UNIQUE NOT NULL,
username VARCHAR2(50),
PASSWORD VARCHAR2(50),
phoneNum VARCHAR2(20),
STATUS INT
);
insert into users values('1111','super@super.com','super','super',12345678957,1)
insert into users values('0000','lisi@lisi.com','lisi','123',12345678957,0)
select * from users
select * from users_role
select * from role
insert into role values('5555','ADMIN','vip')
insert into users_role values('0000','5555')
insert into role values('8888','USER','vip')
insert into users_role values('0000','8888')
update users set password='$2a$10$gp0ZABKsQvqmRMoiyY2Y9OfrjVo.htyPaCzxT9r4M34OlsPWEKu.W' where id='0000'
delete from users_role
delete from users
delete from role

-- 角色表
CREATE TABLE role(
id varchar2(32) default SYS_GUID() PRIMARY KEY, 
roleName VARCHAR2(50) ,
roleDesc VARCHAR2(50)
);

select * from role where id in(select roleid from users_role where userid=1)
select u.*,r.id rid,r.rolename,r.roledesc 
from users u 
inner join users_role ur on u.id=ur.userid 
left join role r on r.id=ur.roleid 
where u.username='zhangsan'

-- 用户角色关联表
CREATE TABLE users_role(
userId varchar2(32),
roleId varchar2(32),
PRIMARY KEY(userId,roleId),
FOREIGN KEY (userId) REFERENCES users(id),
FOREIGN KEY (roleId) REFERENCES role(id)
);
select * from permission
select * from role
insert into permission (permissionName,url) values('user findAll','/user/findAll');
insert into permission (permissionName,url) values('user findById','/user/findById')

insert into role_permission values('B198260050BA49598F71955F68B396D9','5555');
insert into role_permission values('DD02CA660E1D47259D2338A754D3B63F','5555');
insert into role_permission values('B198260050BA49598F71955F68B396D9','8888');
insert into role_permission values('8285662EDB9241E28AB9A466F927C4AC','5555');
select * from permission p where p.id not in(
select rp.permissionid from role_permission rp where rp.roleid='8888')
select * from permission
select * from role r where r.id not in (
        select roleid from users_role ur where ur.userid=#{userId})
        
select * from role_permission
-- 资源权限表
CREATE TABLE permission(
id varchar2(32) default SYS_GUID() PRIMARY KEY,
permissionName VARCHAR2(50) ,
url VARCHAR2(50)
);

-- 角色权限关联表
CREATE TABLE role_permission(
permissionId varchar2(32),
roleId varchar2(32),
PRIMARY KEY(permissionId,roleId),
FOREIGN KEY (permissionId) REFERENCES permission(id),
FOREIGN KEY (roleId) REFERENCES role(id)
);

select u.id,r.id r_id,r.rolename,r.roledesc
from users u 
inner join users_role ur on u.id=ur.userid
inner join role r on r.id=ur.roleid
where u.id='0000'


