package inheritance.iinterface;

public class Ex01InheritanceInterfaceDemo {

	public static void main(String[] args) {
		// annonymous inner type
		// annonymous class --> lớp ẩn danh
		// calcS chỉ sử dụng 1 2 lầm
		// nội dung hàm ngắn
		
		Shape shape1 = new Shape() {
			
			@Override
			public void calcS() {
				System.out.println("Circle#calcS ... implementation");
				
			}
		};
	shape1.calcS();	
	
	// implementation class
	// calcS sử dụng nhiều lần
	// Nội dung hàm dài
	
	
	Shape shape2 = new Circle();
	shape2.calcS();
	
	}
}
