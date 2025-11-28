USE JAVA24_SHOPPING;

-- 1. Từ khóa distinct, limit offset rowcount
-- distinct: Xuất hiện 1/n dữ liệu bị trùng --> lấy 1 dòng
-- unique: chỉ lấy những dữ liệu xuất hiện 1 dòng duy nhất

SELECT * FROM t12_order_detail;
SELECT C12_ORDER_ID FROM t12_order_detail;
SELECT distinct C12_ORDER_ID FROM t12_order_detail;

select C12_ORDER_ID,
		group_concat(C12_ITEM_DETAIL_ID,'/',  C12_AMOUNT separator ' & ') ItemdetailAmount
  from t12_order_detail
 group by C12_ORDER_ID;

select C12_ORDER_ID
  from t12_order_detail
 group by C12_ORDER_ID
having count(*) = 1;

-- limit [offset default=0], rowcount
select *
  from t01_item
 limit 5; -- 0,5

select *
  from t01_item
 limit 3, 5;
 
-- 2. Dạng toán case when end
select C02_SIZE_ID, C02_SIZE_NAME, 
	   CASE C02_GENDER
			WHEN 0 THEN 'F'
            ELSE 'T'
		END 'C02_GENDER',
        C02_SIZE_DESC
  from t02_size;	
  
  -- 3. Toán tử
SELECT * FROM t01_item WHERE C01_ITEM_ID <> 2;

-- 4. Sắp xếp

-- sắp xếp các mặt hàng tăng dần theo số lượng
SELECT * FROM t03_item_detail order by C03_AMOUNT;
-- sắp xếp các mặt hàng giảm dần số lượng, tăng dần theo size
SELECT * FROM t03_item_detail order by C03_AMOUNT DESC, C03_SIZE_ID;
-- sắp xếp các loại hàng theo số lượng mặt hàng tăng dần
SELECT C01_ITEM_GROUP_ID, COUNT(*) AMOUNT_OF_ITEMS
  FROM t01_item
GROUP BY C01_ITEM_GROUP_ID
ORDER BY AMOUNT_OF_ITEMS;
-- Liệt kê top 2 mặt hàng có số lượng bán nhiều nhất trong mỗi đơn hàng(NẾU SỐ LƯỢNG BẰNG NHAU THÌ LẤY THEO ITEM_DETAIL_ID TĂNG DẦN)
 
SELECT * FROM t03_item_detail;
  


