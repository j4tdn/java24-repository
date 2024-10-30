package polymorphism.object;

public class Ex01PolyObjectDemo {
	
	
	
	public static void main(String[] args) {
		
		// Khởi tao đối tượng (usual)
		Shape shape1 = new Shape();
		Square square1 = new Square();
		Rectangle rectangle1 = new Rectangle();
		
		shape1.calcS();
		square1.calcS();
		rectangle1.calcS();
		
		System.out.println("\n===================\n");
		
		// Khởi tao đối tượng (sử dụng đa hình trong đối tượng)
		
		Shape s1 = new Square();
		Shape s2 = new Rectangle();
		Shape s3 = s1;

		s1.calcS();
		s2.calcS();
		s3.calcS();
		
		Square sq1 = (Square) new Shape();
		Square sq2 = (Square)s1;
		
		sq1.setBackground();
		System.out.println("Line#86");
		sq2.setBackground();
	
	/*
	 	Câu hỏi 1:
		Biến KDL con trỏ đến đối tượng KDL cha được không ?
	  	Vì sao?
		
		+ Khi lấy biến KDl con gọi đến hàm riêng, tại thời điểm runtime không thể tìm 
		thấy hàm riêng đó trong KDL cha
		--> Lỗi ngay tại thời điểm gán đối tượng KDL cha cho biến con
	 */
	
	
	
	/*
	  	Câu hỏi 2:
		Tại sao không code trực tiếp KDL nào trỏ đến đối tượng KDL đó
	 	mà phải dùng biến cha trỏ đến con? 	
	 	
	 	+ Dễ dàng ép KDL trong phạm vi cha con, anh em lúc compile
	 	+ Linh hoạt trong
	 	--> Tạo mảng: nhận danh sách các phần tử là chính nó hoặc KDL con
	 	--> Truyền tham số qua hàm: tham số có thể nhận KDL chính nó hoặc KDL con
	 */
	
	
	Shape[] shapes = {s1, s2, s3, square1, rectangle1};
	
	// Lúc compiile từng phần tử trong shapes --> Shape
	// In ra các đối tương là hình vuông
	
	int squareCounter = 0;
	for (Shape shape: shapes) {
		if (shape instanceof Square) {
			squareCounter++;
			// Square x1 = ((Square) shape);
			((Square) shape).setBackground();
		}
	}
	System.out.println("square counter --> " + squareCounter);
	
	printf(s1);
	printf(s2);
	printf(square1);
	printf(rectangle1);
	
	}
	
	private static void printf(Shape shape) {
		System.out.println("shape --> {");
		System.out.println(" " + shape);
		System.out.println("}\n");
	}
}
