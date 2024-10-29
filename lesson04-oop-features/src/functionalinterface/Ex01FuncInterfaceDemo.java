package functionalinterface;

public class Ex01FuncInterfaceDemo {
	
	public static void main(String[] args) {
		// tạo đối tượng cho interface
		
		//c1 --> sử dụng impll class
		IntTest t1 = new 	IntEvenTest();
		System.out.println("t1 -->" + t1.test(12));
		//c2 --> sử dụng anonymous class
		IntTest t2 = new 	IntTest() {
			@Override
			public boolean test(int number) {
				return number % 5 == 0;
			}
			
		};
		System.out.println("t2 -->" + t2.test(12));
		
		
		// c3 --> sử dụng anonymous function, override hàm trừu tượng nhưng lúc override không khai báo trên hàm .KDL trả về mà chỉ thêm "->"
		IntTest t3 = (int number) -> {
			return number % 10 == 0;
		};
		System.out.println("t3 -->" + t3.test(12));
		System.out.println("t3 -->" + t3.test(100));
		
		 /*
		  *với anonymous function  
		  */
		IntTest t4 =  number -> number % 15 == 0;
		;
		System.out.println("t4 -->" + t4.test(20));
	}

}
