package demomain;

public class Ex02TestPublicClass {

	/*
	  1 file java có thể có một hoặc nhiều class 
	  nhưng bắt buộc: public class phải có tên trùng với tên file java
	 1 class chỉ có duy nhất 1 hàm main
	 */
	
	public static void main(String[] args) {
		System.out.println("Ex02TestPublicClass#main");
	}
	
}
class Ex02InternalClass {
	public static void main(String[] args) {
		System.out.println("Ex02InternalClass#Main");
	}
}