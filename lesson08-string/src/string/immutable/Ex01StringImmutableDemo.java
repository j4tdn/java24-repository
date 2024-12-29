package string.immutable;

public class Ex01StringImmutableDemo {

	public static void main(String[] args) {
		// String Object --> HEAP
		String o1 = new String("hello");
		String o2 = new String("hello");
		String o3 = new String("vietnam");
		hashing("o1", o1);
		hashing("o2", o2);
		hashing("o3", o3);

		System.out.println("\n==================\n");

		// String Literal --> HEAP --> constant pool
		String l1 = "h1";
		String l2 = "h1";
		String l3 = "h2";
		String l4 = "h1";

		l2 = "hello";

		hashing("l1", l1);
		hashing("l2", l2);
		hashing("l3", l3);
		hashing("l4", l4);
		// 100% --> String Literal
		// Immutable --> Dù là String Object, Literal thì 1 ô nhớ được tạo
		// ra để lưu trữ giá trị của String thì ko bao giờ cập nhật được
	}

	private static void hashing(String text, String s) {
		System.out.println(text + " --> " + System.identityHashCode(s));
	}

}
