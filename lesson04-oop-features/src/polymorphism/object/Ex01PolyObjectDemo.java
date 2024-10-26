package polymorphism.object;

import java.awt.desktop.PrintFilesEvent;

public class Ex01PolyObjectDemo {

	public static void main(String[] args) {

		// Khởi tạo đối tượng (Bình thường)
		Shape shape1 = new Shape();
		Square square1 = new Square();
		Rectangle rectangle1 = new Rectangle();

		System.out.println("\n----------------------------------------\n");

		// Khởi tạo đối tương (Sử dụng đa hình trong đối tượng)

		// s1
		// compile: Shape
		// runtime: Square
		Shape s1 = new Square();
		Shape s2 = new Rectangle();
		Shape s3 = s1;

		s1.CalcS();
		s2.CalcS();
		s3.CalcS();

		/*
		 * 
		 * Câu hỏi 1: Biến KDL con trở đến đối tượng KDL cha hay không ? Vì sao ?
		 * 
		 * + Khi lấy biến KDL con gọi đến hàm riêng, tại thời điểm run-time ko thể tìm
		 * thấy hàm tiêng đó trong KDL cha
		 * 
		 * --> Lỗi ngay thời diểm gán đối tượng KDL cha cho biến KDL con
		 * 
		 * Câu hỏi 2: Tại sao mình không code trực tiếp biến KDL trỏ đến đối tượng KDL
		 * đó mà phải sử dụng biến cha trỏ đến con ?
		 * 
		 * + Dễ dàng ép KDL trong pham vi cha con, anh em lúc compile + Linh hoạt hơn
		 * trong ---> Tạo mảng: nhận danh sách các phần tử là chính nó hoặc KDL con --->
		 * Truyền tham số qua hàm: tham số có thể nhận KDL chính nó hoặc KDL con
		 * 
		 */
		Shape[] shapes = { s1, s2, s3, square1, rectangle1 };

		// Lúc compile ra từng phần tử trong shapes --> Shape
		// In ra các đối tượng là hình vuông

		int squareCounter = 0;
		for (Shape shape : shapes) {
			// Support from jdk 16
			if (shape instanceof Square rt) {
				squareCounter++;
				rt.setBackGround();
			}
		}
		System.out.println("SquareConuter ---> " + squareCounter);
		
		printf(s1);
		printf(s2);
		printf(square1);
		printf(rectangle1);
	}
	private static void printf(Shape shape) {
		System.out.println("shape ---> {");
		System.out.println("  " + shape);
		System.out.println("}\n");
	}

}
