USE java24_shopping;

-- 1. Từ khóa distinct, litmit offset rowcount
-- distinct: xuất hiện 1/N dữ liệu bị trùng --> lấy 1 dòng
-- unique: chỉ lấy những dữ liệu xuất hiện ở 1 dòng duy nhất

SELECT * FROM T12_ORDER_DETAIL;
SELECT C12_ORDER_ID FROM T12_ORDER_DETAIL;
SELECT DISTINCT C12_ORDER_ID FROM T12_ORDER_DETAIL;
SELECT DISTINCT C12_ORDER_ID, C12_AMOUNT FROM T12_ORDER_DETAIL;

-- Liệt kê các order chỉ có duy nhất một mặt hàng(tt hiển thị order? itemDetail? amount?)
SELECT C12_ORDER_ID,
       GROUP_CONCAT(C12_ITEM_DETAIL_ID, '/', C12_AMOUNT SEPARATOR ' & ') ItemDetailAmount
  FROM T12_ORDER_DETAIL
 GROUP BY C12_ORDER_ID;
 
SELECT C12_ORDER_ID
  FROM T12_ORDER_DETAIL
 GROUP BY C12_ORDER_ID
 HAVING COUNT(*) = 1;
 
-- LIMIT [offset default=0], rowcount
SELECT *
  FROM T01_ITEM
 LIMIT 0, 5;
  
SELECT *
  FROM T01_ITEM
LIMIT 5;

SELECT *
  FROM T01_ITEM
 LIMIT 0, 5;
  
SELECT *
  FROM T01_ITEM
 LIMIT 3, 5;

-- 2. Dạng toán case when end
SELECT C02_SIZE_ID,
       C02_SIZE_NAME,
       CASE C02_GENDER
		    WHEN 0 THEN 'F'
            ELSE 'T'
       END 'C02_GENDER',
       C02_SIZE_DESC
  FROM T02_SIZE;
  
SELECT C02_SIZE_ID,
       C02_SIZE_NAME,
       CASE 
		    WHEN C02_GENDER = 0 THEN 'F'
            ELSE 'T'
       END 'C02_GENDER',
       C02_SIZE_DESC
  FROM T02_SIZE;
  
-- 3. Toán tử
SELECT * FROM T01_ITEM WHERE C01_ITEM_ID <> 2;

-- 3. Sắp xếp

-- Sắp xếp các mặt hàng tăng dần theo số lượng
SELECT * FROM T03_ITEM_DETAIL ORDER BY C03_AMOUNT;

-- Sắp xếp các mặt hàng giảm dần theo số lượng, tăng dần theo size
SELECT * FROM T03_ITEM_DETAIL ORDER BY C03_AMOUNT DESC, C03_SIZE_ID;

-- Sắp xếp các loại hàng theo số lượng mặt hàng tăng dần
SELECT C01_ITEM_GROUP_ID ITEM_GROUP_ID,
       COUNT(*) AMOUNT_OF_ITEMS
  FROM T01_ITEM
GROUP BY C01_ITEM_GROUP_ID
ORDER BY AMOUNT_OF_ITEMS;

-- Liệt kê top 2 mặt hàng có số lượng bán nhiều nhất trong mỗi đơn hàng(nếu có số lượng bằng nhau lấy theo mặt hàng có mã nhỏ hơn)
-- OrderId ItemDetailId Amount
SELECT * FROM T12_ORDER_DETAIL;

SELECT C12_ORDER_ID,
       GROUP_CONCAT(C12_ITEM_DETAIL_ID, '/', C12_AMOUNT SEPARATOR ' & ') ItemDetailAmount
  FROM T12_ORDER_DETAIL
 GROUP BY C12_ORDER_ID;

WITH CTE_ORDER_DETAIL AS (
	SELECT *,
           ROW_NUMBER() OVER (PARTITION BY C12_ORDER_ID ORDER BY C12_AMOUNT DESC, C12_ITEM_DETAIL_ID) AS RANKING
      FROM T12_ORDER_DETAIL
)
SELECT C12_ORDER_ID,
       C12_ITEM_DETAIL_ID,
       C12_AMOUNT
  FROM CTE_ORDER_DETAIL
 WHERE RANKING IN (1, 2);










