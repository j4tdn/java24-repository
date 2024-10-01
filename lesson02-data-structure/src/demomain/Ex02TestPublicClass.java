package demomain;

public class Ex02TestPublicClass {
	
	/*
	 1 file java có thể có 1 hoặc nhiều class
	 bắt buộc: public class phải có tên trùng với tên file jaca
	 
	 1 class chỉ có 1 hàm main
	 */
	
	public static void main(String[] args) {
		System.out.println("Ex02TestPublicClassmain");
		xuat();
	}
	public static void xuat() {
		System.out.println("Ko can import khi cung 1 package");
	}

}

 class Ex02InternalClass {
	public static void main(String[] args) {
		System.out.println("Ex02InternalClass#main");
	}
	

	
}
