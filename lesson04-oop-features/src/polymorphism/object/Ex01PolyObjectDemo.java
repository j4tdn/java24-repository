package polymorphism.object;

public class Ex01PolyObjectDemo {

	public static void main(String[] args) {
		
		//khởi tạo đối tượng (bình thường)
		Shape shape1 = new Shape();
		Square square1 = new Square();
		Rectangle rectangle1 = new Rectangle();
		
		System.out.println("\n=============================\n");
		
		//khởi tạo đối tượng (sử dụng đa hình trong đối tượng)

		Shape s1 = new Square();
		Shape s2 = new Rectangle();
		Shape s3 = s1;
		
		s1.clacS();
		s2.clacS();
		s3.clacS();
		
		/*
		 câu 1 : biến kdl con trỏ đến đối tượng kdl cha được không?
		 
		 câu 2 : tại sao không code trực tiếp biến kdl nào trỏ đến đối tượng kdl mà phải
		          dùng đến biến cha trỏ  đến biến con?
		 */
		
	}
}
