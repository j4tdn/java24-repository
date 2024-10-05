package selfexercise;

import bean.Item;

/*
 * Khởi tạo biến number = 22 
 * Cập nhật giá trị biến number = 44
 * Khởi tạo 2 biến it1, it2 với 3 thuộc tính id name saleprice
 * Cập nhật giá trị 3 thuộc tính của biến it1
 * Gán it1 = it2
 * Cập nhật tên it1 bằng tên mới
 * Khởi tạo biến digit = 55 
 * Khởi tạo biến it3 với 3 giá trị
 * Khởi tạo hàm modify với tham số truyền vào là số nguyên , trong hàm cho element = 66
 * Khởi tạo hàm modify mới tham số truyền vào là biến KDL đối tượng , cập nhật name mới cho biến KDL đối tượng đó
 * Chạy hàm modify với tham số là digit
 * Chạy hàm modify với tham số là it3
 * In ra giá trị digit và it3
 * Khởi tạo hàm update với tham số truyền vào là biến KDL đối tượng, cập nhật tên mới cho biến,
 * Khởi tạo 3 giá trị thuộc tính mới cho biến đó , cập nhật id,name,saleprice
 * Khởi tạo biến it4  với 3 giá trị 
 * Chạy hàm update với biến truyền vào là it4
*/

public class ObjectPassParamViaMethod {
	
	public static void main(String[] args) {		
		String s1 = new String("hello");
		System.out.println(System.identityHashCode(s1));
		
		s1 = "bye";
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
	}
	

}
