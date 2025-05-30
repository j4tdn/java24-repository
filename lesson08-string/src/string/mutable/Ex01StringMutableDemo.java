package string.mutable;

public class Ex01StringMutableDemo {
	
	// String: Immutable
	// Vấn đề: Với những bài toàn liên quan đến cập nhật giá trị
	//         của chuỗi nhiều lần --> tốn vùng nhớ
	// VD: Cho danh sách gồm N phần tử là chuỗi 
	//     --> Viết hàm + các chuỗi trong danh sách lại với nhau
	//     ["a", "b", "c", "d", "e"]
	
	// StringBuilder, StringBuffer: Mutable
	
	public static void main(String[] args) {
		String[] letters = {"a", "b", "c", "d", "e"};
		String immutable = "";
		for (String letter: letters) {
			immutable = immutable + letter;
			System.out.println("immutable hash: " + System.identityHashCode(immutable));
		}
		System.out.println("--> immutable result: " + immutable);
		
		// Phân biệt: StringBuilder vs StringBuffer --> Sau bài Thread
		System.out.println("\n=====================\n");
		StringBuilder mutable = new StringBuilder();
		for (String letter: letters) {
			mutable.append(letter);
			System.out.println("mutable hash: " + System.identityHashCode(mutable));
		}
		mutable.reverse().deleteCharAt(2).setCharAt(0, 'w');
		System.out.println("--> mutable result: " + mutable);
	}
	
}
