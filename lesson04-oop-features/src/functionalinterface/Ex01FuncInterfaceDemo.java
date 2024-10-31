package functionalinterface;

public class Ex01FuncInterfaceDemo {

	public static void main(String[] args) {
		// Tạo đối tượng cho interfacce

		// c1 --> sử dụng impl class
		IntTest t1 = new IntEventTest();
		System.out.println("t1 --> " + t1.test(12));

		// c2 --> sử dụng anonymous class
		IntTest t2 = new IntTest() {

			@Override
			public boolean test(int number) {
				return number % 5 == 0;
			}
		};
		System.out.println("t2 --> " + t2.test(12));

		// c3 --> sd anonymous function, override hàm trừu tượng nhưng
		// mà lúc override ko khai báo tên hàm, kdl trả về chỉ thêm ->
		IntTest t3 = (int number) -> {
			return number % 10 == 0;
		};
		System.out.println("t2 --> " + t3.test(12));
		System.out.println("t2 --> " + t3.test(100));
		
		/*
		 Vói anonymous function, lúc override
		 + ko cần điền KDL truyền vào của tham số
		 + nếu sl tham số trong hàm override chỉ có 1 tham số --> bỏ luôn ()
		 + nếu phần body override chỉ có 1 dòng code --> bỏ luôn {} nếu hàm có
		 return bỏ luôn từ khóa return
		 
		 Đoạn code number -> number % 15 == 0;
		 tương tự
		 
		 new IntTest() {

			@Override
			public boolean test(int number) {
				return number % 15 == 0;
			}
		 
		 anonymous function = lambda expression
		 
		 */
		IntTest t4 = number -> number % 15 == 0;
		System.out.println("t4 --> " + t4.test(20));
		
		
	}

}
