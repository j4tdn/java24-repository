package datastructure.object;

import java.sql.SQLOutput;

import bean.Item;

public class Ex05ObjectTypeAvailable {
	public static void main(String[] args) {
		
	
	// primitive 
	int x1 = 5;
	
	//object type: custom
	Item i1 = new Item();
	Item i2 = new Item(2, 'B', 22d);
	
	//Objective type: Available
	// Integer: value(int)
	//String: value(byte[])
	 Integer o1 = new Integer(55);
	 Long l1 = new Long(77l);
	 String s1 = new String("Hello");
	 System.out.println("o1 -- > "+o1);
	 System.out.println("l1 -- > "+l1);
	 System.out.println("s1 -- > "+s1);
	 
	 
	  /*
	   All: Để khởi tạo 1 đối tượng --> dùng toán tử new
	   
	   Với KDL đối tượng có sẵn của JAVA
	   Integer, Long, String, Double, ...
	   Không cần phải dùng new mà có thể gán trực tiếp
	   Chỉ cần gán giá trị còn việc new và set thì Java tự làm
	   
	    Còn KDL do mình tạo ra
	    Java sẽ không biết có bao nhiêu thuộc tính để xử lý
	  */
	 
	 Integer o2 = 123;
	 Long l2 = 345l;
	 String s2 = "word";
	
	 System.out.println("o2 -- > "+o2);
	 System.out.println("l2 -- > "+l2);
	 System.out.println("s2 -- > "+s2);
	}
}
