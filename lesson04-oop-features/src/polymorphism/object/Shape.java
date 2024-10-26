package polymorphism.object;

public class Shape {
	/*
	 * Hàm trong class bắt buộc phải có body {}
	 * 1. Muốn 1 hàm ko có body trong KDL cha 
	 * 		=> hàm trong class ==> ko dc
	 * 2. Mong muốn khi con kế thừa từ cha bắt buộc phải override hàm từ cha
	 * 		=> KDL cha là class --> ko dc
	 * 
	 * --> KDL cha là interface 
	 * --> KDL con là class
	 */
	
	
	void calcS() {
		System.out.println("Shape#calcS");
	}
	
	void setBackground() {
		System.out.println("Square#setBackground");
	}
	
}
