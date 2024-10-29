package functionalinterface;

public class Ex01FuncInterfaceDemo {
	public static void main(String[] args) {
		
		IntTest t1 = new IntEventTest();
		System.out.println("t1 -->" + t1.test(12));
		
		IntTest t2 = new IntTest() {
			@Override
			public boolean test(int number) {
				return number % 5 == 0;
			}
		};
		System.out.println("t1 -->" + t2.test(12));
		
		
		// c3 --> su dung anonymous function, override hàm trừu tượng nhưng
		// mà lúc override không khai báo tên hàm
		IntTest t3 = (int number) -> {
			return number % 10 ==0;
		};
		System.out.println("t1 -->" + t3.test(12));
		
		IntTest t4 = number -> number % 15 == 0;
		System.out.println("t1 -->" + t4.test(12));
		
	}

}
