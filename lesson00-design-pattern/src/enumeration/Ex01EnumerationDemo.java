package enumeration;
import static java.lang.Math.*;

public class Ex01EnumerationDemo {
	private record Point(int x, int y) {
	}
	
	private record Circle(Point p, double R) {
	}
	// xác đinhk vị trí của 1 điểm a(xA, yA) với đường tròn (O, r)
	
	public static void main(String[] args) {
		Point pA = new Point(3, 2);
		
		Circle circle = new Circle(new Point(0, 0), 5);
		System.out.println("Vị trí: " + getPosition(pA, circle).getLocalizedMessage());
	}
	
	private static CirclePos getPosition(Point pA, Circle circle) {
		double r = circle.R;
		double d = sqrt(pow(pA.x - circle.p.x, 2) + pow(pA.y - circle.p.y, 2));
		
		if(d<r) {
			return CirclePos.INSIDE;
		} 
		if(d==r) {
			return CirclePos.ONSIDE;
		}
		return CirclePos.OUTSIDE;
	}
	
}
