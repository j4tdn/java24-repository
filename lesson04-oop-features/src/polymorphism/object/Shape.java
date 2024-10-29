package polymorphism.object;

public class Shape {
	/*
	   Hàm trong class bắt buộc phải có body {}
	   
	   1. muốn 1 hàm không có body trong KDL cha
	   		--> hàm trong class-->Không được
	   2. mong muốn khi con kế thừa từ cha bắt buộc phải override hàm từ cha --> KDL cha là class --> không được	
	   
	   --> KDL cha là interface 
	   --> KDL con là class
	 */
	
	
	 void calsS() {
		System.out.println("Shape#calcS");
	}
	private void clear() {
		System.out.println("Shape#clear");
	}
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.clear();
		
		Shape s1 = new Shape();
		s1.clear();
	}
	

}
