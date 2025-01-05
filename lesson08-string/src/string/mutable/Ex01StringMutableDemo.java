package string.mutable;

public class Ex01StringMutableDemo {

	// String: Immutable
	// Van de: Với những bài toán liên quan đến cập nhật giá trj
	// cảu chuỗi nhiều lần --> tốn vùng nhớ
	// VD: Cho danh sách gồm N phần tử là chuỗi
	//--> Viết hàm + các chuỗi trong danh sách lại với nhau
	//    ["a", "b", "c" ,"d", "e"]
	
	//StringBuilder, StringBuffer: Mutable
	
	public static void main(String[] args) {
		String[] letters = {"a", "b", "c", "d", "e"};
		String immuatble = "";
		for (String letter: letters) {
			immuatble = immuatble + letter;
		}
		
		System.out.println("\n====================\n");
		StringBuilder mutable = new StringBuilder();
		
	}
	
}
