package polymorphism.object;

public class Ex01PolyObjectDemo {
	/*
    Làm chức năng tính diện tích cho các hình
	
	Hình vuông:
	Square    : calculateS
	
	Hình chữ nhật:
	Rectangle    : calcArea
	
	Hình tròn:
	Circle   : calcS
	
	Square.calCulateS(...)
	Rectangle.calcArea(...)
	
	code Không đồng bộ, nhớp
	
	--> Áp dụng tính chất kế thừa
	
	1. tạo ra class cha trên Shape
	   Tạo ra hàm tên là : calcS (Chưa biết công thức cụ thể)
    
    	  
    2. taọ các class con
       Circle
       Square
       Rectangle
       --> thừa kế từ Shape
       --> override lại hàm calcS
           điền nội dung, công thức của hàm calS vào	  
	 */
	
	
	
	public static void main(String[] args) {
		
		// khởi tạo đối tượng (Bình thường)
		Shape shape1 = new Shape();
		Square square1 = new Square();
		Rectangle rectangle1 = new Rectangle();
		
		shape1.calsS();
		square1.calsS();
		rectangle1.calsS();
		
		
		System.out.println("\n==========================\n");
		
		// khỏi tạo đối tượng (sử dụng đa hình trong đối tượng)
		
		
		
		// compile time: code tại thời điểm đang gõ code
		
		// runtime time: code được thực thi
		
		// s1
		// compile: Shape
		// runtime: Square
		
		
		Shape s1 = new Square();
		Shape s2 = new Rectangle();
		Shape s3 = s1;
		

		
		s1.calsS();
		s2.calsS();
		s3.calsS();
		
		
		
		Square sq1 = (Square) new Shape();
		Square sq2 = (Square)s1;
		sq1.setBackground();
		sq2.setBackground();
		
		/*
		 câu hỏi 1 : biến KDL cha trỏ đến đối tượng KDL cha được không? vì sao
		 Không
		 + khi lấy biến KDL con gọi đến hàm riêng, tại thời điểm rumtim không thể tìm thấy hàm riêng đó trong KDL cha
		 --> lỗi ngay tại thời điểm gán đối tượng KDL cha cho đến KDL con
		 
		 
		 
		 Câu hỏi 2 : tại sao mình không code trực tiếp cái biến KDL nào trỏ đến KDL đó mà phải dùng biến cha trỏ đến con ?
		 + dễ dàng ép KDL trong phạm vi cha con, anh em lúc compile
		 + linh hoạt hơn trong
		  --> Tạo mảng : nhận danh sách các phần tử là chính nó hoặc KDL con
		  --> truyền tham số qua hàm : tham số có thể nhận KDL chính nó hoặc KDL con
		 */
		// lúc compile từng phần tử trong shapes --> shape
		// in ra các đối tượng là hình vuông
		Shape[] shapes = {s1,s2,s3, square1,rectangle1};
		
		int squareCounter = 0;
		for(Shape shape: shapes ) {
			if(shape instanceof Square x1) {
				squareCounter++;
//				Square x1 = ((Square) shape);
				x1.setBackground();
			}
		}
		System.out.println("square counter --> " + squareCounter);
		
		printf(s1);
		printf(s2);
		printf(shape1);
		printf(rectangle1);
	}
	
	private static void printf(Shape shape) {
		System.out.println("shape  -> {\n");
		System.out.println(" " + shape);
		System.out.println("}\n");
	}
}
