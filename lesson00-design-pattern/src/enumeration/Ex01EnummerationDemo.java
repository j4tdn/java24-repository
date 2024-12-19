package enumeration;

import static java.lang.Math.*;
import static enumeration.CirclePos.*;

public class Ex01EnummerationDemo {

	// Record: Biến những tt thành final, không hỗ trợ setter
	//--> Immutable
	private record Point(int x, int y) {}
	
	private record Circle(Point p, double R) {}
	// Xác định vị trí của 1 điểm A(xA, yA) với đường tròn (O, r)
	
	public static void main(String[] args) {
		Point pA = new Point(3, 4);
		Point pO = new Point(0, 0);
		Circle circle = new Circle(pO, 5);
		
		System.out.println("Vi tri: "  + getPosistion(pA, circle).getLocalizedMessage());
	}
	
	private static CirclePos getPosistion(Point pA, Circle circle) {
		
		Point pO = circle.p();
		double r = circle.R();
		
		double d = sqrt(pow(pA.x - pO.x, 2) + pow(pA.y - pO.y, 2));
		
		if (d < r) {
			return CirclePos.INSIDE;
		}
		if (d == r) {
			return CirclePos.ONSIDE;
		}
		return CirclePos.OUTSIDE;
	}
	
}
