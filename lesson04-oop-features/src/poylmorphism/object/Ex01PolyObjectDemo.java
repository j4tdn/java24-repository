package poylmorphism.object;

public class Ex01PolyObjectDemo {

	/*
	 * Làm chức năng tính diện tích cho các hình
	 * 
	 * Hình vuông: Square: calculateS
	 * 
	 * Hình chữ nhật: Rectangle: calcArea
	 * 
	 * Hình tròn: Circle: calcS
	 * 
	 * --> code ko đồng bộ, nhớp --> áp dụng tính chất thừa kế 1. Tạo ra class cha
	 * là Shape tạo ra 1 hàm tên là: calcS(chưa biết công thức cụ thể)
	 * 
	 * 2. Tạo các class con Circle Square Rectangle -> thừa kế từ shape -> override
	 * lại hàm calcS điền nộ dung ct của hàm caclS vào
	 */
	public static void main(String[] args) {
		// calcS

		// Khởi tạo đối tượng (bth)
		Shape shape1 = new Shape();
		Square square1 = new Square();
		Rectangle rectangle1 = new Rectangle();

		shape1.calcS();
		square1.calcS();
		rectangle1.calcS();
		System.out.println("\n==========================\n");
		// Khởi tạo đối tượng (Sử dụng đa hình trong đối tượng)
		// s1
		// compile(khai báo): Shape
		// runtime(chạy): Square
		Shape s1 = new Square();
		Shape s2 = new Rectangle();
		Shape s3 = s1;
		s1.calcS();
		s2.calcS();
		s3.calcS();

		/*
		 * Câu hỏi 1: Biến KDL con trỏ đến 1 đối tượng cha được không ? Vì sao ? + Khi
		 * lấy biến KDL con gọi đến hàm riêng, tại thời điểm runtime ko thể tìm thấy hàm
		 * riêng đó trong kDL cha ---> Lỗi ngay tại thời điểm gán đối tượng KDL cha cho
		 * biến KDL
		 * 
		 * Câu hỏi 2: Tại sao mình không code trực tiếp cái biến KDL nào thì trỏ đối
		 * tượng KDL đó mà phải dùng biến cha trỏ đến đối tượng con ? + Dễ dàng ép KDL
		 * trong phạm vi cha con, anh em lúc compile + Linh hoạt hơn trong --> Tạo mảng:
		 * nhận danh sách các phần tử là chính nó hoặc KDL con --> Truyền tham số qua
		 * hàm: tham số có thể nhận KDL chính nó hoặc KDL con
		 */
		Shape[] shapes = { s1, s2, s3, square1, rectangle1 };
		int count = 0;
		for (Shape shape : shapes) {
			if (shape instanceof Square rt) {
				count++;
				rt.setBackGround();
			}
		}
		System.out.println("Square COunter--> " + count);
		printf(s1);
		printf(s2);
		printf(square1);
		printf(rectangle1);
	}

	private static void printf(Shape shape) {
		System.out.println("shape--> {");
		System.out.println(" " + shape);
		System.out.println("}\n");
	}

}
