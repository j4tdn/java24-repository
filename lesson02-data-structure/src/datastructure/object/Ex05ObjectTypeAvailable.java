package datastructure.object;

import bean.Item;

public class Ex05ObjectTypeAvailable {

	public static void main(String[] args) {
		
		
		// object type: custom
		Item i1 = new Item();
		Item i2 = new Item(2,'B',22d);
		
		//object type: available
		// Integer = value (int)
		// String = value (byte[])
		
		Integer o1 = new Integer(55);
		String s1 = new String("Hello");
		Long l1 = new Long(999l);
//		System.out.println('o1 ---->' + o1);
//		System.out.println('s1 ---->' + s1);
//		System.out.println('l1 ---->' + l1);
		
		//ALL : Để khởi tạo 1 đối tượng  ---> dùng toán tử new
		
		// Với KDL đối tượng có sẵn của JAVA
		// Integer, Long, String, Double....
		// Không cần phải dùng new mà có thể gán trực tiếp
		// giá trị cho biến đối tượng
		
		// Vì KDL có sẵn có duy nhất 1 thuộc tính
		// Thay vì new đối tượng rồi set thì
		// chỉ cần gán giá trị còn việc new và set thì JAVA tự làm cho mình
		
		// Còn KDL do mình tự tạo ra
		// Java sẽ không biết sẽ có bao nhiêu thuộc tính để xử lí
//		Integer o1 = 123;
//		Long l2 = 345;
//		String s2 = "world";
		
		
	}
	
}
