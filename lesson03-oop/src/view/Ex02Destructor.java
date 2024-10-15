package view;

import bean.Car;

public class Ex02Destructor {
	public static void main(String[] args) {
		Car c1 = new Car(1, "A1", "A1 name", 110d); // H1
		
		Car c2 = new Car(2, "A2", "A2 name", 220d); // H2
		
		Car c3 = c1;
		
		c2 = new Car(22, "A22", "A22 Name", 440d); //H4
		
		// Ô nhớ, đổi tượng ở vị trí H@ không được liên kết với bất kỳ biến nào 
		//ở stack --> unused, với java sẽ tự clear những unused object
		// thông qua cơ chế garbage collection
		
		//nguyên nhân
		//Biến trỏ đến đối tượng đó, nó trỏ đến đối tượng/Ô nhớ khác
		//--> ô nhớ cũ không còn được sử dụng
		
		//Có cách nào để hạn chế tạo ra các unused object không?
		// Gán final cho biến KDL đối tượng
	}
}
