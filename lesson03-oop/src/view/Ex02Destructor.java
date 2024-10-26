package view;

import bean.Car;

public class Ex02Destructor {

	public static void main(String[] args) {
		
		Car c1 = new Car(1,"A1","A1 Name",200d); // H1
		Car c2 = new Car(2,"A2","A2 Name",290d); // H2
		
		Car c3 = c1;
		
		c2 = new Car(22,"A22","A22 Name", 400d); // H4
		
		// Ô nhớ, đối tượng ở vị trị H2 không còn được liên kết với bất kì giá trị nào
		// ở stack ---> unused, với Java sẽ tự clear những unused object
		// thông qua cơ chế garbage collection
		
		// Nguyên nhân
		// Biến trỏ đến đối tượng đó, trở đến đối tượng, ô nhớ khác
		// Ô nhớ cũ không được sử dụng
		
		// Cách hạn chế tạo ra các unused objects
		// Gán final cho biến KDL đối tượng
		
		
		
		
	}
	
}
