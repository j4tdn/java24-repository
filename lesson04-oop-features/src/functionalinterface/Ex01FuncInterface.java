package functionalinterface;

public class Ex01FuncInterface {
	public static void main(String[] args) {
		//Tạo đối tượng cho interface
		
		//C1 --> sử dụng implemention class
		IntTest t1 = new IntEvenTest();
		System.out.println("t1 --> " + t1.test(12));
		
		//C2 --> sử dụng anonymous class
		IntTest t2 = new IntTest() {
			
			@Override
			public boolean test(int number) {
				return number % 5 == 0;
			}
		};
		System.out.println("t2 --> " + t2.test(12));
		
		//C3 -> sử dụng anonymous function, override hàm trừu tượng nhưng
		// mà lúc override không khai báo tên hàm, kdl trả vể mà chỉ thêm ->
		IntTest t3 = (int number) -> {
			return number % 10 == 0;
		};
		
		System.out.println("t3 --> " + t3.test(12));
		System.out.println("t3 --> " + t3.test(100));
		
		/*
		 với anonymous function; lúc override
		 + không cần điền KDL truyền vào của tham số
		 + nếu số lượng tham số trong hàm override chỉ có 1 tham số --> bỏ luôn ()
		 + Nếu phần body override chỉ có 1 dòng code --> bỏ luôn {}, khi bỏ {} nếu
		 hàm có return bỏ luôn từ khóa return
		 
		 Đoạn code number -> number % 15 == 0;
		 tương tư với 
		 
		 new IntTest() {
		 	@Override
		 	public boolean test(int number) {
				return number % 15 == 0;
		 	}
		 
		 anonymous function = lambda expression
		 */
		IntTest t4 = number -> number % 15 == 0;
		System.out.println("t4 --> "+ t4.test(30));
		
	}
}
