package inheritance.iinterface;

public class Ex01InheritanceInterfaceDemo {
	public static void main(String[] args) {
		// anonymous inner type
		// anonymous class --> lop an danh
		// calcS chi su dung 1 2 lan
		// noi dung ham ngan
		Shape shape1 = new Shape() {

			@Override
			public void calcS() {
				System.out.println("Circle#calcS ... implementation");
			}
			@Override
			public void setBorder() {
				System.out.println("1px");
			}
		};
		
		shape1.calcS();
		Shape shape2 = new Circle();
		shape2.calcS();

		// implemnetation class
		// calcS su dung nhieu lan
		// noi dung ham dai
	}
}
