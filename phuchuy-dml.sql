-- ======================= REFRESH DATA =======================

-- 1. Liệt kê toàn bộ thông tin các loại hàng
select * from t07_item_group;
-- 2. Liệt kê các mặt hàng thuộc loại hàng là 'Thắt lưng'
select * from t07_item_group where C07_ITEM_GROUP_NAME = 'Thắt lưng';
-- 3. Liệt kê top 5 mặt hàng có giá bán cao nhất
select * from t03_item_detail  order by C03_SALES_PRICE DESC limit 5;
-- 4. Liệt kê toàn bộ đơn hàng
select * from t09_order;
-- 5. Liệt kê các đơn hàng được bán trong ngày 28/11/2019
select * from t09_order where date(C09_ORDER_TIME) = '2024-04-10';
-- 6. Liệt kê các đơn hàng được bán từ ngày 28/11/2019 đến ngày 02/12/2019
select * from t09_order where C09_ORDER_TIME >= '2024-04-10'
and C09_ORDER_TIME < '2024-04-14';
-- 7. Liệt kê các đơn hàng được bán trong tháng 11/2019
select * from t09_order where C09_ORDER_TIME like '2019-11%';
-- 8. Liệt kê các đơn hàng được giao tại Hòa Khánh
select t09.* ,t18.C18_ADDRESS from t18_delivery_address t18 join t09_order t09 on t09.C09_DELIVERY_ADDRESS_ID = t18.C18_DELIVERY_ADDRESS_ID 
where C18_ADDRESS = 'hòa khánh';
-- 9. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân

-- 10. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019

-- 11. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
select distinct C01_COLOR COLOR_STORE from t01_item;
-- 12. Liệt kê thông tin các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 23/11/2019
select * from t12_order_detail;
-- 13. Liệt kê các mặt hàng có giá bán từ 100 - 300
select * from t03_item_detail where C03_SALES_PRICE between 100 and 300;

-- 14. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
select * from t07_item_group where C07_ITEM_GROUP_NAME = 'Mũ' or C07_ITEM_GROUP_NAME = 'Thắt lưng';
-- 15. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)
select * from t09_order where C09_ORDER_TIME like '2019-11-28%' or C09_ORDER_TIME like '2019-12-14%';
-- 16. Sắp xếp các mặt hàng với giá bán tăng dần
select C03_ITEM_ID, C03_SALES_PRICE from t03_item_detail order by C03_SALES_PRICE ASC;
-- 17. Sắp xếp các mặt hàng với giá mua giảm dần
select t03.c03_item_id, t05.c05_buy_price from t03_item_detail t03 join t05_warehouse_receipt_detail t05 on t03.C03_ITEM_ID = t05.C05_ITEM_ID order by t05.c05_buy_price DESC;
-- 18. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần
select t03.c03_item_id,t03.C03_SALES_PRICE, t05.c05_buy_price from t03_item_detail t03 join t05_warehouse_receipt_detail t05 on t03.C03_ITEM_ID = t05.C05_ITEM_ID order by t05.c05_buy_price DESC, t03.C03_SALES_PRICE ASC;
-- 19. Đếm số lượng các mặt hàng trong hệ thống
select count(*) TOTAL_ITEM_STORE from t01_item ;
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
