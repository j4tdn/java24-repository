package polymorphism.object;

public class Shape {
	
	/*
	 * Hàm trong class bát buộc phải có body {}
	 * JAVA 1.0 -> 1.7
	 * 
	 * 1. Muốn 1 hàm không có body trong KDL cha
	 * --> hàm trong class --> không được
	 * 2. Mong muốn khi con kế thừa từ cha bắt buộc phải overide hàm từ cha -->  KDL cha là class --> không được
	 * 
	 * 
	 * --> KDL cha là interface
	 * --> KDL con là class
	 */

	void calcS() {
		System.out.println("Shape#calcS");
	}
	
	private void clear() {
		System.out.println("Shape#clear");
	}
	
	
	
}
