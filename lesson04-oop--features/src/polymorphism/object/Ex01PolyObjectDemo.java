package polymorphism.object;

public class Ex01PolyObjectDemo {
	/*
	 Làm chức năng tính diện tích cho các hình
	
	 Hình vuông: 
	 Square: calculateS
	
	 Hình chữ nhật:
	 Rectangle: calArea
	
	 Hình tròn:
	 Circle: calS
	
	 Square.calculateS(...)
	 Rectangle.calArea(...)
	 
	 Code không đồng bộ, nhớp
	 
	 --> Áp dụng tính chất thừa kế
	 
	 1. Tạo ra class cha tên là Shape
	 	Tạo ra hàm tên là: calS (chưa biết công thúc cụ thể)
	 	
	 2. Tạo các class con 
	 Circle
	 Square
	 Rectangle
	 --> thừa kế từ Shape
	 --> Override lại hàm calS
	 	 Điển nội dung, công thức của hàm calcS vào
	 	 
	 	
	 */
	
	
	public static void main(String[] args) {

		// Khởi tạo đối tượng (bình thường)
		Shape shape1 = new Shape();
		Square square1 = new Square();
		Rectangle rectangle1 = new Rectangle();

		shape1.calcS();
		square1.calcS();
		rectangle1.calcS();

		System.out.println("\n=========================\n");

		// Khởi tạo đối tượng (Đa hình trong đối tượng)

		// s1
		// compile: Shape : code tại thời điểm đang gõ
		// runtime: Square : code được thực thi

		Shape s1 = new Square();
		Shape s2 = new Rectangle();
		Shape s3 = s1;

		s1.calcS();
		s2.calcS();
		s3.calcS();
		
		/*
		  Câu hỏi 1: Biến KDL con trỏ đến đối tượng cha được không ? 
		  Vì sao ?
		  
		  + Khi lấy biến KDL con gọi đến hàm riêng, tại thời điểm runtime ko thể tìm thấy hàm riêng đó trong KDL cha
		  --> Lỗi ngay tại thời điểm gán đối tượng KDL cha cho biến KDL con
		  
		  
		  Câu hỏi 2: 
		  Tại sao không  code trực tiếp biến KDL nào thì trỏ đến KDL đó mà phải
		  dùng biến cha trỏ đến biến con ?
		  
		f
		  
		 */
		
		Shape[] shapes = {s1, s2, s3, square1, rectangle1};
		
		int squareCounter = 0;
		for (Shape shape:shapes) {
			// support from JDK 16
			if(shape instanceof Square rt) {
				squareCounter++;
				rt.setBackground();
			}
			System.out.println("squareCounter --> "+squareCounter);
			
			
			printf(s1);			
			printf(s2);			
			printf(square1);			
			printf(rectangle1);			
		}
	}
		
		private static void printf(Shape shape) {
			System.out.println("shape --> {");
			System.out.println(" " + shape);
			System.out.println("}\n" );
			
		}

	

}

