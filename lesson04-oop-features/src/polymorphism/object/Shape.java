package polymorphism.object;

public class Shape {
	
	/*
	 * Hàm trong class bắt buộc phải có body {}
	 * JAVA 1.0 -> 1.7
	 * 
	 * 1. Muốn 1 hàm không có body trong KDL cha
	 *    --> hàm trong class --> không được
	 * 2. Mong muốn khi con kế thừa từ cha bắt buộc phải override
	 *    hàm từ cha --> KDL cha là class --> ko được
	 *    
	 * --> KDL cha là interface
	 * --> KDL con là class
	 */
	
	void calcS() {
		// System.out.println("Shape#calcS");
	}
	
	private void clear() {
		System.out.println("Shape#clear");
	}
	
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.clear();
		
		Shape s1 = new Square();
		s1.clear();
	}
	
}
