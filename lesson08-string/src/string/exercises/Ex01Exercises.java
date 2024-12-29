package string.exercises;

public class Ex01Exercises {

	public static void main(String[] args) {
		String s = "hello vietnam";
		String s1 = "- danang";
		String s2 = "- hue";
		
		// 1. Tính chiều dài của chuỗi s
		System.out.println("Chiều dài của chuỗi s: " + s.length());

		// 2. Nối chuỗi s1 vào chuỗi s
		System.out.println("Nối chuỗi s1 vào chuỗi s: " + (s + s1));
		
		// 3. Lấy một ký tự tại vị trí index(3) trong chuỗi s
		System.out.println("Lấy một ký tự tại vị trí index(3) trong chuỗi s: " + s.charAt(3));
		
		// 4. Duyệt từng kí tự, từ trong chuỗi
		for (int i = 0; i < s.length(); i++) {
			System.out.println("index " + i + ": " + s.charAt(i));
		}
		
		String[] sS = s.split("\\s+");
		for (String letter : sS) {
			System.out.println(letter);
		}
		
		// 5. Tìm vị trí(chỉ số) xuất hiện đầu tiên, cuối cùng của kí tự “a” trong chuỗi s
//		s.indexOf("a);
		s.lastIndexOf("a");
		// 6. Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || kết thúc trong chuỗi s không.
		s.startsWith(""); // s.endsWith("");
		// 7. Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
		//s.replace(0, 0);
		// 8. Loại bỏ các khoảng trắng thừa của chuỗi s3
		//trim
		// 9. Tạo chuỗi con của chuỗi s bắt
		//subString
		// 10. Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
		//contains
	}

}
