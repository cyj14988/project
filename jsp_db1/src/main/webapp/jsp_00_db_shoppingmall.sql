CREATE DATABASE jsp_00_db_shoppingmall;

USE jsp_00_db_shoppingmall;

CREATE TABLE member_tbl_02(
	custno int(6),
    custname varchar(20),
    phone VARCHAR(13),
    address varchar(4),
    joindate date,
    grade CHAR(1),
    city char(2),
    primary key(custno)
);
drop table member_tbl_02;
DESC member_tbl_02;

INSERT INTO member_tbl_02 VALUES(100001, '김행복', '010-1111-2222', 'SK', '20151202', 'A', '01');
INSERT INTO member_tbl_02 VALUES(100002, '이축복', '010-1111-3333', 'SK', '20151206', 'B', '01');
INSERT INTO member_tbl_02 VALUES(100003, '장믿음', '010-1111-4444', 'LG', '20151001', 'B', '30');
INSERT INTO member_tbl_02 VALUES(100004, '최사랑', '010-1111-5555', 'KT', '20151113', 'A', '30');
INSERT INTO member_tbl_02 VALUES(100005, '진평화', '010-1111-6666', 'SK', '20151225', 'B', '60');
INSERT INTO member_tbl_02 VALUES(100006, '차공단', '010-1111-7777', 'LG', '20151211', 'C', '60');

SELECT * FROM member_tbl_02;

CREATE TABLE money_tbl_02(
	custno int(6),
    salenol int(8),
    pcost int(8),
    amount int(4),
    price int(8),
    pcode varchar(4),
    sdate date,
    primary key(custno, salenol)
);
DESC money_tbl_02;
drop table money_tbl_02;

INSERT INTO money_tbl_02 VALUES('100001', '20160001', '500', '5', '2500', 'A001', '20160101');
INSERT INTO money_tbl_02 VALUES('100001', '20160002', '1000', '4', '4000', 'A002', '20160101');
INSERT INTO money_tbl_02 VALUES('100001', '20160003', '500', '3', '1500', 'A003', '20160101');
INSERT INTO money_tbl_02 VALUES('100002', '20160004', '2000', '1', '2000', 'A004', '20160102');
INSERT INTO money_tbl_02 VALUES('100002', '20160005', '500', '1', '500', 'A001', '20160103');
INSERT INTO money_tbl_02 VALUES('100003', '20160006', '1500', '2', '3000', 'A003', '20160103');
INSERT INTO money_tbl_02 VALUES('100004', '20160007', '500', '2', '1000', 'A001', '20160104');
INSERT INTO money_tbl_02 VALUES('100004', '20160008', '300', '1', '300', 'A005', '20160104');
INSERT INTO money_tbl_02 VALUES('100004', '20160009', '600', '1', '600', 'A006', '20160104');
INSERT INTO money_tbl_02 VALUES('100004', '20160010', '3000', '1', '3000', 'A007', '20160106');

select * from money_tbl_02;
