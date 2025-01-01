package enumeration;

import static java.lang.Math.*;

public class Ex01EnumerationDemo {

	// Record: Biến những tt thành final, không hỗ trợ setter
	private record Point(int x, int y) {
	}

	private record Circle(Point p, double R) {
	}

	// Xác định vị trí của 1 điểm A(xA, yA) với đường tròn (O, r)

	public static void main(String[] args) {
		Point pA = new Point(3, 4);
		Circle circle = new Circle(new Point(0, 0), 5);
		System.out.println("Vị trí: "+getPosition(pA, circle).getLocalizedMessage());

	}

	private static CirclePos getPosition(Point pA, Circle circle) {
		Point pO = circle.p(); // hàm getter của record
		
		double r = circle.R();
		double d = sqrt(pow(pA.x - pO.x,2) + pow(pA.y - pO.y,2));
		
		if( d < r ) {
			return CirclePos.INSIDE  ;
		}
		if( d == r ) {
			return CirclePos.ONSIDES  ;
		}
		
			return CirclePos.OUTSIDE  ;
		
		
	}

}
