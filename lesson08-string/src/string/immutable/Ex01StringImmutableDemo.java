package string.immutable;

public class Ex01StringImmutableDemo {
	
	public static void main(String[] args) {
		// String Objects --> HEAP
		String o1 = new String("Hello");
		String o2 = new String("Hello");
		String o3 = new String("VietNam");
		hashing("o1", o1);
		hashing("o2", o2);
		hashing("o3", o3);
		
		System.out.println("\n=======================\n");
		
		// String Literal --> HEAP --> Constant pool
		
		String l1 = "Hi";
		String l2 = "Hi";
		String l3 = "Laos";
		String l4 = "Hi";
		// nhớ toán tử "=" set lại giá trị ở stack
		l2 = "Hello";
		
		hashing("l1", l1);
		hashing("l2", l2);
		hashing("l3", l3);
		hashing("l4", l4);
		
		// 100% sử dụng --> String Literal
		// Immutable --> Dù là String Object, Literal thì 1 ô nhớ
		// được tạo ra để lưu trữ giá trị thì không bao giờ cập nhật được
	}
	
	private static void hashing(String text, String value) {
		System.out.println(text + "-->" +System.identityHashCode(value));
	}
}
