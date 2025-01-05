package string.immutable;

public class Ex01StringImmutableDemo {
	
	public static void main(String[] args) {
		//String Object  --> HEAP
		String o1 = new String("Hello");
		String o2 = new String("Hello");
		String o3 = new String("Xin chao");
		
		System.out.println("\n==================\n");
		
		//String Literal --> HEAP  --> constant pool
		String l1 = "Hi";
		String l2 = "Hi";
		String l3 = "Chao xin";
		hashing("l1", l1);
		hashing("l2", l2);
		hashing("l3", l3);
		
		// 100% --> String Literal
		// Immutable --> Dù là String Object, Literal thì 1 ô nhớ
		// ra để lưu trữ giá trị của String 
	}
	
	private static void hashing(String text, String s) {
		System.out.println(text + " --> " + System.identityHashCode(s));
	}
	
}
