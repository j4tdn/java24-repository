package functionalinterface;

public class Ex01FuncInterfaceDemo {

	public static void main(String[] args) {
		// Tạo đối tượng cho interface

		// c1 ---> sử dụng implementation

		IntTest t1 = new IntEvenTest();
		System.out.println("t1 ---> " + t1.Test(12));

		// c2 ---> dùng anonymous class
		IntTest t2 = new IntTest() {

			@Override
			public boolean Test(int number) {
				return number % 5 == 0;
			}
		};

		System.out.println("t2 ----> " + t2.Test(12));
		
		// c3 ---> sử dụng anonymous function, override hàm trừu tượng nhưng
		// mà lúc override không khai báo tên hàm, KDL trả về mà chỉ thêm '->'
		IntTest t3 = (int number) -> {
			return number % 10 == 0;
		};
		System.out.println("t3 ---> " + t3.Test(12));
		System.out.println("t3 ---> " + t3.Test(100));
		
		/*
		 với anonymous function, lúc override
		 + Không cần điền KDL truyền vào của tham số
		 + Nếu số lượng tham số trong hàm override chỉ có 1 tham số ---> bỏ luôn ()
		 + Nếu phần body override chỉ có 1 dòng code ---> bỏ luôn {}, khi bỏ {} nếu
		 hàm có return thì bỏ luôn return
		 + Đổi tên biến tùy thích
		 
		 Đoạn code (number) -> number % 15 == 0;
		 tương tự với
		 
		 new IntTest() {

			@Override
			public boolean Test(int number) {
				return number % 5 == 0;
			}
		};
		 
		 anonymous function = lambda expression
		 */
		
		IntTest t4 = (number) -> number % 15 == 0;
		System.out.println("t4 ---> " + t4.Test(20));
		
	}

}
