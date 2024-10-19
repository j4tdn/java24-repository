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
		
		s1.calcS();
		s2.calcS();
		s3.calcS();
		
		Square sq1 = (Square) new Shape();
		sq1.setBackground();
		
		/*
		 Câu hỏi 1: 
		   Biến KDL con trỏ đến đối tượng KDL cha được không ?
		   Vì sao ?
		   
		 Câu hỏi 2:
		   Tại sao không code trực tiếp biến KDL nào trỏ đến đối tượng KDL đó
		   mà phải dùng biến cha trỏ đến con ?  
		 */
	}
	
}
