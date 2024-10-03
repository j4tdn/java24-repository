package demomain;

public class Ex02TestPublicClass {

	/*
	 * Một file java có thể có nhiều hoặc nhiều class
	Bắt buộc: Public class phải có tên trùng với tên file java
	1 class chỉ có 1 hàm main
	 */
		public static void main(String[] args) {
			System.out.println("Ex02TestPublicClass#main");
		}
}

class Ex02InternalClass {
	public static void main(String[] args) {
		System.out.println("Ex02InternalClass#main");
	}
}
