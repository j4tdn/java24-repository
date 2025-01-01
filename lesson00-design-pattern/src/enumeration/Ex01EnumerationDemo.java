package enumeration;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Ex01EnumerationDemo {
	// Record: Biến những tt thành final, ko hỗ trợ setter --> Từ JAVA 17 hoặc sau
	// JAVA 11
	private record Point(int x, int y) {

	}

	private record Circle(Point p, double r) {

	}

	public static void main(String[] args) {

		// Xác định vị trí điểm A (xA, yA) với đường tròn tâm (O, r)
		Point pA = new Point(3, 4);
		Circle circle = new Circle(new Point(0, 0), 5);
		System.out.println("Vị trí: "+getPosition(pA, circle));

	}

	private static CirclePos getPosition(Point pA, Circle circle) {
		Point pO = circle.p();
		double r = circle.r();
		double d = sqrt(pow((pA.x - pO.y), 2) + pow(pA.y - pO.y, 2));
		if (d < r) {
			return CirclePos.ONSIDE;
		}
		if (d == r) {
			return CirclePos.INSIDE;
		}
		return CirclePos.OUTSIDE;
	}

}
