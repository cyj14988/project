create database jsp_00_db2_board;
use jsp_00_db2_board;

create table member(
	id varchar(5),
    pw varchar(5),
    name varchar(3)
);

INSERT INTO member VALUES('AAA', '123', '정유진');
INSERT INTO member VALUES('BBB', '123', '정여진');
INSERT INTO member VALUES('CCC', '123', '정완모');
INSERT INTO member VALUES('DDD', '123', '임미경');
INSERT INTO member VALUES('EEE', '123', '정호두');

DESC member;
select * from member;
drop table member;

create table board(
	id varchar(5),
	number int(4),
    title varchar(10),    
    content varchar(100), #내용은 형식을 뭘로 주나
	type varchar(3)
);

INSERT INTO board VALUES('AAA', '1', '제목1', '내용1', '일반');
INSERT INTO board VALUES('BBB', '2', '제목2', '내용2', 'Q&A');
INSERT INTO board VALUES('AAA', '3', '제목3', '내용3', '익명');
INSERT INTO board VALUES('DDD', '4', '제목4', '내용4', '자유');
INSERT INTO board VALUES('AAA', '5', '제목5', '내용5', '일반');

DESC board;
select * from board;
drop table board;
