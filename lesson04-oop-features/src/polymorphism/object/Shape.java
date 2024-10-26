package polymorphism.object;

public class Shape {
	/*
	 * Hàm trong class bắt buộc có body{}
	 * 
	 * 1. Muốn 1 hàm ko có body trong KDL cha --> hàm trong class --> không được
	 * 
	 * 2. Mong muốn khi kế thừa từ cha bắt buộc phải override hàm từ cha --> KDL cha
	 * là class --> không được
	 * 
	 * --> KDL cha là interface --> KDL con là class
	 */
	void calcS() {
		System.out.println("Shape#cals");
	};
}
