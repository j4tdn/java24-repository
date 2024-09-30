package datastructure.object;

import been.Item;

public class Ex05ObjectTypeAvailable {

	public static void main(String[] args) {
		// Khai báo/gán giá trị số/ký tự cho KDL byte, char
		// Khi sử dụng, in ra =>
		// char --> 100% kí tự
		// byte --> 100% số
		// Sử dụng bộ kí tự trong ASCII	
		char c1 = 'A'; 
		byte c2 = 'A';
		System.out.println("c1 --> " + c1);
		System.out.println("c2 --> " + c2);
		
		// primitive
		int x1 = 5;
		
		// object type: custom (tự tạo ra)
		Item i1 = new Item(); // khởi tạo ô nhớ, giá trị rỗng
		Item i2 = new Item(2, 'B', 22d); // gán giá trị
		
		// object type: available (có sẵn)
		// Integer: value (int) kiểu int
		// String: value(byte[]) kiểu mảng byte[]
		Integer o1 = new Integer(55); // Gọi hàm khởi tạo class Integer
		Long l1 = new Long(77l);
		String s1 = new String("hello");
		System.out.println("o1 --> " + o1);
		System.out.println("l1 --> " + l1);
		System.out.println("s1 --> " + s1);
		
		//ALL: Để khởi tạo 1 đối tượng --> dùng toán tử new
		
		// Với KDL đối tượng có sẵn của JAVA
		// Integer, Long, String, Double ...
		// Ko cần phải dùng new mà có thể gán trực tiếp
		// giá trị cho biến đối tượng
		
		// Vì KDL có sẵn có duy nhất 1 thuộc tính
		// Thay vì new đối tượng rồi set giá trị
		// Chỉ cần gán giá trị còn việc new và set thì JAVA tự làm
		
		// Còn KDL do mình tự tạo ra
		// Java sẽ ko biết
		
		Integer o2 = 123;
		Long l2 = 345l;
		String s2 = "word";
		
		// Item i22 = new Item(22, 'Z', 22d)
		// Item i22 = 22 'Z' 22d
		
	}
}
