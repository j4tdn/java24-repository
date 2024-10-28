package poylmorphism.object;

public class Shape {
	/*
	 * Hàm trong class bắt buộc phải có body {} JAVA 1.0 -> 1.7 1. Muón 1 hàm ko có
	 * body trong KDL cha --> hàm trong class -> ko được 2. Mong muốn khi con kế
	 * thừa từ cha bắt buộc phải override hàm từ cha --> KDL cha là class --> ko
	 * được
	 * 
	 * --> KDL cha là interface --> KDL con là class
	 */

	void calcS() {
		// System.out.println("Shape#caclS");
	}
}
