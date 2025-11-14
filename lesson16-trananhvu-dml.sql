-- ======================= REFRESH DATA =======================

-- 1. Liệt kê toàn bộ thông tin các loại hàng
SELECT * FROM t07_item_group;
-- 2. Liệt kê các mặt hàng thuộc loại hàng là 'Thắt lưng'
SELECT * FROM t01_item
		JOIN t07_item_group on C01_ITEM_GROUP_ID = C07_ITEM_GROUP_ID
        WHERE C07_ITEM_GROUP_NAME = 'Thắt lưng';
-- 3. Liệt kê top 5 mặt hàng có giá bán cao nhất
SELECT * FROM t03_item_detail 
		ORDER BY C03_SALES_PRICE DESC
        LIMIT 5;
-- 4. Liệt kê toàn bộ đơn hàng
SELECT * FROM t09_order;
-- 5. Liệt kê các đơn hàng được bán trong ngày 28/11/2019
SELECT * FROM t09_order
		WHERE C09_ORDER_TIME like '2025-11-28%';
-- 6. Liệt kê các đơn hàng được bán từ ngày 28/11/2019 đến ngày 02/12/2019
SELECT * FROM t09_order
		WHERE C09_ORDER_TIME >= '2019-11-28 00:00:00'
		AND C09_ORDER_TIME <= '2019-12-02 23:59:59';
-- 7. Liệt kê các đơn hàng được bán trong tháng 11/2019
SELECT * FROM t09_order
		WHERE C09_ORDER_TIME LIKE '2019-11%';
-- 8. Liệt kê các đơn hàng được giao tại Hòa Khánh
SELECT * FROM t09_order
		JOIN t15_customer 
        ON C09_CUSTOMER_ID = C15_CUSTOMER_ID
        WHERE C15_CUSTOMER_ADDRESS LIKE '%Hoà Khánh%';
-- 9. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân
SELECT *, ROUND(C03_SALES_PRICE * 0.8, 2) AS discounted_price 
		FROM t03_item_detail;
-- 10. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019

-- 11. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
SELECT DISTINCT C01_COLOR FROM t01_item;
-- 12. Liệt kê thông tin các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 23/11/2019
SELECT C01_ITEM_ID, C01_ITEM_NAME, C09_ORDER_TIME FROM t12_order_detail 
        JOIN t01_item 
			ON C01_ITEM_ID = C12_ITEM_ID
		JOIN t09_order
			ON C12_ORDER_ID = C09_ORDER_ID;
-- 13. Liệt kê các mặt hàng có giá bán từ 100 - 300
SELECT * FROM t03_item_detail
		WHERE C03_SALES_PRICE BETWEEN 100000 AND 300000;
-- 14. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
SELECT * FROM t01_item
		JOIN t07_item_group on C01_ITEM_GROUP_ID = C07_ITEM_GROUP_ID
        WHERE C07_ITEM_GROUP_NAME IN ('Mũ', 'Thắt lưng');
-- 15. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)
SELECT * FROM t09_order
		WHERE DATE(C09_ORDER_TIME) IN ('2025-10-01', '2025-10-02');
-- 16. Sắp xếp các mặt hàng với giá bán tăng dần
SELECT * FROM t03_item_detail
		ORDER BY C03_SALES_PRICE ASC;
-- 17. Sắp xếp các mặt hàng với giá mua giảm dần
SELECT * FROM t03_item_detail
		ORDER BY C03_SALES_PRICE DESC;
-- 18. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần

-- 19. Đếm số lượng các mặt hàng trong hệ thống
SELECT COUNT(*) AS total_items FROM t01_item;
-- 20. Số lượng 'Giày da Nam' được bán trong ngày 23/11/2019
	
-- 21. Đếm số lượng các mặt hàng theo từng loại hàng

-- 22. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'

-- 23. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng

-- 24. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống >> 16

-- 25. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống, điều kiện tổng số lượng > 20 mặt hàng

-- 26. Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng

-- 27. Hiển thị giá bán trung bình của mỗi loại hàng

-- 28. In ra 3 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại

-- 29. Liệt kê những mặt hàng có MaLoai = 2 và thuộc đơn hàng 100100

-- 30. Tìm những mặt hàng có Mã Loại = 2 và đã được bán trong ngày 28/11

-- 31. Liệt kê những mặt hàng là 'Mũ' không bán được trong ngày 14/02/2019

-- 32. Cập nhật giá bán của tất cả các mặt hàng thuộc loại hàng 'Áo' thành 199

-- 33. Backup data. Tạo table LoaiHang_SaoLuu(MaLoai, TenLoai), sao chép dữ liệu từ bảng LoaiHang sang LoaiHang_SaoLuu

-- 34. Liệt kê 2 sản phẩm (có số lượng tồn kho nhiều nhất) của loại hàng 'Áo' và 'Quần'

-- 35. Tính tổng tiền cho đơn hàng 02, với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng

-- 36. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
	-- SoDH ChiTietDonHang           TongTien
    -- 02   TenMH:GiaBan:SoLuong     100
	
-- 37. Xuất thông tin hóa đơn của các đơn hàng có trong hệ thống với thông tin như sau.
