package view;

import bean.Car;

public class Ex02Destructor {

	public static void main(String[] args) {

		final Car c1 = new Car(1, "A1", "A11 Name", 220d); // H1

		Car c2 = new Car(2, "A2", "A2 Name", 280d); // H2

		Car c3 = c1;

		c2 = new Car(22, "A22", "A22 Name", 440d); // H4

		// Ô nhớ, đối tượng ở vị trí H2 ko có đc liên kết bởi bất kỳ biến nào
		// Ở stack --> unused, với Java sẽ tự clear những unused object
		// thông qua cơ chế garbage collection
		
		// Nguyên nhân
		// Biến trỏ đến đối tượng đó, nó trỏ đến đối tượng hay ô nhớ khác
		// Ô nhớ cũ ko còn ddc sử dụng
		
		// Có cách nào để hạn chế tạo ra các unused object ko?
		// Gán final cho biến KDL đối tượng
	}
}
