-- DML in theory

USE java24_shopping;
-- 0. SELECT
SELECT * FROM T07_ITEM_GROUP;
SELECT * FROM T26_ITEM_GROUP_BACKUP;
SELECT * FROM T01_ITEM;

-- 3. UPDATE
UPDATE T07_ITEM_GROUP
SET C07_STATUS = 0;

UPDATE T07_ITEM_GROUP
SET C07_STATUS = 1
WHERE C07_ITEM_GROUP_ID MOD 2 != 0; 


-- AUTO_COMMIT
-- false --> update(s) --> staging --> commit(new) || rollback(old) --> database
-- true  --> update(s) --> database

SET FOREIGN_KEY_CHECKS = 0;
SET FOREIGN_KEY_CHECKS = 1;
SET autocommit = 1;
SET autocommit = 0;
commit;
rollback; -- rollback được data từ staging tính từ last commit(transaction)

-- 2. DELETE/TRUNCATE
DELETE FROM T07_ITEM_GROUP WHERE C07_ITEM_GROUP_ID = 3;

-- Error Code: 1451. Cannot delete or update a parent row: a foreign key constraint fails (`java24_shopping`.`t01_item`, CONSTRAINT `FK_T01_T07` FOREIGN KEY (`C01_ITEM_GROUP_ID`) REFERENCES `t07_item_group` (`C07_ITEM_GROUP_ID`))
DELETE FROM T07_ITEM_GROUP WHERE C07_ITEM_GROUP_ID = 7;

DELETE FROM T07_ITEM_GROUP;

-- Error Code: 1701. Cannot truncate a table referenced in a foreign key constraint (`java24_shopping`.`t01_item`, CONSTRAINT `FK_T01_T07`)
-- Xóa 1 table, table đó có bị tham chiếu bởi 1 table khác(ko cho), ko cần check dữ liệu
-- disable fk check

TRUNCATE TABLE T07_ITEM_GROUP; -- MYSQL DML

INSERT INTO T07_ITEM_GROUP(C07_ITEM_GROUP_NAME, C07_STATUS) VALUES
('Áo', 1),
('Quần', 1);

-- 3. INSERT
INSERT INTO T07_ITEM_GROUP(C07_ITEM_GROUP_ID, C07_ITEM_GROUP_NAME, C07_STATUS) VALUES
(1, 'Áo', 1),
(2, 'Quần', 1);

-- auto increment
INSERT INTO T07_ITEM_GROUP(C07_ITEM_GROUP_NAME, C07_STATUS) VALUES
('Giày', 0),
('Dép', 1);

-- insert with dummy data
INSERT INTO T07_ITEM_GROUP(C07_ITEM_GROUP_ID, C07_ITEM_GROUP_NAME, C07_STATUS)
SELECT 5 CxId, 'Mũ' CxName, 1 CxStatus
UNION ALL
SELECT 6, 'Nón', 1;

-- insert with data from other table(s)
INSERT INTO T26_ITEM_GROUP_BACKUP(C26_ITEM_GROUP_ID, C26_ITEM_GROUP_NAME)
SELECT C07_ITEM_GROUP_ID, C07_ITEM_GROUP_NAME
  FROM T07_ITEM_GROUP
 WHERE C07_STATUS = 1;

-- insert with a large of data(not from other table(s))
-- insert 100, 1000, 10000 rows
-- procedure, function with for, if else 
 
-- demo insert for test data
-- Error Code: 1452. Cannot add or update a child row: a foreign key constraint fails (`java24_shopping`.`t01_item`, CONSTRAINT `FK_T01_T07` FOREIGN KEY (`C01_ITEM_GROUP_ID`) REFERENCES `t07_item_group` (`C07_ITEM_GROUP_ID`))

-- disabled fk check
SET FOREIGN_KEY_CHECKS = 0;

INSERT INTO T01_ITEM (C01_ITEM_ID, C01_ITEM_NAME, C01_ITEM_GROUP_ID, C01_COLOR) VALUES
(2, 'Túi xách 1', 7, 'RED'),
(3, 'Túi xách 2', 7, 'BLUE');

INSERT INTO T07_ITEM_GROUP(C07_ITEM_GROUP_ID, C07_ITEM_GROUP_NAME, C07_STATUS) VALUES
(7, 'Túi xách', 1);

-- enabled fk check(use for next time checking, not validate at the time enabled the key)
SET FOREIGN_KEY_CHECKS = 1;

