package enumeration;
import static java.lang.Math.*;
public class Ex01Demo {
	private record Point(int x, int y) {

	}
	private record Circle(Point p ,double R) {
		
	}
	// xác đinh vị trí điểm A (xA,yA) với đường tròn tâm 0 bán kính r
	public static void main(String[] args) {
		Point pA = new Point(3, 4);
		Circle circle = new Circle(new Point(0, 0), 5);
		System.out.println("Vị trí : "+getPosition(pA, circle));
	}
	private static CirclePos getPosition(Point pA , Circle circle) {
		Point pO=circle.p();
		double r = circle.R();
		double d = sqrt(pow(pA.x -pO.x,2 ) + pow(pA.y - pO.y , 2)) ;
		if(d < r) {
			return  CirclePos.INSIDE;
		}
		if(d == r) {
			return CirclePos.OUTSIDE;
		}
		
//		return CirclePos.;
	}

}
