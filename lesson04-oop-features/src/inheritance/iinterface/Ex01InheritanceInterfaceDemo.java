package inheritance.iinterface;

public class Ex01InheritanceInterfaceDemo {

	public static void main(String[] args) {
		// anonymous inner type
		// anonymous class --> lớp ẩn danh
		// calcS chỉ dùng sd 1 2l
		// nội dung hàm ngắn
		Shape shape1 = new Shape() {

			@Override
			public void calcS() {
				System.out.println("Circle#calcS .. imp");

			}

			@Override
			public void setBorder() {
				// TODO Auto-generated method stub

			}
		};
		shape1.calcS();

		// imp class
		// calcS sd nhiều lần
		// nội dung hàm dài
		Shape shape2 = new Circle();
		shape2.calcS();

		System.out.println(Shape.color);
	}
}
