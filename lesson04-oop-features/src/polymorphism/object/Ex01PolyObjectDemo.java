package polymorphism.object;

public class Ex01PolyObjectDemo {
	/*
	 * Làm chức năng tính diện thích cho các hình
	 * 
	 * Hình vuông: Square: calculateS
	 * 
	 * Hình chữ nhật: Rectangle: calcArea
	 * 
	 * Hình tròn: Circle: calcS
	 * 
	 * Squares.calculateS(..) Rectangle.calcArea(..)
	 * 
	 * Code không động bộ
	 * 
	 * --> Áp dụng tính chất thừa kế
	 * 
	 * 1. Tạo ra class cha tên là Shape Tạo ra hàm tên là: calcS (chưa biết công
	 * thức cụ thể)
	 * 
	 * 2. Tạo các class con Circle Square Rectangle --> thừa kế từ Shape --> overide
	 * lại hàm calcS điền nội dung, công thức của hà calcS vào
	 * 
	 * 
	 */

	public static void main(String[] args) {

		// Khởi tạo đối tượng (bình thường)

		Shape shape1 = new Shape();
		Square square1 = new Square();
		Rectangle rectangle1 = new Rectangle();

		shape1.calcS();
		square1.calcS();
		rectangle1.calcS();

		System.out.println("\n====================\n");

		// Khởi tạo đối tượng (sử dụng đa hình trong đối tượng)

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
		
		// Lúc compile từng phần từ trong shapes -- > Shape
		// In ra các đối tượng là hình vuông
		
		Shape[] shapes = {s1, s2, s3, square1, rectangle1};
		
		int squareCounter = 0;
		for(Shape shape:shapes) {
		    // suport from JDK 16
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
		System.out.println(" " + shape);
		System.out.println("}\n");
	}

}
