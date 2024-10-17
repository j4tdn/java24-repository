A. class: 
Customer: id ,name, phone, address
Item    : id , os, color, cost
=>ItemDetail :item, quantity
=> Order: customer, Item_detail[], data_time


b1: create list of customrs
b2: Create array of items in store
b3: Shopping function
+ ai đang mua hàng
+ một danh sách hàng đã mua
+ số lượng của mặt hàng
+ thời gian mua


======================================
B. Object
C1: KH1, Phước , 0347941497, Da Nang
C2: KH2, PhướcDZ , 1234567890, Da thanh
=======================================
i1: SS10+ , Android, Black,620
i2: SS20U, Android, Green,840
i3: IP4, IOS, White, 280
i4: IP12, IOS, Black, 880
I5: wP8 , Windowphone, Blue, 560

o1: c1 ,{id1(i1,3), id2(i4,1) ,id3(i2,1)}, 10:10:10 08.05.2021 
o2: c2 ,{id1(i3,2), id2(i5,1)}, data_time ,20:10:12 07.05.2021 
o3: c2 ,{id1(i4,1)}, 09:28:10 08.05.2021 

C. Function
Function: export(order) => TotalOfAmout:void


