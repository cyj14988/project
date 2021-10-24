CREATE DATABASE jsp_00_11_crud_mysql;

USE jsp_00_11_crud_mysql;

CREATE TABLE member(
	id VARCHAR(20),
    pw VARCHAR(20),
    name VARCHAR(20),
    reg_date DATETIME
);

DROP TABLE member;
DESC member;

INSERT INTO member (id, pw, name, reg_date) VALUES ('qwer', '1234', 'AAA', now());
INSERT INTO member VALUES ('abcd', '1234', 'NNN', now());
INSERT INTO member VALUES ('hello', '1234', 'CCC', now());
INSERT INTO member VALUES ('test', '1111', 'DDD', now());

SELECT * FROM member;
SELECT COUNT(*) FROM member WHERE id='abcd' AND pw='1234';

DELETE FROM member WHERE id='test';

UPDATE member SET name='DDD' WHERE id='hello'; 





