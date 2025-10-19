INSERT INTO T07_ITEM_GROUP (C07_ITEM_GROUP_ID, C07_ITEM_GROUP_NAME, C07_STATUS) VALUES
(1, 'Áo', 1),
(2, 'Quần', 1),
(3, 'Giày', 1),
(4, 'Dép', 1),
(5, 'Mũ', 1),
(6, 'Thắt lưng', 1),
(7, 'Túi xách', 1);

INSERT INTO T01_ITEM (C01_ITEM_ID, C01_ITEM_NAME, C01_ITEM_GROUP_ID, C01_COLOR) VALUES
(1, 'Áo 1', 1, 'RED'),
(2, 'Áo 2', 1, 'GREEN'),
(3, 'Áo 3', 1, 'BLUE'),
(4, 'Quần 4', 2, 'BLACK'),
(5, 'Quần 5', 2, 'WHITE'),
(6, 'Giày 6', 3, 'WHILTE'),
(7, 'Giày 7', 3, 'ORIGIN'),
(8, 'Giày 8', 3, 'GRAY'),
(9, 'Giày 9', 3, 'RED'),
(10, 'Giày 10', 3, 'GREEN'),
(11, 'Giép 11', 4, 'BLUE'),
(12, 'Áo 12', 1, 'BLACK'),
(13, 'Giép 13', 4, 'WHITE'),
(14, 'Mũ 14', 5, 'WHILTE'),
(15, 'Mũ 15', 5, 'ORIGIN'),
(16, 'Thắt lưng 16', 6, 'GRAY'),
(17, 'Thắt lưng 17', 6, 'BLUE'),
(18, 'Mũ 18', 5, 'BLACK'),
(19, 'Túi xách 1', 7, 'WHITE'),
(20, 'Túi xách 2', 7, 'WHILTE');

-- T02_SIZE
CALL p_insert_into_size();

INSERT INTO T06_PROVIDER (C06_PROVIDER_ID, C06_PROVIDER_NAME, C06_PROVIDER_TAX) VALUES
(1, 'Nhà cung cấp N1', '147258369'),
(2, 'Nhà cung cấp N2', '247258369'),
(3, 'Nhà cung cấp N3', '347258369'),
(4, 'Nhà cung cấp N4', '447258369'),
(5, 'Nhà cung cấp N5', '547258369');

INSERT INTO T17_DEPARTMENT (C17_DEPARTMENT_ID, C17_DEPARTMENT_NAME) VALUES
(1, 'Phòng quản lý'),
(2, 'Phòng nhân sự'),
(3, 'Phòng quảng cáo'),
(4, 'Phòng cơ sở vật chất');

-- T16_EMPLOYEE
CALL p_insert_into_employee();
UPDATE T16_EMPLOYEE SET C16_DEPARTMENT_ID = 2 WHERE C16_EMPLOYEE_ID IN (3,7);
UPDATE T16_EMPLOYEE SET C16_DEPARTMENT_ID = 3 WHERE C16_EMPLOYEE_ID = 8;
UPDATE T16_EMPLOYEE SET C16_DEPARTMENT_ID = 4 WHERE C16_EMPLOYEE_ID = 10;

INSERT INTO T04_WAREHOUSE_RECEIPT(C04_WHRECEIPT_ID,C04_WHRECEIPT_TIME,C04_EMPLOYEE_ID)
SELECT C16_EMPLOYEE_ID, DATE_SUB(current_timestamp(), INTERVAL C16_EMPLOYEE_ID DAY), C16_EMPLOYEE_ID FROM T16_EMPLOYEE;

-- T05_WAREHOUSE_RECEIPT_DETAIL
INSERT INTO T05_WAREHOUSE_RECEIPT_DETAIL(C05_WHRECEIPT_ID,C05_ITEM_ID,C05_AMOUNT,C05_BUY_PRICE,C05_PROVIDER_ID)
WITH CTE_WHRECEIPT_DETAIL AS (
	-- whId, itemId là số lẻ
SELECT t4.C04_WHRECEIPT_ID whId,
       t1.C01_ITEM_ID itemId,
       777 amount,
       f_random(50, 200) buyPrice,
       f_random(1,5) providerId
  FROM T04_WAREHOUSE_RECEIPT t4, T01_ITEM t1
 WHERE t4.C04_WHRECEIPT_ID MOD 2 != 0
   AND t1.C01_ITEM_ID MOD 2 != 0
UNION ALL
SELECT t4.C04_WHRECEIPT_ID whId,
       t1.C01_ITEM_ID itemId,
       820 amount,
       f_random(100, 200) buyPrice,
       f_random(1,5) providerId
  FROM T04_WAREHOUSE_RECEIPT t4, T01_ITEM t1
 WHERE t4.C04_WHRECEIPT_ID MOD 2 = 0
   AND t1.C01_ITEM_ID MOD 2 = 0
-- whId, itemId là số chẵn
)
SELECT * FROM CTE_WHRECEIPT_DETAIL;

-- T03_ITEM_DETAIL

-- Tìm giá bán cao nhất cho mỗi mặt hàng
SELECT * FROM T05_WAREHOUSE_RECEIPT_DETAIL;


-- item, size lẻ
INSERT INTO T03_ITEM_DETAIL(C03_ITEM_ID,C03_SIZE_ID,C03_SALES_PRICE,C03_AMOUNT)
WITH CTE_ITEM_BUY_PRICE AS (
	SELECT C05_ITEM_ID itemId,
           MAX(C05_BUY_PRICE) buyPrice 
	  FROM T05_WAREHOUSE_RECEIPT_DETAIL
	 GROUP BY C05_ITEM_ID
), CTE_ITEM_DETAILS AS (
	SELECT t1.C01_ITEM_ID itemId,
		   t2.C02_SIZE_ID sizeId,
		   cte_bprice.buyPrice*2 + t2.C02_SIZE_ID*5 salesPrice,
		   125 amount
	  FROM T01_ITEM t1, T02_SIZE t2, CTE_ITEM_BUY_PRICE cte_bprice
	  WHERE t1.C01_ITEM_ID MOD 2 != 0
	   AND t2.C02_SIZE_ID MOD 2 != 0
	   AND t1.C01_ITEM_ID = cte_bprice.itemId
	UNION ALL
	SELECT t1.C01_ITEM_ID itemId, -- item, size chẵn
		   t2.C02_SIZE_ID sizeId,
		   cte_bprice.buyPrice*2 + t2.C02_SIZE_ID*5 + 20 salesPrice,
		   280 amount
	  FROM T01_ITEM t1, T02_SIZE t2, CTE_ITEM_BUY_PRICE cte_bprice
	  WHERE t1.C01_ITEM_ID MOD 2 = 0
	   AND t2.C02_SIZE_ID MOD 2 = 0
	   AND t1.C01_ITEM_ID = cte_bprice.itemId
)
SELECT * FROM CTE_ITEM_DETAILS;

   

    

   
   
  


