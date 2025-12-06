-- ======================= REFRESH DATA =======================

-- 1. Liệt kê toàn bộ thông tin các loại hàng

-- 2. Liệt kê các mặt hàng thuộc loại hàng là 'Thắt lưng'

-- 3. Liệt kê top 5 mặt hàng có giá bán cao nhất

-- 4. Liệt kê toàn bộ đơn hàng

-- 5. Liệt kê các đơn hàng được bán trong ngày 28/11/2019

-- 6. Liệt kê các đơn hàng được bán từ ngày 28/11/2019 đến ngày 02/12/2019

-- 7. Liệt kê các đơn hàng được bán trong tháng 11/2019

-- 8. Liệt kê các đơn hàng được giao tại Hòa Khánh

-- 9. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân

-- 10. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019

-- 11. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.

-- 12. Liệt kê thông tin các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 23/11/2019

-- 13. Liệt kê các mặt hàng có giá bán từ 100 - 300

-- 14. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'

-- 15. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)

-- 16. Sắp xếp các mặt hàng với giá bán tăng dần

-- 17. Sắp xếp các mặt hàng với giá mua giảm dần

-- 18. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần

-- 19. Đếm số lượng các mặt hàng trong hệ thống

-- 20. Số lượng 'Giày da Nam' được bán trong ngày 23/11/2019

-- 21. Đếm số lượng các mặt hàng theo từng loại hàng

-- 22. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'

-- 23. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng

-- 24. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống >> 16

-- 25. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống, điều kiện tổng số lượng > 20 mặt hàng

-- 26. Hiển thị mặt hàng có 'số lượng' nhiều nhất trong mỗi loại hàng
-- 26-1: Số lượng đếm của các mặt hàng
SELECT C01_ITEM_GROUP_ID ITEM_GROUP_ID,
       GROUP_CONCAT(C01_ITEM_NAME) ITEM_NAMES,
       COUNT(*) AMOUNT_OF_ITEMS
  FROM T01_ITEM 
  GROUP BY C01_ITEM_GROUP_ID;
  
SELECT t01.C01_ITEM_GROUP_ID ITEM_GROUP_ID,
       SUM(t03.C03_AMOUNT) TOTAL_OF_AMOUNT
  FROM T01_ITEM t01
  JOIN T03_ITEM_DETAIL t03
    ON t01.C01_ITEM_ID = t03.C03_ITEM_ID
  GROUP BY t01.C01_ITEM_GROUP_ID;  
  
 SELECT * FROM T01_ITEM; 
 SELECT * FROM T03_ITEM_DETAIL WHERE C03_ITEM_ID IN (16,17);
 SELECT SUM(C03_AMOUNT) FROM T03_ITEM_DETAIL WHERE C03_ITEM_ID IN (16,17);

-- 27. Hiển thị giá bán trung bình của mỗi loại hàng
SELECT t01.C01_ITEM_GROUP_ID ITEM_GROUP_ID,
       FORMAT(AVG(t03.C03_SALES_PRICE), 2) salesPriceAvg
  FROM T01_ITEM t01
  JOIN T03_ITEM_DETAIL t03
    ON t01.C01_ITEM_ID = t03.C03_ITEM_ID
  GROUP BY t01.C01_ITEM_GROUP_ID;  

-- 28. In ra 3 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại
SELECT t01.C01_ITEM_GROUP_ID ITEM_GROUP_ID,
       SUM(t03.C03_AMOUNT) TOTAL_OF_AMOUNT
  FROM T01_ITEM t01
  JOIN T03_ITEM_DETAIL t03
    ON t01.C01_ITEM_ID = t03.C03_ITEM_ID
  GROUP BY t01.C01_ITEM_GROUP_ID
  ORDER BY TOTAL_OF_AMOUNT DESC, ITEM_GROUP_ID
  LIMIT 3;

-- 29. Liệt kê những mặt hàng có MaLoai = 2 và thuộc đơn hàng 100100
-- Yêu cầu OR thỏa mãn 1 trong 2 điều kiện 
SELECT C01_ITEM_ID ITEM_ID
  FROM T01_ITEM
 WHERE C01_ITEM_GROUP_ID = 2 -- 4 5
 
UNION ALL
 
SELECT DISTINCT C03_ITEM_ID -- 1 3 6 13
  FROM T12_ORDER_DETAIL t12
  JOIN T03_ITEM_DETAIL t03 ON t03.C03_ITEM_DETAIL_ID = t12.C12_ITEM_DETAIL_ID
  JOIN T01_ITEM t01 ON t01.C01_ITEM_ID = t03.C03_ITEM_ID
 WHERE t12.C12_ORDER_ID = 11;
 
-- Yêu cầu AND thỏa mãn 2 điều kiện 
SELECT DISTINCT t03.C03_ITEM_ID
  FROM T12_ORDER_DETAIL t12
  JOIN T03_ITEM_DETAIL t03 ON t03.C03_ITEM_DETAIL_ID = t12.C12_ITEM_DETAIL_ID
  JOIN T01_ITEM t01 ON t01.C01_ITEM_ID = t03.C03_ITEM_ID
 WHERE t12.C12_ORDER_ID = 11
   AND t01.C01_ITEM_GROUP_ID = 1; 
    

-- 30. Tìm những mặt hàng có Mã Loại = 2 và đã được bán trong ngày 28/11/2024 8H
SELECT DISTINCT t01.C01_ITEM_ID ITEM_ID  -- DISTINCT C03_ITEM_ID
  FROM T09_ORDER t09
  JOIN T12_ORDER_DETAIL t12 ON t09.C09_ORDER_ID = t12.C12_ORDER_ID
  JOIN T03_ITEM_DETAIL t03 ON t03.C03_ITEM_DETAIL_ID = t12.C12_ITEM_DETAIL_ID
  JOIN T01_ITEM t01 ON t01.C01_ITEM_ID = t03.C03_ITEM_ID
 WHERE CAST(t09.C09_ORDER_TIME AS DATE) = '2024-04-18' -- STR_TO_DATE('18/04/2024', '%d/%m/%Y') 
   AND HOUR(t09.C09_ORDER_TIME) = 8
   AND t01.C01_ITEM_GROUP_ID = 2; 
   
-- 31. Liệt kê những mặt hàng là 'Mũ' không bán được trong ngày 14/02/2019
-- Loại Hàng Mũ --> MH 1 2 3 6
-- Ngày ***     --> MH 1 3 4  5
-- Kết quả      --> 2 6 (phép hiệu)

WITH CTE_ITEMS_MATCH_GROUP AS (
	SELECT C01_ITEM_ID ITEM_ID -- 14 15 18
	  FROM T01_ITEM
	 WHERE C01_ITEM_GROUP_ID = (SELECT C07_ITEM_GROUP_ID FROM T07_ITEM_GROUP WHERE C07_ITEM_GROUP_NAME = 'Mũ')
),
CTE_ITEMS_MATCH_ORDER_DAY AS (
	SELECT DISTINCT t03.C03_ITEM_ID ITEM_ID -- 5 18
	  FROM T09_ORDER t09
	  JOIN T12_ORDER_DETAIL t12 ON t09.C09_ORDER_ID = t12.C12_ORDER_ID
	  JOIN T03_ITEM_DETAIL t03 ON t03.C03_ITEM_DETAIL_ID = t12.C12_ITEM_DETAIL_ID
	 WHERE CAST(t09.C09_ORDER_TIME AS DATE) = '2024-04-28'
)
-- Cách 1: Phép hiệu
-- SELECT cte1.ITEM_ID
--  FROM CTE_ITEMS_MATCH_GROUP cte1
--  LEFT JOIN CTE_ITEMS_MATCH_ORDER_DAY cte2
--    ON cte1.ITEM_ID = cte2.ITEM_ID
--  WHERE cte2.ITEM_ID IS NULL;
  
-- Cách 2: NOT IN hoặc NOT EXISTS  
SELECT cte1.ITEM_ID
  FROM CTE_ITEMS_MATCH_GROUP cte1
  WHERE NOT EXISTS (
	SELECT * 
      FROM CTE_ITEMS_MATCH_ORDER_DAY cte2
	 WHERE cte1.ITEM_ID = cte2.ITEM_ID
  );


-- 32. Cập nhật giá bán của tất cả các mặt hàng thuộc loại hàng 'Áo' thành 199
SELECT * FROM T03_ITEM_DETAIL;
UPDATE T03_ITEM_DETAIL
   SET C03_SALES_PRICE = 199
 WHERE C03_ITEM_ID IN (SELECT t01.C01_ITEM_ID
						 FROM T01_ITEM t01
                         JOIN T07_ITEM_GROUP t07 ON t01.C01_ITEM_GROUP_ID = t07.C07_ITEM_GROUP_ID
						WHERE t07.C07_ITEM_GROUP_NAME = 'Mũ');

-- 33. Backup data. Tạo table LoaiHang_SaoLuu(MaLoai, TenLoai), sao chép dữ liệu từ bảng LoaiHang sang LoaiHang_SaoLuu
-- Làm rồi(khi học phần insert)

-- 34. Liệt kê 2 sản phẩm (có số lượng tồn kho nhiều nhất) của loại hàng 'Áo' và 'Quần'
SELECT *
  FROM T01_ITEM t01
  JOIN T03_ITEM_DETAIL t03
    ON t01.C01_ITEM_ID = t03.C03_ITEM_ID
  JOIN T07_ITEM_GROUP t07 ON t01.C01_ITEM_GROUP_ID = t07.C07_ITEM_GROUP_ID
  WHERE t07.C07_ITEM_GROUP_NAME IN ('Áo', 'Quần')
  ORDER BY t03.C03_AMOUNT DESC, t03.C03_ITEM_DETAIL_ID ASC
  LIMIT 2;
  
-- 35. Tính tổng tiền cho đơn hàng 02, với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng
SELECT t12.C12_ORDER_ID ORDER_ID,
	   SUM(t03.C03_SALES_PRICE * t12.C12_AMOUNT) TOTAL_OF_MONEY
  FROM T12_ORDER_DETAIL t12
  JOIN T03_ITEM_DETAIL t03 ON t03.C03_ITEM_DETAIL_ID = t12.C12_ITEM_DETAIL_ID
 GROUP BY t12.C12_ORDER_ID;

-- 36. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
	-- SoDH ChiTietDonHang           TongTien
    -- 02   TenMH:GiaBan:SoLuong     100
-- Tương tự câu 35, thêm JOIN và GROUP_CONCAT

-- TRIGGER, VIEW
	
-- 37. Xuất thông tin hóa đơn của các đơn hàng có trong hệ thống với thông tin như sau.
