A. Class 
Customer: id ,name,phone,id,address
Item  : id , os,color,cost

B1:Create List of customer
B2: Create array of items in store
B3:Shopping function
+Who is buying
+List of items
+Amount of each item 
+Time(datetime)
=> Order: customer,item_details[],date_time,
=> itemDetail: item,quatity
========================
B.Object
c1:KH1Adam,123,Newyork
c1:KH2,Kate,243,California

i1:SS10+,Android,Black,620
i2:S20U,Android,Green,840
i3:IP4,IOS,White,280
i4:IP12,IOS,Black,880
i5:WP8,WindowPhone,Blue,560

O1:c1, {id1{i1,3},id2{i4,3},id3{i2,1}},10:10:10 08.05.2021
O2:c2, {id1{i3,2},id2{i5,1}},20:10:12 07:05:2021
O3:c2, {id1{i4,1}},08:28:32 08:05:2021

_
C.Function export (order) => TotalOfAmount:void