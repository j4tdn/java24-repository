package polymorphism.object;

import javax.crypto.CipherInputStream;

public class Ex01PolyObjectDemo {
	
	/*
	 Làm chức năng tính diện tích cho các hình
	 
	 Hình vuông: 
	 Square: calculateS
	 
	 Hình chữ nhật:
	 Rectangle: calcArea
	
	 Hình tròn: 
	 Circle: calcS
	
	 Square.calculateS(...)
	 Rectangle.calcArea(...)
	
	 Code không đồng bộ, nhớp
	 
	 --> Áp dụng tính chất thừa kế
	 
	 1. Tạo ra class cha tên là Shape
	    Tạo ra hàm tên là: calcS (chưa biết công thức cụ thể)
	 
	 2. Tạo các class con
	    Circle
	    Square
	    Rectangle
	    --> thừa kế từ Shape
	    --> override lại hàm calcS
	        điền nội dung, công thức của hàm calcS vào   
	 
	 */
	
	public static void main(String[] args) {
		
		// Shape#calcS
		// Square#calcS ... formula
		// Rectangle#calcS ... formula
		
		// Khởi tạo đối tượng (bình thường)
		Shape shape1 = new Shape();
		Square square1 = new Square();
		Rectangle rectangle1 = new Rectangle();
		
		shape1.calcS();
		square1.calcS();
		rectangle1.calcS();
		
		
		System.out.println("\n==================\n");
		
		
		// Shape#calcS
		// Square#calcS ... formula
		// Rectangle#calcS ... formula
		
		// Khởi tạo đối tượng (sử dụng đa hình trong đối tượng)
		
		// compile time: code tại thời điểm đang gõ code
		// runtime time: code được thực thi
		
		// s1
		// compile: Shape
		// runtime: Square
		
		Shape s1 = new Square();
		Shape s2 = new Rectangle();
		Shape s3 = s1;
		
		// s1 = s2;
		
		s1.calcS();
		s2.calcS();
		s3.calcS();
		
		// Square sq1 = (Square) new Shape();
		Square sq2 = (Square)s1;
		
		// sq1.setBackground();
		System.out.println("Line#86");
		sq2.setBackground();
		
		/*
		 * 
		 Câu hỏi 1: 
		   Biến KDL con trỏ đến đối tượng KDL cha được không, vì sao ?
		   
		   + Khi lấy biến KDL con gọi đến hàm riêng, tại thời điểm runtim ko thể tìm thấy
		     hàm riêng đó trong KDL cha
		     --> Lỗi ngay tại thời điểm gán đối tượng KDL cha cho biến KDL con
		   
		 Câu hỏi 2:
		   Tại sao không code trực tiếp biến KDL nào trỏ đến đối tượng KDL đó
		   mà phải dùng biến cha trỏ đến con ?
		 
		   + Dễ dàng ép KDL trong phạm vi cha con, anh em lúc compile
		   + Linh hoạt hơn trong
		     --> Tạo mảng: nhận danh sách các phần tử là chính nó hoặc KDL con
		     --> Truyền tham số qua hàm: tham số có thể nhận KDL chính nó hoặc KDL con
		 */
		
		// Lúc compile từng phần tử trong shapes --> Shape
		// In ra các đối tượng là hình vuông
		
		Shape[] shapes = {s1, s2, s3, square1, rectangle1};
		
		int squareCounter = 0;
		for (Shape shape: shapes) {
			// support from JDK 16
			if (shape instanceof Square rt) {
				squareCounter++;
				rt.setBackground();
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
		System.out.println("  " + shape);
		System.out.println("}\n");
	}
	
}