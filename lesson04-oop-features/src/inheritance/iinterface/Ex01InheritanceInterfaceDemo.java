package inheritance.iinterface;

public class Ex01InheritanceInterfaceDemo {

	public static void main(String[] args) {
		Shape shape1 = new Shape() {
			
			@Override
			public void calcS() {
				System.out.println("Circle#calcS ... implementation");
			}
		};
		shape1.calcS();
		
		// implementation class
		// calcS sử dụng nhiều lần
		// nội dung hàm dài
		
		Shape shape2 = new Curcke();
		shape2.calcS();
	}
}
