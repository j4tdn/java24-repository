package functionalinterface;

public class Ex01FunctionalInterfaceDemo {
	public static void main(String[] args) {
		// cách tạo đối tượng cho 1 interface

		// 1. sử dụng implementation class
		IntTest t1 = new IntEvenTest();
		System.out.println("t1 -->" + t1.test(12));
		// 2. sử dụng anonymous class
		IntTest t2 = new IntTest() {

			@Override
			public boolean test(int number) {
				return number % 5 == 0;
			}
		};
		System.out.println("t2 --> " + t2.test(12));

		// 3. sử dụng anonymous function, override hàm trừu tượng nhưng
		// lúc override ko khăi báo tên hàm, kdl trả về mà chỉ thêm ->
		IntTest t3 = (int number) -> {
			return number % 10 == 0;
		};
		System.out.println("t3 -->" + t3.test(12));
		System.out.println("t3 -->" + t3.test(100));
		/*
		 * với anonymous function, lúc override + ko cần điền KDL truyền vào của tham số
		 * + nếu sl tham số trong hàm chi có 1 tham số --> bỏ luôn () + nếu phần body
		 * override chỉ có 1 dòng code --> bỏ luôn {} Khi bỏ {} nếu hàm có return thì bỏ
		 * luôn return
		 * 
		 * Đoạn code number -> number % 15 == 0; tương tự với: new IntTest() {
		 * 
		 * @Override public boolean test(int number) { return number % 15 == 0; }
		 * 
		 * anonymous function = lambda expression
		 */
		IntTest t4 = number -> number % 15 == 0;
		System.out.println("t4 -->" + t4.test(20));
	}

}
