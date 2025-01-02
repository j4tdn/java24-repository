package string.mutable;

public class Ex01StringMutableDemo {
	// String: Immutable
	// Vấn đề
	
	public static void main(String[] args) {
		String[] letters = {"a", "b", "c", "d", "e"};
		String immutable = "";
		for(String letter:letters) {
			immutable += letter;
			System.out.println("immutable hash: " + System.identityHashCode(immutable));
		}
		System.out.println("-----> immutable result: " + immutable);
	
		StringBuilder mutable = new StringBuilder();
		for (String letter:letters) {
			mutable.append(letter);
			System.out.println("mutable hash " + System.identityHashCode(mutable));
		}
		System.out.println("--> mutable result: " + mutable);
		mutable.reverse().deleteCharAt(2).setCharAt(0, 'w');
		System.out.println("---> mutable result: " + mutable);
	}
}
