package string.mutable;

public class Ex01MutableDemo {

	public static void main(String[] args) {
		
		//String: Immutable
		//Van de: Vs ~ bai toan lquan den cap nhap gia tri cua chuoi nhieu lan` 
		// --> ton o nho 
		// VD: Cho 1 ds gom N phan tu --> Viet ham + cac chuoi trong ds vs nhau 
		// ["a", "b", "c", "d", "e"]
		
		//StringBuilder, StringBuffer: Mutable 
		
		String[] letters = {"a", "b", "c", "d", "e"};
		String immutable = "";
		for (String letter: letters) {
			immutable = immutable + letter;
			System.out.println("immutable hash: "+ System.identityHashCode(immutable));
			
		
		}
		System.out.println("--> immutable result: "+immutable);
		
		StringBuilder mutable = new StringBuilder();
		for (String letter: letters) {
			mutable.append(letter);
			System.out.println("immutable hash: "+ System.identityHashCode(immutable));
			
		
		}
		System.out.println("--> immutable result: "+mutable);
		
		
	
	
	}
}
