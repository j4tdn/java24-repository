package string.immutable;

public class Ex01StringImmutableDemo {

	public static void main(String[] args) {
		// String Object
		String o1 = new String("Hello");
		String o2 = new String("Hello");
		String o3 = new String("vietnam");
		hashing("o1", o1);
		hashing("o2", o2);
		hashing("o3", o3);
		//String Literal
		String l1 = "hi";
		String l2 = "hi";
		String l3 = "lao";
		hashing("l1", l1);
		hashing("l2", l2);
		hashing("l3", l3);
		
		
	}
	
	private static void hashing(String text, String s) {
		System.out.println(text + " --> " + System.identityHashCode(s));
	}
}
