package inheritance.iinterface;

public class Ex01InheritanceInterfaceDemo {

	public static void main(String[] args) {
		/*
		 * anonymous innter type anonymous class --> lớp ẩn danh calcS chỉ sử dụng 1,2
		 * lần nội dung hàm ngắn
		 */
		Shape shape1 = new Shape() {
			@Override
			public void calcS() {
				System.out.println("Circle#calcS..implementation");
			}

			@Override
			public void setBorder() {
				System.out.println("4px");
			}
		};
		shape1.calcS();
		// implementation class
		// calcS sử dụng nhiều lần
		// nd hàm dài
	}
}
