use java24_shopping;

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

CALL p_insert_into_size();

-- T06
INSERT INTO T06_PROVIDER (C06_PROVIDER_ID, C06_PROVIDER_NAME, C06_PROVIDER_TAX) VALUES
(1, 'Nhà cung cấp N1', '147258369'),
(2, 'Nhà cung cấp N2', '247258369'),
(3, 'Nhà cung cấp N3', '347258369'),
(4, 'Nhà cung cấp N4', '447258369'),
(5, 'Nhà cung cấp N5', '547258369');



-- T17
INSERT INTO T17_DEPARTMENT (C17_DEPARTMENT_ID, C17_DEPARTMENT_NAME) VALUES
(1, 'Phòng quản lý'),
(2, 'Phòng nhân sự'),
(3, 'Phòng quảng cáo'),
(4, 'Phòng cơ sở vật chất');

-- T16_EMPLOYEE
CALL p_insert_into_employee();
UPDATE t16_employee SET C16_DEPARTMENT_ID = 2 WHERE C16_EMPLOYEE_ID IN (3,7);
UPDATE t16_employee SET C16_DEPARTMENT_ID = 3 WHERE C16_EMPLOYEE_ID = 8;
UPDATE t16_employee SET C16_DEPARTMENT_ID = 4 WHERE C16_EMPLOYEE_ID = 10;

SELECT * FROM t16_employee;


-- t04_warehouse_receipt
SELECT DATE_SUB(current_timestamp(), INTERVAL 1 MONTH);

INSERT INTO t04_warehouse_receipt(C04_WHRECEIPT_ID, C04_WHRECEIPT_TIME, C04_EMPLOYEE_ID)
SELECT C16_EMPLOYEE_ID, DATE_SUB(current_timestamp(),
 INTERVAL C16_EMPLOYEE_ID DAY), 
 C16_EMPLOYEE_ID 
 FROM T16_EMPLOYEE;
 
 SELECT * FROM t04_warehouse_receipt;
 
 -- t05_warehouse_receipt_detail
INSERT INTO t05_warehouse_receipt_detail(C05_WHRECEIPT_ID, C05_ITEM_ID, C05_AMOUNT, C05_BUY_PRICE, C05_PROVIDER_ID)
WITH CTE_C04_WHRECEIP_DETAIL AS (
-- WHRECEIPT_ID, ITEM_ID là số lẻ
SELECT T4.C04_WHRECEIPT_ID whId, T1.C01_ITEM_ID itemId,
		777 MOUNT, f_random(50, 200) buyPrice, f_random(1, 5) provider_id
  FROM t04_warehouse_receipt T4, t01_item T1
 WHERE T4.C04_WHRECEIPT_ID MOD 2 != 0
   AND T1.C01_ITEM_ID MOD 2 != 0
UNION ALL
-- -- WHRECEIPT_ID, ITEM_ID là số chẵn
SELECT T4.C04_WHRECEIPT_ID whId, T1.C01_ITEM_ID itemId,
		820 MOUNT, f_random(100, 200) buyPrice, f_random(1, 5) providerId
  FROM t04_warehouse_receipt T4, t01_item T1
 WHERE T4.C04_WHRECEIPT_ID MOD 2 = 0
   AND T1.C01_ITEM_ID MOD 2 = 0
)
SELECT * FROM CTE_C04_WHRECEIP_DETAIL;

-- T03_ITEM_DETAIL

-- Tìm giá bán cao nhất cho mỗi mặt hàng
 SELECT * FROM t05_warehouse_receipt_detail;
 



-- ITEM, SIZE LẺ
INSERT INTO t03_item_detail(C03_ITEM_ID, C03_SIZE_ID, C03_SALES_PRICE, C03_AMOUNT)
WITH CTE_ITEM_BUY_PRICE AS (
	 SELECT C05_ITEM_ID itemId, max(C05_BUY_PRICE) calcBuyPrice
	   FROM t05_warehouse_receipt_detail
	  GROUP BY C05_ITEM_ID
), CTE_ITEM_DETAIL AS (
SELECT T1.C01_ITEM_ID itemId, 
	   T2.C02_SIZE_ID sizeId,
       cte_bprice.calcBuyPrice*2 + T2.C02_SIZE_ID*5 salePrice,
       125 AMOUNT
  FROM t01_item T1, t02_size T2, CTE_ITEM_BUY_PRICE cte_bprice
 WHERE T1.C01_ITEM_ID MOD 2 != 0
   AND T2.C02_SIZE_ID MOD 2 != 0
   AND T1.C01_ITEM_ID = cte_bprice.itemId
-- ITEM, SIZE CHẴN
UNION ALL
SELECT T1.C01_ITEM_ID itemId, 
	   T2.C02_SIZE_ID sizeId,
       cte_bprice.calcBuyPrice*2 + T2.C02_SIZE_ID*5 + 20 salePrice ,
       280 AMOUNT
  FROM t01_item T1, t02_size T2, CTE_ITEM_BUY_PRICE cte_bprice
 WHERE T1.C01_ITEM_ID MOD 2 = 0
   AND T2.C02_SIZE_ID MOD 2 = 0
   AND T1.C01_ITEM_ID = cte_bprice.itemId
)
SELECT * FROM CTE_ITEM_DETAIL;

SELECT * FROM t03_item_detail;

-- T08_GALERY

INSERT INTO t08_gallery(C08_IMAGE_PATH, C08_ITEM_ID)
SELECT concat('file://images/shopping/s_', C01_ITEM_ID, '.png'),
	   C01_ITEM_ID
 FROM t01_item;

-- t11_payment_method

INSERT INTO T11_PAYMENT_METHOD (C11_PAYMENT_METHOD_ID, C11_PAYMENT_METHOD_NAME) VALUES
(1, 'Tiền mặt'),
(2, 'Thẻ tín dụng'),
(3, 'Thẻ ghi nợ'),
(4, 'Ví điện tử');

-- t15_customers

call p_insert_into_customer();

select * from t15_customer;

-- t18_delivery
insert into t18_delivery_address (
			C18_DELIVERY_ADDRESS_ID, C18_CUSTOMER_ID,
            C18_RECEIVER_NAME, C18_RECEIVER_PHONE, C18_ADDRESS)
select C15_CUSTOMER_ID, C15_CUSTOMER_ID, 
		concat('Người nhận', C15_CUSTOMER_ID),
        '123456789',
        concat('Địa chỉ', C15_CUSTOMER_ID)
from t15_customer;

select * from t18_delivery_address;

-- T09_ORDER

INSERT INTO T09_ORDER 
(C09_ORDER_ID, C09_ORDER_TIME, C09_PAYMENT_METHOD_ID, C09_CUSTOMER_ID, C09_DELIVERY_ADDRESS_ID, C09_EMPLOYEE_ID)
VALUES
(1,  STR_TO_DATE('10.04.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 1, 1, 1, 1),
(2,  STR_TO_DATE('12.04.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 1, 2, 2, 2),
(3,  STR_TO_DATE('14.04.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 2, 3, 3, 3),
(4,  STR_TO_DATE('16.04.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 3, 4, 4, 4),
(5,  STR_TO_DATE('18.04.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 4, 5, 5, 5),
(6,  STR_TO_DATE('12.04.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 3, 6, 6, 8),
(7,  STR_TO_DATE('14.04.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 2, 7, 7, 7),
(8,  STR_TO_DATE('18.04.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 1, 8, 8, 6),
(9,  STR_TO_DATE('18.04.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 4, 9, 9, 10),
(10, STR_TO_DATE('18.04.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 4, 10, 10, 2),
(11, STR_TO_DATE('20.04.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 3, 2, 2, 9),
(12, STR_TO_DATE('26.04.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 2, 4, 4, 5),
(13, STR_TO_DATE('28.04.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 1, 6, 6, 1);

-- t19_voucher
INSERT INTO T19_VOUCHER 
(C19_VOUCHER_ID, C19_REDUCING_MONEY, C19_REDUCING_IN_PERCENT, C19_DATE_START, C19_DATE_END, C19_VOUCHER_STATUS)
VALUES
(1, 50000,  NULL, '2024-04-01', '2024-04-30', 1),
(2, 100000, NULL, '2024-05-01', '2024-05-31', 0),
(3, NULL, 5,  '2024-06-01', '2024-06-15', 1),
(4, NULL, 10, '2024-06-10', '2024-06-30', 0),
(5, NULL, 20, '2024-07-01', '2024-07-31', 1);

-- t10_bill
insert into t10_bill (C10_BILL_ID, C10_ORDER_ID, C10_DELIVERY_FEE, C10_VOUCHER_ID, C10_TOTAL_OF_MONEY)
select C09_ORDER_ID c10_bill_id, 
	   C09_ORDER_ID,
       elt(f_random(1, 5), 20, 30, 40, 50, 60),
       f_random(1, (select max(C19_VOUCHER_ID) from T19_VOUCHER)),
       0
  from t09_order
 where C09_ORDER_ID not in (11, 12);
 
 -- t12_order_detail
INSERT INTO T12_ORDER_DETAIL (C12_ORDER_ID, C12_ITEM_DETAIL_ID, C12_AMOUNT) VALUES
(1, 1, 2), (1, 3, 4), (2, 4, 2), (2, 5, 2), (3, 6, 4),
(3, 2, 4), (4, 8, 2), (4, 12, 4), (5, 88, 1), (5, 22, 3),
(5, 11, 1), (5, 33, 1), (6, 2, 1), (7, 1, 2), (8, 27, 1),
(8, 23, 1), (8, 98, 2), (9, 100, 6), (9, 11, 7), (9, 45, 2),
(9, 22, 2), (9, 32, 1), (10, 18, 2), (10, 29, 4), (11, 33, 2), 
(11, 65, 1), (11, 1, 1), (11, 2, 2), (11, 5, 5), (11, 7, 10),
(12, 55, 1), (13, 92, 1), (13, 14, 2);
 
 -- t13_order_status
INSERT INTO T13_ORDER_STATUS (C13_ORDER_STATUS_ID, C13_ORDER_STATUS_DESC) VALUES
(1, 'Chờ xác nhận'),
(2, 'Đang đóng gói'),
(3, 'Đóng gói hoàn thành'),
(4, 'Đang vận chuyển'),
(5, 'Giao hàng thành công'),
(6, 'Giao hàng thất bại'),
(7, 'Hủy đơn hàng');
  
-- t14_order_status_detail
INSERT INTO t14_order_status_detail (C14_ORDER_ID, C14_ORDER_STATUS_ID, C14_EMPLOYEE_ID, C14_LAST_UPDATED)
WITH CTE_ORDER_STATUS_DETAIL AS (
SELECT T9.C09_ORDER_ID ORDER_ID,
	   T13.C13_ORDER_STATUS_ID ORDER_STATUS_ID,
       1 EMPLOYEE_ID,
       date_sub(current_timestamp(), interval (5 -  T13.C13_ORDER_STATUS_ID) day) LAST_UPDATED
  FROM t09_order T9, t13_order_status T13
 WHERE T9.C09_ORDER_ID BETWEEN 1 AND 5
   AND T13.C13_ORDER_STATUS_ID BETWEEN 1 AND 5
UNION ALL
SELECT T9.C09_ORDER_ID ORDER_ID,
	   T13.C13_ORDER_STATUS_ID ORDER_STATUS_ID,
       2 EMPLOYEE_ID,
       date_sub(current_timestamp(), interval (3 -  T13.C13_ORDER_STATUS_ID) day) LAST_UPDATED
  FROM t09_order T9, t13_order_status T13
 WHERE T9.C09_ORDER_ID BETWEEN 6 AND 8
   AND T13.C13_ORDER_STATUS_ID BETWEEN 1 AND 3
UNION ALL
SELECT T9.C09_ORDER_ID ORDER_ID,
	   T13.C13_ORDER_STATUS_ID ORDER_STATUS_ID,
       3 EMPLOYEE_ID,
       date_sub(current_timestamp(), interval (4 -  T13.C13_ORDER_STATUS_ID) day) LAST_UPDATED
  FROM t09_order T9, t13_order_status T13
 WHERE T9.C09_ORDER_ID BETWEEN 9 AND 10
   AND T13.C13_ORDER_STATUS_ID BETWEEN 1 AND 4
UNION ALL
SELECT T9.C09_ORDER_ID ORDER_ID,
	   T13.C13_ORDER_STATUS_ID ORDER_STATUS_ID,
       4 EMPLOYEE_ID,
       date_sub(current_timestamp(), interval (7 -  T13.C13_ORDER_STATUS_ID) day) LAST_UPDATED
  FROM t09_order T9, t13_order_status T13
 WHERE T9.C09_ORDER_ID BETWEEN 11 AND 12
   AND T13.C13_ORDER_STATUS_ID = 7
UNION ALL
SELECT T9.C09_ORDER_ID ORDER_ID,
	   T13.C13_ORDER_STATUS_ID ORDER_STATUS_ID,
       5 EMPLOYEE_ID,
       date_sub(current_timestamp(), interval (6 -  T13.C13_ORDER_STATUS_ID) day) LAST_UPDATED
  FROM t09_order T9, t13_order_status T13
 WHERE T9.C09_ORDER_ID = 13
   AND T13.C13_ORDER_STATUS_ID IN (1, 2, 3, 4, 6)
)
SELECT * FROM CTE_ORDER_STATUS_DETAIL;

-- T20_ROLE
INSERT INTO T20_ROLE (C20_ROLE_ID, C20_ROLE_NAME) VALUES
(1, 'Role 1'),
(2, 'Role 2'),
(3, 'Role 3'),
(4, 'Role 4'),
(5, 'Role 5');

-- T21_ROLE_DETAIL
INSERT INTO T21_ROLE_DETAIL (C21_EMPLOYEE_ID, C21_ROLE_ID) VALUES
(1, 1), (2, 2), (3, 2),
(4, 3), (5, 3), (6, 4),
(7, 4), (8, 5), (9, 5),
(10, 5);



