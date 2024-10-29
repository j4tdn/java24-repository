package functionalinterface;

import javax.sql.rowset.serial.SQLOutputImpl;

public class Ex01FuncInterfaceDemo {
	public static void main(String[] args) {
		
	
	// Tạo đối tượng cho interface
	
	//c1 --> sử dụng impl tịa class
	InTest t1 = new InOddTest();
	
	//c2 --> sử dụng anonymous class
	InTest t2 = new InTest() {
		
		@Override
		public boolean test(int number) {
			return number % 5 == 0;
		}
	};
	
	//c2 --> sử dụng anonymous function, override hàm trừu tượng nhưng
	// mà lúc override không khai báo tên hàm, kdl trả về mà chỉ thêm ->
	InTest t3 =  (number) -> {
		return number % 10 == 0;
	};
	System.out.println("t3 --> " + t3.test(12));
	System.out.println("t3 --> " + t3.test(1100));
	
	/*
	 Với anonymous function, lúc override 
	 + ko cần khai báo kdl truyền vào của tham số
	 + nếu số lượng tham số trong hàm override mà chỉ có 1 tham số --> bỏ luôn()
	 + nếu phần body override chỉ có 1 dòng code --> bỏ lippn {}, khi bỏ {} nếu hàm 
	 có return thì bỏ luôn từ khóa return
	 
	 Đoạn code number ->  number % 15 == 0;
	 tương tự với
	 new InTest() {
		
		@Override
		public boolean test(int number) {
			return number % 15 == 0;
		}
	};
	
	anonymous function = lamda expression
	 */
	
	InTest t4 = number ->  number % 15 == 0;
	
	System.out.println("t4 --> " + t3.test(30));
}
}
