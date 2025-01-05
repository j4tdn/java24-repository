package enumeration;

import static java.lang.Math.*;
public class Ex01EnumerationDemo {
	//Record: biến những tt thành final, không hỗ trợ setter
		private record Point(int xA, int yA) {
		}
		private record Circle(Point p, double R) {
		}
	// xác định vị trí của 1 điểm A (xA, yA) với đường tròn (0,r)
	public static void main(String[] args) {
		Point pA = new Point(3, 4);
		Point pO = new Point(0, 0);
		Circle circle = new Circle(new Point(0, 0),5);
		System.out.println("vị trí :" + getPoSistion(pA, circle));
	}
	private static CirclePos getPoSistion(Point pA, Circle circle) {
		Point pO = circle.p();
		double r = circle.R();
		double d = Math.sqrt(pow(pA.xA - pO.xA, 2) + pow(pA.yA - pO.yA, 2));
		if (d < r) {
			return CirclePos.INSIDE;
		}
		if (d == r) {
			return CirclePos.ONSIDE;
		}
		return CirclePos.ONSIDE;
	}
}
