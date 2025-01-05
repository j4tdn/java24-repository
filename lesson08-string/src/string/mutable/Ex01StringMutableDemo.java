package string.mutable;

public class Ex01StringMutableDemo {

	// String: Immutable
	// Vấn đề: Với những bài toán liên quan đến cập nhật giá trị
	//			 của chuỗi nhiều lần --> tốn kém ô nhớ
	// Vd: Cho danh sách gồm n phần từ
	// 		--> Viết hàm + các chuỗi trong danh sách lại với nhau
	// ["a","b","c","d","e"]

	// StringBuilder, StringBuffer: Mutable

	public static void main(String[] args) {
		String[] letters = { "a", "b", "c", "d", "e" };
		String immutable = "";
		for (String letter : letters) {
			immutable = immutable + letter;
			System.out.println("immutable hash: " + System.identityHashCode(immutable));

		}
		System.out.println("--> immutable result: " + immutable);
		
		// Phân biệt: StringBuilder vs StringBuffer --> Sau bài Thread
		System.out.println("\n=================================\n");
		StringBuilder mutable = new StringBuilder();
		for (String letter : letters) {
			mutable = mutable.append(letter);
			System.out.println("immutable hash: " + System.identityHashCode(immutable));

		}
		mutable.reverse().deleteCharAt(2).setCharAt(0, 'Ê');
		System.out.println("--> immutable result: " + mutable);
	}

}
