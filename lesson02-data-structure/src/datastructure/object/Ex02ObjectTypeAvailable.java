package datastructure.object;
import bean.Item;
public class Ex02ObjectTypeAvailable {
	
	public static void main(String[] args) {
		//Khai báo / gán giá trị số /kí tự cho KDL byte, char
		//sử dụng in ra
		// char->kí tự
		// byte->số
		
		// primitive
		int x1 = 5;
		
		//Object type
		Item i1 = new Item();
		Item i2 = new Item(2,'B',22);
		
		//object type :available
		//Integer :value(int)
		//String :value(byte[])
		Integer o1 = new Integer(55);
		Long l1 = new Long(77l);
		String s1 = new String("helo");
		System.out.println("01-->" + o1);
		System.out.println("l1-->" + l1);
		System.out.println("s1-->" + s1);
		
		//ALL : để khởi tạo 1 đối tượng -> dùng toán tử new
		
		// với KDL đối tượng có sẵn của JAVA
		// Integer , Long,......
		//không cần phải dùng new  có thể gán trực tiếp
		//giá trị có biến đối tượng
		
		// vì KDL có sẵn có duy nhất 1 thuộc tính
		// thay vì new đối tượng rồi set giá trị thì
		// chỉ cần gán giá trị còn việc new và set thì JAVA tự làm
		
		// còn KDL do mình tự tạo ra
		//JAVA sẽ không biết có bao nhiêu thuộc tính để sửa lý
//		Integer o1 = 123;
		
		
		
		
		
	}

}