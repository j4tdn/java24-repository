-- ======================= REFRESH DATA =======================
use java24_shopping;
-- 1. Liệt kê toàn bộ thông tin các loại hàng
select * from t01_item;
-- 2. Liệt kê các mặt hàng thuộc loại hàng là 'Thắt lưng'
select * from t01_item where C01_ITEM_GROUP_ID = 6;
-- 3. Liệt kê top 5 mặt hàng có giá bán cao nhất
select	* 
from	t03_item_detail
order by C03_SALES_PRICE 
limit 5;
-- 4. Liệt kê toàn bộ đơn hàng
select * 
from t09_order;
-- 5. Liệt kê các đơn hàng được bán trong ngày 18/4/2024
select * 
from t09_order
where date(C09_ORDER_TIME) = '2024-4-18';
-- 6. Liệt kê các đơn hàng được bán từ ngày 10/4/2024 đến ngày 18/4/2024
select * 
from t09_order
where  date(C09_ORDER_TIME) between '2024-4-10' and '2024-4-18';
 -- 7. Liệt kê các đơn hàng được bán trong tháng 4/2019
select * 
from t09_order
where month(C09_ORDER_TIME) = 4
and year(C09_ORDER_TIME) = 2024;

-- 8. Liệt kê các đơn hàng được giao tại Địa chỉ 5
select * 
from t18_delivery_address
where C18_ADDRESS = 'Địa chỉ 5';
-- 9. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân
select C03_ITEM_ID,
		C03_SIZE_ID,
        C03_SALES_PRICE,
        C03_AMOUNT,
        round(C03_SALES_PRICE * 0.8 , 2) AS C03_DISCOUNT
from t03_item_detail;
-- 10. Giảm giá 20% tất cả các mặt hàng trong ngày 14/4/2024
select t09.*
from t09_order t09 
join t10_bill t10 on  t09.C09_ORDER_ID = t10.C10_ORDER_ID
where date(C09_ORDER_TIME) = '2024/4/14';
-- 11. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
select distinct c01_color
from t01_item;
-- 12. Liệt kê thông tin các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 10/4/2024
select C01_ITEM_ID,
		C01_ITEM_NAME,
        t09.C09_ORDER_TIME
from  t01_item t01
join t12_order_detail t12 on t01.C01_ITEM_ID = t12.C12_ITEM_ID
join t09_order t09 on   t12.C12_ORDER_ID = t09.C09_ORDER_ID
where date(t09.C09_ORDER_TIME) = '2024/4/10';
-- 13. Liệt kê các mặt hàng có giá bán từ 100 - 300
select * 
from t01_item t01
join t03_item_detail t03 on t01.C01_ITEM_ID = t03.C03_ITEM_ID
where t03.C03_SALES_PRICE between 100 and 300;
-- 14. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
select * 
from 
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