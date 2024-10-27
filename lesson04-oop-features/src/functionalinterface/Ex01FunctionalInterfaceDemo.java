package functionalinterface;

public class Ex01FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// tạo obj cho interface

		// c1 --> sd impl class
		IntTest t1 = new IntEvenTest();
		System.out.println("t1 --> " + t1.test(12));

		// c2 --> sd anonymous class
		IntTest t2 = new IntTest() {

			@Override
			public boolean test(int number) {
				return number % 5 == 0;
			}
		};
		System.out.println("t2 --> " + t2.test(13));

		// c3 --> sd anonymous function, override lại abstract method 
		//nhưng lúc override ko khai báo cái tên hàm, KDL trả về mà chỉ thêm ->
		IntTest t3 = (int number) -> {
			return number % 10 == 0;
		};
		System.out.println("t3 --> " + t3.test(100));
		/*
		 vs anonymous func, lúc override
		 + ko cần điền KDL truyền vào của tham số
		 + nếu sl tham số trong hàm override chỉ có 1 tham số --> bỏ luôn ()
		 + nếu phần body override chỉ có 1 dòng code --> bỏ luôn {}
		 	-> khi bỏ {} nếu hàm có return bỏ luôn từ khoá return
		 	
		 Đoạn code:	number -> number % 15 == 0;
		
		 tương tự với
		
		 new IntTest() {
			@Override
			public boolean test(int number) {
				return number % 5 == 0;
			}
		};
		
		anonymous = lambda expression
		 */
		
		IntTest t4 = number -> number % 15 == 0;
		System.out.println("t4 --> " + t4.test(20));
	}

}
