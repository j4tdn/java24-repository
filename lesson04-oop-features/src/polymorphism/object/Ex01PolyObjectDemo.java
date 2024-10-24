package polymorphism.object;

public class Ex01PolyObjectDemo {
	public static void main(String[] args) {
		
		//khoi tao doi tuong binh thuong
		Shape shape1 = new Shape();
		Square square1 = new Square();
		Rectangle rectangle1 = new Rectangle();
		
		shape1.calcS();
		square1.calcS();
		rectangle1.calcS();
		
		System.out.println("\n==================");
		
		Shape s1 = new Square();
		Shape s2 = new Rectangle();
		s1.calcS();
		s2.calcS();
		
		/*
		 Câu hỏi 1: Biến KDL con trỏ đến đói tượng KDL cha được không, vì sao?
		 	+ khi lấy biến KDL con gọi đến hàm riêng, tại thời điểm runtime hàm riêng đó trong KDL cha
		 		--> Lỗi ngay tại thời điểm gán đối tượng KDL cha cho KDL con
		 		
		 Câu hỏi 2: Tại sao không code trược tiếp biến KDL nào trỏ đến đối tượng đó mà phỉa dùng biến cha trỏ đến con?
		 	+ Dễ dàng ép KDL trong phạm vi cha con, anh em luc compile
		 	+ LInh hoạt hơn trong
		 		--> Tạo mảng: Nhận ds các phần tử là chính nó hoặc KDL con
		 		--> truyền tham số qua hàm: tham số có thể nhận KDL chính nó hoặc KDL con 
		 		
		 */
		Shape[] shapes = {s1, s2, square1, rectangle1};
		
		int squareCounter = 0;
		for(Shape shape: shapes) {
			if (shape instanceof Square rt) {
				squareCounter++;
				rt.setBackgroud();
			}
		}
		System.out.println("square counter  -->  " + squareCounter);
		
		printf(s1);
		printf(s2);
		printf(square1);
		printf(rectangle1);
	}
	
	private static void printf(Shape shape) {
		System.out.println("shape --> "+ shape);
	}
}
