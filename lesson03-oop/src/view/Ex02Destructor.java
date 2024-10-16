package view;

import bean.Car;

public class Ex02Destructor {
	public static void main(String[] args) {
		final Car c1 = new Car(1, "A1", "A11 Name", 220d);
		Car c2 = new Car(2, "A2", "A22 Name", 280d);
		Car c3 = c1;
		
		c2 = new Car(22, "A22", "A22 Name", 440d);
		//Ô nhớ ,đối tượng ở vị trí H2 ko có được liên kết bởi bẩ kỳ biến nào
		//ở satck => unused, với Java sẽ tẹu clear những unused object
		//thông qua cơ chế gảbage collection
		
		//Nguyên nhân
		//Biến trỏ đến đối tượng đó, nó trỏ đến đối tượng hay ô nhớ khác
		//ô nhớ cũ không còn được sử dụng
		
		//có cách nào để hạn chế tạo ra các unused object không?
		// Gán final cho biến KDL đối tượng
	}
	

}
