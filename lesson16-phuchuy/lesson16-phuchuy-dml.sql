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
select C03_ITEM_DETAIL_ID, C03_ITEM_ID, C03_SIZE_ID, C03_SALES_PRICE * 0.8 as DISCOUNTED_PRICE, C03_AMOUNT from t03_item_detail;
-- 10. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019
select t03.c03_sales_price * 0.8 as discounted_price , t09.c09_order_id, t12.c12_order_id 
from t03_item_detail t03 
join t12_order_detail t12 on t03.C03_ITEM_DETAIL_ID = t12.C12_ITEM_DETAIL_ID
join t09_order t09 on t09.C09_ORDER_ID = t12.C12_ORDER_ID
where C09_ORDER_TIME like '2024-04-14%';
-- 11. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
select distinct C01_COLOR COLOR_STORE from t01_item;

-- 12. Liệt kê thông tin các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 23/11/2019
select t01.c01_item_id MaMH, t01.c01_item_name TenMH, t09.C09_ORDER_TIME ThoiGianDatHang
from t03_item_detail t03 
join t12_order_detail t12 on t03.C03_ITEM_DETAIL_ID = t12.C12_ITEM_DETAIL_ID
join t09_order t09 on t09.C09_ORDER_ID = t12.C12_ORDER_ID
join t01_item t01 on t01.C01_ITEM_ID = t03.C03_ITEM_ID where t09.C09_ORDER_TIME like '2024-04-10%';
-- 13. Liệt kê các mặt hàng có giá bán từ 100 - 300
select * from t03_item_detail where C03_SALES_PRICE between 100 and 300;

-- 14. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
select * from t07_item_group where C07_ITEM_GROUP_NAME = 'Mũ' or C07_ITEM_GROUP_NAME = 'Thắt lưng';

-- 15. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)
select * from t09_order where C09_ORDER_TIME like '2019-11-28%' or C09_ORDER_TIME like '2019-12-14%';

-- 16. Sắp xếp các mặt hàng với giá bán tăng dần
select C03_ITEM_ID, C03_SALES_PRICE from t03_item_detail order by C03_SALES_PRICE ASC;

-- 17. Sắp xếp các mặt hàng với giá mua giảm dần
select t03.c03_item_id, t05.c05_buy_price 
from t03_item_detail t03 
join t05_warehouse_receipt_detail t05 on t03.C03_ITEM_ID = t05.C05_ITEM_ID 
order by t05.c05_buy_price DESC;

-- 18. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần
select t03.c03_item_id,t03.C03_SALES_PRICE, t05.c05_buy_price 
from t03_item_detail t03 join t05_warehouse_receipt_detail t05 on t03.C03_ITEM_ID = t05.C05_ITEM_ID 
order by t05.c05_buy_price DESC, t03.C03_SALES_PRICE ASC;
-- 19. Đếm số lượng các mặt hàng trong hệ thống
select count(*) TOTAL_ITEM_STORE from t01_item ;
-- 20. Số lượng 'Giày da Nam' được bán trong ngày 23/11/2019
with cte_detail_item as (
select t01.C01_ITEM_NAME TenMH, t09.C09_ORDER_TIME ThoiGianDatHang,count(*) as SoLanXuatHien 
from t03_item_detail t03 
join t12_order_detail t12 on t03.C03_ITEM_DETAIL_ID = t12.C12_ITEM_DETAIL_ID
join t09_order t09 on t09.C09_ORDER_ID = t12.C12_ORDER_ID
join t01_item t01 on t01.C01_ITEM_ID = t03.C03_ITEM_ID 
where t09.C09_ORDER_TIME like '2024-04-18%' and t01.C01_ITEM_NAME = 'Giày 9' 
group by TenMH, ThoiGianDatHang
)
select * from cte_detail_item;
-- 21. Đếm số lượng các mặt hàng theo từng loại hàng
select  t07.c07_item_group_name LoaiHang , count(*) as SoluongMatHang 
from t01_item t01 
join t07_item_group t07 on t01.C01_ITEM_GROUP_ID = t07.C07_ITEM_GROUP_ID
group by LoaiHang;
-- 22. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'
select t01.c01_item_name TenMH, t03.c03_sales_price GiaBan from t01_item t01 join t03_item_detail t03 on t01.C01_ITEM_ID = t03.C03_ITEM_ID
where t01.C01_ITEM_NAME like 'giày %' order by t03.c03_sales_price DESC limit 1;
-- 23. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng
with cte_cau23 as (
select t01.c01_item_name TenMH, t03.c03_sales_price GiaBan, row_number() over (partition by t01.c01_item_name order by t03.c03_sales_price DESC) as ranking 
from t01_item t01 join t03_item_detail t03 on t01.C01_ITEM_ID = t03.C03_ITEM_ID
)
select *
from cte_cau23 where ranking = 1 ;

-- 24. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống >> 16
select t07.c07_item_group_name LoaiHang, sum(t03.C03_AMOUNT) as SoLuong from t01_item t01 
join t07_item_group t07 on t01.C01_ITEM_GROUP_ID = t07.C07_ITEM_GROUP_ID
join t03_item_detail t03 on t01.C01_ITEM_ID = t03.C03_ITEM_ID
group by LoaiHang;

-- 25. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống, điều kiện tổng số lượng > 20 mặt hàng
with cte_cau25 as
(select t07.c07_item_group_name LoaiHang, sum(t03.C03_AMOUNT) as SoLuong from t01_item t01 
join t07_item_group t07 on t01.C01_ITEM_GROUP_ID = t07.C07_ITEM_GROUP_ID
join t03_item_detail t03 on t01.C01_ITEM_ID = t03.C03_ITEM_ID
group by LoaiHang )
select * from cte_cau25 where SoLuong > 3000;

-- 26. Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng
with cte_cau26 as
(select t07.c07_item_group_name LoaiHang, t01.C01_ITEM_NAME TenMH, t03.C03_AMOUNT SoLuong ,
rank() over (partition by t07.C07_ITEM_GROUP_ID order by t03.C03_AMOUNT DESC) as ranking from t01_item t01 
join t07_item_group t07 on t01.C01_ITEM_GROUP_ID = t07.C07_ITEM_GROUP_ID
join t03_item_detail t03 on t01.C01_ITEM_ID = t03.C03_ITEM_ID
) 
select LoaiHang, TenMH, SoLuong from cte_cau26 where ranking = 1;
-- chưa tối ưu

-- 26.1: số lượng mặt hàng
select c01_item_group_id item_group_id,
		group_concat(c01_item_name) item_names,
		count(*) amount_of_item
  from t01_item
group by C01_ITEM_GROUP_ID;
select c01_item_group_id item_group_id,
sum(c03_amount) total_of_amount 
from t01_item t01 
join t03_item_detail t03 on t01.C01_ITEM_ID=t03.C03_ITEM_ID
group by C01_ITEM_GROUP_ID;

select * from t03_item_detail where C03_ITEM_ID in (16,17);

-- 27. Hiển thị giá bán trung bình của mỗi loại hàng
select t01.c01_item_group_id item_group_id,
format(avg(t03.c03_sales_price),2) salespriceAvg
from t01_item t01
join t03_item_detail t03 
on t01.C01_ITEM_ID = t03.C03_ITEM_ID
group by t01.C01_ITEM_GROUP_ID;
-- 28. In ra 3 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại
select c01_item_group_id item_group_id,
sum(c03_amount) total_of_amount 
from t01_item t01 
join t03_item_detail t03 on t01.C01_ITEM_ID=t03.C03_ITEM_ID
group by C01_ITEM_GROUP_ID
order by total_of_amount desc, item_group_id
limit 3;
-- 29. Liệt kê những mặt hàng có MaLoai = 2 và thuộc đơn hàng 100100
select c01_item_id item_id
from t01_item
where C01_ITEM_GROUP_ID = 2;

select distinct C03_ITEM_ID -- 1 3 6 13
from t12_order_detail t12
join t03_item_detail t03 on t03.C03_ITEM_DETAIL_ID = t12.C12_ITEM_DETAIL_ID
join t01_item t01 on t01.C01_ITEM_ID = t03.C03_ITEM_ID
where t12.C12_ORDER_ID = 11;

-- yêu cầu AND thỏa mãn 2 diều kiện
select distinct C03_ITEM_ID
from t12_order_detail t12
join t03_item_detail t03 on t03.C03_ITEM_DETAIL_ID = t12.C12_ITEM_DETAIL_ID
join t01_item t01 on t01.C01_ITEM_ID = t03.C03_ITEM_ID
where t12.C12_ORDER_ID = 11
and t01.C01_ITEM_GROUP_ID = 1;

-- 30. Tìm những mặt hàng có Mã Loại = 2 và đã được bán trong ngày 28/11
-- mặt hàng = item
-- mã loại = item_group
-- ngày thì lấy từ c09_order_date
select distinct C03_ITEM_ID
from t09_order t09
join t12_order_detail t12 on t09.C09_ORDER_ID = t12.C12_ORDER_ID
join t03_item_detail t03 on t03.C03_ITEM_DETAIL_ID = t12.C12_ITEM_DETAIL_ID
join t01_item t01 on t01.C01_ITEM_ID = t03.C03_ITEM_ID
where cast(t09.C09_ORDER_TIME as DATE) = str_to_date('18/04/2024', '%d/%m/%Y')
-- nên cast về kiểu Date
and t01.C01_ITEM_GROUP_ID = 2;
-- 31. Liệt kê những mặt hàng là 'Mũ' không bán được trong ngày 14/02/2019
-- Loại hàng mũ --> mh 1 2 3 6
-- ngày ***     --> mh 1 3 4 5
-- kết quả      --> 2 6 (phép hiệu)

with cte_items_match_group as (
SELECT C01_ITEM_ID item_id -- 14 15 18
from t01_item
where C01_ITEM_GROUP_ID = (select c07_item_group_id from t07_item_group where C07_ITEM_GROUP_NAME = 'Mũ')
),

cte_items_match_order_day as (
select distinct t03.c03_item_id item_id -- 5 18
from t09_order t09
join t12_order_detail t12 on t09.c09_order_id = t12.C12_ORDER_ID
join t03_item_detail t03 on t03.C03_ITEM_DETAIL_ID = t12.C12_ITEM_DETAIL_ID
where cast(t09.C09_ORDER_TIME as DATE) = '2024-04-28')

-- cách 1: phép hiệu
-- select cte1.item_id
-- from cte_items_match_group cte1
-- left join cte_items_match_order_day cte2 on cte1.item_id = cte2.item_id
-- where cte2.item_id is null;
-- cách 2: not in hoặc not exist

select cte1.item_id
from cte_items_match_group cte1
where not exists (
select * from 
cte_items_match_order_day cte2
where cte1.item_id = cte2.item_id
);

-- 32. Cập nhật giá bán của tất cả các mặt hàng thuộc loại hàng 'Áo' thành 199
update t03_item_detail
set c03_sales_price = 199
where c03_item_id in (
select C01_ITEM_ID
from t01_item t01
join t07_item_group t07 on t01.C01_ITEM_GROUP_ID = t07.C07_ITEM_GROUP_ID
where t07.C07_ITEM_GROUP_NAME = 'Mũ' 
);

select C01_ITEM_ID
from t01_item t01
join t07_item_group t07 on t01.C01_ITEM_GROUP_ID = t07.C07_ITEM_GROUP_ID
where t07.C07_ITEM_GROUP_NAME = 'Mũ' ;
-- 33. Backup data. Tạo table LoaiHang_SaoLuu(MaLoai, TenLoai), sao chép dữ liệu từ bảng LoaiHang sang LoaiHang_SaoLuu

-- 34. Liệt kê 2 sản phẩm (có số lượng tồn kho nhiều nhất) của loại hàng 'Áo' và 'Quần'

select *
from t01_item t01
join t03_item_detail t03 on t01.C01_ITEM_ID = t03.C03_ITEM_ID
join t07_item_group t07 on t01.C01_ITEM_GROUP_ID = t07.C07_ITEM_GROUP_ID
where t07.C07_ITEM_GROUP_NAME in ('Áo','Quần')
order by t03.C03_AMOUNT DESC, t03.C03_ITEM_DETAIL_ID ASC
limit 2;

-- 35. Tính tổng tiền cho đơn hàng 02, với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng
select
t12.C12_ORDER_ID ORDER_ID,
sum(t03.C03_SALES_PRICE * t12.C12_AMOUNT) TOTAL_MONEY
from t12_order_detail t12
join t03_item_detail t03 on t03.C03_ITEM_DETAIL_ID = t12.C12_ITEM_DETAIL_ID
join t01_item t01 on t03.C03_ITEM_ID = t01.C01_ITEM_ID
group by t12.C12_ORDER_ID having t12.C12_ORDER_ID = 2;

-- 36. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
	-- SoDH ChiTietDonHang           TongTien
    -- 02   TenMH:GiaBan:SoLuong     100
	-- 35 làm sẵn tính tiền, join thêm và group_concat()	
select
t12.C12_ORDER_ID ORDER_ID,
 group_concat(t01.C01_ITEM_NAME, ' : ',t03.C03_SALES_PRICE, ' : ', t12.C12_AMOUNT separator ' / ') ITEM_DETAIL,
sum(t03.C03_SALES_PRICE * t12.C12_AMOUNT) TOTAL_MONEY
from t12_order_detail t12
join t03_item_detail t03 on t03.C03_ITEM_DETAIL_ID = t12.C12_ITEM_DETAIL_ID
join t01_item t01 on t03.C03_ITEM_ID = t01.C01_ITEM_ID
group by t12.C12_ORDER_ID having t12.C12_ORDER_ID = 2;    
    
-- 37. Xuất thông tin hóa đơn của các đơn hàng có trong hệ thống với thông tin như sau.
