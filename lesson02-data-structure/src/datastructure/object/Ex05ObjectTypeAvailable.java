package datastructure.object;

import bean.Item;

public class Ex05ObjectTypeAvailable {
	
	public static void main(String[] args) {
		// Khai báo/ gán giá trị số/kí tự cho kiểu dữ liệu byte, char 
		// sử dụng, in ra
		// char --> kí tự
		// byte --> số trong bảng mảng ASCII tương ứng với kí tự
		char c1 = 'A';
		byte c2 = 'A';
		System.out.println("c1 --> " + c1);
		System.out.println("c2 --> " + c2);
		
		// primitive
		int x1 = 5;
		
		// object type: custom
		Item i1 = new Item();
		Item i2 = new Item(2, 'B', 22d);
		
		// object type: available
		// Integer: value(int)
		// String: value(byte[])
		Integer o1 = new Integer(55);
		Long l1 = new Long(771);
		String s1 = new String("hello");
		System.out.println("o1 --> " + o1);
		System.out.println("l1 --> " + l1);
		System.out.println("s1 --> " + s1);
		
		// ALL: Để khởi tạo 1 đối tượng --> dùng toán tử new 
		
		// Với KDL đối tượng có sẵn của JAVA		
		// Integer, Long, String, Double ...
		// Không cần phải dùng new mà có thể gán trực tiếp
		// giá trị cho biến đối tượng
		
		// Vì KDL có sẵn có duy nhất 1 thuộc tính
		// Thay vì new đối tượng rồi set giá trị thì
		// chỉ cần gán giá trị còn việc new và set thì Java tự làm
		
		// Còn KDL do mình tự tạo ra
		// Java sẽ không biết sẽ có bao nhiêu thuộc tính để xử lí
		
		Integer o2 = 123;
		Long l2 = 345l;
		String s2 = "world";
		
		// Item i22 = new Item(22, 'Z', 22d);
		// Item i22 = 22 'Z' 22d
		
		// int và Integer khác nhau ở chỗ int thì bắt buộc phải có giá trị, Integer có giá trị hoặc null . Áp dụng trong
		// thực tế data khách hàng có thể nhập vào hoặc không, khi khách hàng không nhập vào thì null, chương trình vẫn
		// có thể chạy được, còn int thì không
	}
}
