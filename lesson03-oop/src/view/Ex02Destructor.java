package view;

import been.Car;

public class Ex02Destructor {
	public static void main(String[] args) {
		Car c1 = new Car(1, "A1", "A11 Name", 220d);//H1
		 final Car c2 = new Car(2, "A2", "A22 Name", 280d);//H2
		
		Car c3 = c1;
		
		//c2= new Car(22, "A22", "A22 Name", 440d);//H4
		
		// ô nhớ, đối tượng ở vị trí h2 không có liên kết ở bất kỳ biến nào
		// ở stack --> unused, với java sẽ tự clear những unused object
		// thông qua cơ chế garbage collection
		
		// nguyên nhân
		// biến trỏ đến đối tượng đó, nó trỏ đến đối tượng hay bộ nhớ khác
		// ô nhớ cũ không còn được sử dụng
		
		// có cách nào để hạn chế ra các unused object không?
		// gán final cho biến KDL đối tượng
	}

}
