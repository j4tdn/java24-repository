package string.mutable;

public class Ex01StringMutableDemo {
	
	// String: Immutable
	// Vấn đề: Với những bài toán liên quán đến cập nhật giá trị của chuỗi nhiều lần
	// --> tốn vùng nhớ
	// VD: Cho danh sách gồm N phần từ --> Viết hàm + các chuỗi trong dánh sách lại với nhau
	// ["a", "b", "c", "d", "e"]
	
	// StringBuilder, String Buffer: Mutable
	
	public static void main(String[] args) {
		String[] letters =  {"a", "b", "c", "d", "e"};
		String immutable = "";
		for (String letter : letters) {
			immutable = immutable + letter;
			System.out.println("immutable hash: " + System.identityHashCode(immutable));
		}
		System.out.println("--> immmutable result: " + immutable);
		
		// Phân biệt: StringBuilder vs SringBuffer --> Sau bài Thread
		
		System.out.println("\n===============\n");
		
		StringBuilder mutable = new StringBuilder();
		for (String letter : letters) {
			mutable.append(letter);
			System.out.println("mmutable hash: " + System.identityHashCode(mutable));
		}
		
		mutable.reverse().deleteCharAt(2).setCharAt(0, 'w');
		System.out.println("--> mmmutable result: " + mutable);
		
		
		
	}

}
