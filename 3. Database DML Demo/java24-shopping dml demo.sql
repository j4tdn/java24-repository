-- DML in theory

USE java24_shopping;
-- 0.SELECT
select * from t07_item_group;
select * from t26_item_group_backup;
select * from t01_item;

-- 1. UPDATE
update t07_item_group
set c07_status = 0;
 
update t07_item_group
set c07_status = 1
where c07_item_group_id mod 2 != 0;

-- auto_commit
-- false --> update(s) --> staging --> commit(new) || rollback(old) --> database
-- true --> update(s) --> database

set autocommit = 1;
set autocommit = 0;
commit;
rollback; -- rollback được data từ staging tính từ last commit(transaction)

-- 2. DELETE/TRUNCATE  
-- phân biệt delete/ truncate : 
-- detele và truncate đều hỗ trợ xóa dữ liệu trong table
-- delete có thể xóa toàn bộ / kèm điều kiện ========= còn truncate luôn xóa toàn bộ
-- delete khi xóa có thể check từng dòng dữ liệu xem thử data có đang bị ref bởi table khác ko, nếu có báo lỗi
-- truncate sẽ kiểm tra nếu hiện tại có fk nào đang ref tới table đó thì sẽ báo lỗi luôn, ko kiểm tra từng dòng dữ liệu
-- delete khi xóa ko reset giá trị auto increment, truncate thì có
delete from t07_item_group where C07_ITEM_GROUP_ID = 3;

delete from t07_item_group where C07_ITEM_GROUP_ID = 7;

delete from t07_item_group;

-- xóa 1 table, table đó có bị tham chiếu bởi table khác => ko cho, ko cần check dữ liệu
-- disable fk check
truncate table t07_item_group; -- MYSQL DML
    
-- 3.INSERT
INSERT INTO t07_item_group (C07_ITEM_GROUP_ID,C07_ITEM_GROUP_NAME,C07_STATUS) VALUES
(1, "Áo", 1),
(2, "Quần", 1);

-- auto increment
INSERT INTO t07_item_group (C07_ITEM_GROUP_NAME,C07_STATUS) VALUES
("Dép", 1),
("Giày", 0);

-- insert with select
INSERT INTO t07_item_group (C07_ITEM_GROUP_ID,C07_ITEM_GROUP_NAME,C07_STATUS)
select 5 CxID, "Mũ" CxName, 1 CxStatus
UNION ALL
SELECT 6, "Nón", 1;

-- insert with data from other table(s)
insert into t26_item_group_backup (C26_ITEM_GROUP_ID,C26_ITEM_GROUP_NAME)
select c07_item_group_id, C07_item_group_name
  from t07_item_group
where C07_STATUS = 1;

-- insert with a large of data(not from other table(s))
-- insert 100, 1000, 10000 rows
-- procedure, function with for, if else


-- demo insert for test data

-- disabled fk check
Set foreign_key_checks = 0;

insert into t01_item (c01_item_id, c01_item_name, c01_item_group_id, C01_color) values
(2, "Túi xách 1", 7, "RED"),
(3, "Túi xách 2", 7, "BLUE");

insert into t07_item_group (c07_item_group_id, c07_item_group_name, c07_status) values
(7, "Túi xách 1", 1);

-- enable fk check (use for next time checking not validate at the time enabled the key)
set foreign_key_checks = 1;







