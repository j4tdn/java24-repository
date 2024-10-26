package inheritancee.iinterface;

//class dang thuc thi tu interface
//bat buoc phai override lai cac ham truu tuong tu interface
public class Rectangle implements Shape {
	@Override
	public void calcS() {
		System.out.println("Rectangle#calcs...implementation");

	}
}
