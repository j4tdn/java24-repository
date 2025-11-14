use java24_shopping;

-- distinct: xuat hien 1/n du lieu trung` --> lấy 1 dòng
-- unique: chỉ lấy những dữ liệu xuất hiện ở 1 dòng duy nhất

select * from t12_order_detail;

select c12_order_id from t12_order_detail;

select distinct c12_order_id from t12_order_detail;

select distinct c12_order_id, c12_amount from t12_order_detail;

-- Liệt kê order chỉ có duy nhất 1 mặt hàng (tt hiển thị: order nào,, item nào, amount bao nhiêu )
select c12_order_id,
group_concat(c12_item_detail_id, '/', c12_amount) ItemDetailAmount
from t12_order_detail
group by C12_ORDER_ID
;
-- dùng group by theo cột nào đó rồi having count = ?? đó để tìm điều kiện thỏa của cột đấy
select c12_order_id,
count(*) amountOfItems
from t12_order_detail
group by C12_ORDER_ID
having amountOfItems =1;
;

select c12_order_id from t12_order_detail group by C12_ORDER_ID having count(*) =1;
;

-- LIMIT [offset], rowcount (offset là lấy từ dòng nào)
select * from t01_item limit 5;
select * from t01_item limit 3,5; -- lấy từ dòng 3

-- dạng toán case when end
select c02_size_id, 
	  c02_size_name,
      case C02_GENDER 
			when 0 then 'Nữ'
			else 'Nam'
      end as 'Giới tính', C02_SIZE_DESC
 from t02_size;
 
 -- 3. Toán tử
 select * from t01_item where C01_ITEM_ID <> 2;

-- 3. Sắp xếp 

-- a. Sắp xếp các mặt hàng tăng dần theo amount
select * from t03_item_detail order by C03_AMOUNT ASc;
-- b. Sắp xếp các mặt hàng giảm dần theo amount, tăng dần theo size

select * from t03_item_detail order by C03_AMOUNT DESC, C03_SIZE_ID ASC;
-- c. Sắp xếp các loại hàng theo số lượng mặt hàng tăng dần
select C01_ITEM_GROUP_ID item_group_id , count(*) amount_of_items from t01_item group by ( C01_ITEM_GROUP_ID) order by amount_of_items ;

-- d. Liệt kê 2 mặt hàng có số lượng bán nhiều nhất trong mỗi đơn hàng (nếu sl bằng nhau lấy theo mặt hàng có mã nhỏ hơn)
select * from t12_order_detail;
-- window function
with cte_order_detail as (
select *, 
row_number() over (partition by c12_order_id order by c12_amount desc, c12_item_detail_id) as ranking from t12_order_detail
 )
select c12_order_id, c12_item_detail_id, c12_amount from cte_order_detail where ranking in (1,2);

-- 4. Từ khóa UNION (ALL)
select c15_customer_id from t15_customer where c15_customer_id between 2 and 6
union all
select C09_CUSTOMER_ID from t09_order where C09_PAYMENT_METHOD_ID = 1;

select 1 ID, "Item 1" 'Name', 120 SALEP_RICES
union all
select 2 ID, "Item 2", 130 SALEP_RICES
union all
select 3 ID, "Item 3", 150 SALEP_RICES
union all
select 4 ID, "Item 4" , 160 SALEP_RICES
union all
select 5 ID, "Item 5", 170 SALEP_RICES;

-- 5. Phép liên kết 
insert into t07_item_group values 
(8, 'Cà vạt', 1),
(9, 'Ví tiền', 1);

-- join inner
select t01.*, 
t07.C07_ITEM_GROUP_NAME, 
t07.C07_STATUS 
from t01_item t01 
join t07_item_group t07 on 
t01.C01_ITEM_GROUP_ID = t07.C07_ITEM_GROUP_ID;

-- right join
select t01.*, 
t07.C07_ITEM_GROUP_NAME, 
t07.C07_STATUS 
from t01_item t01 
right join t07_item_group t07 on 
t01.C01_ITEM_GROUP_ID = t07.C07_ITEM_GROUP_ID;

-- right join
select t01.*, 
t07.C07_ITEM_GROUP_NAME, 
t07.C07_STATUS 
from t01_item t01 
right join t07_item_group t07 on 
t01.C01_ITEM_GROUP_ID = t07.C07_ITEM_GROUP_ID
where t01.C01_ITEM_GROUP_ID is null;

-- join self
select t01.*, ref_item.C01_ITEM_NAME, ref_item.C01_ITEM_ID from 
t01_item t01 join t01_item ref_item on t01.C01_REF_ITEM_ID = ref_item.C01_ITEM_ID;

-- 6. khái niệm inđex
explain select * from t01_item where C01_ITEM_ID = 1;

explain select * from t01_item where C01_ITEM_NAME = 'Áo 1';

alter table t01_item add index IDX_ITEM_NAME(c01_item_name);