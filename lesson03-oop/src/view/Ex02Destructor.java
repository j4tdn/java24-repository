package view;

import bean.Car;

public class Ex02Destructor {
	
	public static void main(String[] args) {
		
		final Car c1 = new Car(1, "A1", "A11 Name", 220d);
		
		Car c2 = new Car(2, "A2", "A22 Name", 280d);
		
		Car c3 = c1;
		
		c2 = new Car(22, "22", "A22 Name", 480d);
		
		// Ô nhớ, đối tượng ở vị trí H2 ko có đc liên kết bởi bất kỳ biến nào ở STACK --> unused,
		// với Java sẽ tự clear những unused object thông qua cơ chế garbage collection
		
		// Nguyên nhân
		// Biến trỏ đến đối tượng đó, nó trỏ đến đối tượng hay ô nhớ khác
		// Ô nhớ cũ kh còn được sử dụng
		
		// Có cách nào để hạn chế tạo ra các unused objects ko?
		// Gán final cho biến KDL đối tượng
	}
}
