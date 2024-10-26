package inheritance.iinterface;



public class Ex01InheritanceInterfaceDemo {

	public static void main(String[] args) {
		/*
		 anonymous inner type
		 anonymous class --> lớp ẩn danh
		 calcS chỉ use 1 2 lần
		 content hàm ngắn
		 */
		Shape shape1 = new Shape() {
			@Override
			public void calcS() {
				System.out.println("Circle#calcS ... implementation");
			}
		};
		shape1.calcS();
		
		//implementation class
		//calcS use many times
		Shape shape2 = new Circle();
		shape2.calcS();
	}
	
}
