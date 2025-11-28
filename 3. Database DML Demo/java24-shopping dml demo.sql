-- DML in theory
-- Lưu ý 
-- Nhập các bảng không có khóa ngoại trước(cha)
-- Nếu nhập các bảng có khóa ngoại, cho giá trị bằng null
-- Nhập các bảng có khóa ngoại và dữ liệu đúng với dũ liệu ở referenced table 
-- + DIS/EN-ABLE FOREIGN_KEY_CHECKS

use java24_shopping;
-- 0. SELECT
SELECT * FROM T07_ITEM_GROUP;
SELECT * FROM T26_ITEM_GROUP_BACKUP;
-- 1. INSERT 

INSERT INTO  T07_ITEM_GROUP (C07_ITEM_GROUP_ID,C07_ITEM_GROUP_NAME, C07_STATUS) VALUES
(1,'Áo',1),
(2,'Quần', 1);

-- auto increment
INSERT INTO  T07_ITEM_GROUP (C07_ITEM_GROUP_NAME, C07_STATUS) VALUES
('Giày',0),
('Dép',1);

-- insert with dummy data
INSERT INTO  T07_ITEM_GROUP (C07_ITEM_GROUP_ID,C07_ITEM_GROUP_NAME, C07_STATUS)
SELECT 5 CxId, "Mũ" CxName, 1 CxStatus
UNION ALL
SELECT 6, "Nón", 1;

-- insert with data form other table(s)
INSERT INTO T26_ITEM_GROUP_BACKUP(C26_ITEM_GROUP_ID, C26_ITEM_GROUP_NAME)
SELECT C07_ITEM_GROUP_ID, C07_ITEM_GROUP_NAME
  FROM T07_ITEM_GROUP
 WHERE C07_STATUS = 1;
 
 -- insert with a large of data(not from other tables(s))
 -- insert 100, 1000, 10000 rows
 -- procedure, function with for, if else

-- demo insert

