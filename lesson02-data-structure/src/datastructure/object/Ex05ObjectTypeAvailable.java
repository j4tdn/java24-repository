package datastructure.object;

import bean.Item;

public class Ex05ObjectTypeAvailable {

	public static void main(String[] args) {
//		KDL 
		/*
		 * Char : ký tự
		 * 
		 * byte : số
		 * 
		 * --> cả 2 sử dụng bảng mã ASCII để convert cho nhau
		 * 
		 * 
		 */
		int x1 = 5;
		
		//objec type: custom
		Item i1 = new Item();
		Item i2 = new Item(2, 'B', 22d);
		
		//object type:available
		//Interger: value(int)
		//String: value(byte[])
		
		Integer o1 = new Integer(55);
		Long l1 = new Long(77l);
		String s1 = new String("hello");
		System.out.println("o1 --> " + o1);
		System.out.println("l1 --> " + l1);
		System.out.println("s1 --> " + s1);
		
		//All: để khởi taoh 1  đối tượng --> dùng toán tử new
		
		// Với KDL đối tượng có sẵn của JAVA
		//KHông cần phải new mà có thể gán trực tiếp giá trị cho biến đối tượng
		//
		//Vì KDL có sẵn có duy nhất có 1 thuộc tính
		//Thay vì new đối tượng rồi set gtri thì chỉ cần gán giá trị còn new JAVA làm
		
		//CÒn KDL do mình tạo ra
		// JAVA sẽ không  biết có bn thuộc tính ddeer xử lý
		
		Integer ii1 = 22;
		Long ll1 = 23l;
	}
}
