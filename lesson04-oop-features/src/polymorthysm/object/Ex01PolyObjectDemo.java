package polymorthysm.object;

public class Ex01PolyObjectDemo {
	/*
	Làm chức năng tính diện tích cho các hình
	
	Hình vuông:
	Square: calculateS
	
	Hình chữ nhật:
	Rectangle: calcArea
	
	Hình tròn:
	circle: calcS
	code không đồng bộ, nhớp
	
	=> áp dụng tính chất thừa kế
	1.Tạo 1 class cha tên Shape
	  Tạo 1 hàm tên là calc(chưa biết công thức cụ thể)
	2.Tạo các hàm con
	Circle
	Square
	Rectagle
	-->thừa kế từ Shape
	-->override lại hàm calcS
	-->Điền nội dung, công thức của hàm calcS vào
	*/
	public static void main(String[] args) {
		// Khởi tạo đối tượng (Bình thường)
		Shape shape1 = new Shape();
		Square square1 = new Square();
		Rectangle rectangle1 = new Rectangle();
		
		shape1.calcS();
		square1.calcS();
		rectangle1.calcS();
		
		// Khởi tạo đối tượng (sử dụng đa hình trong đối tượng)
		// s1
		// compile: Shape
		// runtime: Square
		
		Shape s1 = new Square();
		Shape s2 = new Rectangle();
		Shape s3 = s1;
		s1.calcS();
		s2.calcS();
		
		Shape[] shapes = {s1,s2,s3, square1, rectangle1};
		
		int squareCounter = 0;
		for (Shape shape:shapes) {
			if (shape instanceof Square rt) {
				squareCounter++;
			}
		}
		
		System.out.println("square -->" + squareCounter);
		
		
		
		/*
		 Câu hỏi 1: Biến KDL con trỏ đến đối tượng KDL cha được không?
		 	Vì sao?
		 + Khi lấy biến KDL con gọi đến hàm riêng, tại thời điển runtime ko thể tìm thấy hàn riêng đó trong KDL cha
		   --> Lỗi ngay tại thời điểm gán đối tượng KDL cha cho biến KDL con
		   
		 Câu hỏi 2:
		 	tại sao mình không code trực tiếp biến KDL nào thì trỏ đến KDL đối
		 	tượng đó mà phải dùng biến cha trỏ đến con
		 + Dễ dàng ép KDL trong phạm vi cha con, anh em lúc compile
		 + Linh hoạt hơn trong 
		   --> Tạo mảng: nhận danh sách các phần tử là chính ní hoặc KDL con
		   --> Truyền tham số qua hàm: tham số có thể nhận KDL chính nó hoặc KDL con
		 */
	}
}
