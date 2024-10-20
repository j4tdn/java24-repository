package polymorphism.object;

public class Ex01PolyObjectDemo {

	public static void main(String[] args) {
		//calcS
		
		// khởi tạo obj (bth)
		Shape shape1 = new Shape();
		Square square1 = new Square();
		Rectange rectange1 = new Rectange();
		
		shape1.calcS();
		square1.calcS();
		rectange1.calcS();
		
		System.out.println("\n===================\n");
		
		// khởi tạo obj (sd poly trog obj)
		
		//s1 lúc compile: Shape
		// 	     runtime: Square
		
		// compile time: code tại thời điểm đag gõ code
		// runtime: code dc execute
		Shape s1 = new Square();
		Shape s2 = new Rectange();
		Shape s3 = s1;
		
		s1.calcS();
		s2.calcS();
		s3.calcS();
		
		/*
		 Ques 1: biến kdl con trỏ đến obj kdl cha đc k ?
		 + khi lấy biến KDL con gọi đến hàm riêng, tại thời điểm runtime ko thể find hàm riêng đó trong KDL cha
		  --> lỗi ngay tại thời điểm gán obj KDL cha cho biến obj KDL con
		 
		 Ques 2: tại sao ko code trực tiếp biến kiểu kdl nào thì trỏ đến obj kdl đó
		 mà phải dùng biến cha trỏ đến con ?
		 
		 + dễ dàng ép KDL trong range cha con, anh em lúc compile
		 + linh hoạt hơn trong:
		 	--> tạo mảng: nhận danh sách các phần tử là chính nó hoặc KDL con
		 	--> truyền tham số qua hàm: tham số có thể nhận KDL chính nó hoặc KDL con
		 */
		
		Shape[] shapes = {s1, s2, s3, square1, rectange1};
		
		// lúc compike từng phần trong shapes --> Shape
		// in ra các obj là squares
		
		int squareCnt = 0;
		
		for (Shape shape : shapes) {
			//sp from JDK 16
			if (shape instanceof Square rt) {
				squareCnt++;
				rt.setBackground();
			}
		}
		
		System.out.println("square count --> " + squareCnt);
		printf(s1);
		printf(s2);
		printf(square1);
		printf(rectange1);
	}

	private static void printf(Shape shape) {
		System.out.println("shape --> {");
		System.out.println("  " + shape);
		System.out.println("}\n");
	}
}
