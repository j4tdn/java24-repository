package view;

import bean.Car;

public class Ex02Destructor {

	public static void main(String[] args) {
		
		Car c1 = new Car(1, "A1", "A11 name", 220d);// H1

		final Car c2 = new Car(2, "A2", "A22 name", 280d);// H2
		
		Car c3 = c1;
		// tại đây vẫn còn H1, H2
		
		//c2 = new Car(22, "A22", "A22 name", 440d);// H4
		
		//Ô nhớ, obj ở idx H2 ko có đc lket bởi bất ký biến nào ở STACK --> unused
		//=> vs Java sẽ tự clear unsed obj thông qua cơ chế garbage collection
		
		
		/*Cause:
			biến trỏ đến obj đó, nó trỏ đến obj hay ô nhớ khác
			ô nhớ cũ ko còn dc use
		 */
	
		// Có cách nào limit tạo ra các unused objs ko?
		// fix -> final cho biến KDL Obj
	}
	
}
