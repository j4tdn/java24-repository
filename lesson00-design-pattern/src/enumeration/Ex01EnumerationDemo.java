package enumeration;
import static java.lang.Math.*;
public class Ex01EnumerationDemo {

    // xac dinh vi tri cua 1 diem A(x,y) voi duong tron tam (o,r)

    private record Point(int x, int y) {

    }

    private record Circle(Point p, double R) {

    }

    public static void main(String[] args) {
        Point pA = new Point(3,4);
        Point pO = new Point(0,0);
        Circle c1 = new Circle(pO,5);

        System.out.println(getPosistion(pA,c1).getLocalizedMessage());
    }
    private static CirclePos getPosistion(Point pA, Circle circle) {
        Point pO = circle.p();
        double r = circle.R();
        double d = sqrt(pow(pA.x()-pO.x(), 2) + pow(pA.y()-pO.y(), 2));
        if(d < r) return CirclePos.INSIDE;
        if(d == r) return CirclePos.ONSIDE;
        return CirclePos.OUTSIDE;
    }

}
