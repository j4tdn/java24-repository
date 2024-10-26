package inheritancee.iinterface;

public class Ex01InheritanceInterfaceDemo {
	public static void main(String[] args) {
		// Anonymous class --> lop an danh
		// calcs chi su dung 1 2 lan
		// noi dung ham ngan

		Shape shape1 = new Shape() {

			@Override
			public void calcS() {
				// TODO Auto-generated method stub
				System.err.println("Circle#calcS...implementation");
			}
		};

		shape1.calcS();
		Shape shape2 = new Circle();
		shape2.calcS();

	}
}
