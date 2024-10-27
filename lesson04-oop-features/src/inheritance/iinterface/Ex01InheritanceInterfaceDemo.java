package inheritance.iinterface;

public class Ex01InheritanceInterfaceDemo {
	
	public static void main(String[] args) {
		// anonymous inner type 
		// anonymous class --> lớp ẩn danh
		// sử dụng anonymous class khi calcS chỉ sử dụng 1, 2 lần
		// nội dung hàm ngắn
		Shape shape1 = new Shape() {
			
			@Override
			public void calcS() {
				System.out.println("Circle#calcS ... implementation");
			}
			
			@Override
			public void setBorder() {
				System.out.println("4px");
			}
			
		};
		
		shape1.calcS();
		
		// implementation class
		// calcS sử dụng nhiều lần
		// nội dung hàm dài
		Shape shape2 = new Circle();
		shape2.calcS();
		
	}

}
