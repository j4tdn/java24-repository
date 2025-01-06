package string.exercises;

import java.util.Arrays;

public class Ex01Demo {
	
	public static void main(String[] args) {
		
		String s = "hello    vietnam";
		String s1 = "-danang";
		String s2 = "-hue";
		
		// 1. Tính chiều dài của chuỗi s --> length
		
		// 2. Nối chuỗi s1 vào chuỗi s --> +, concat, append
		s = new StringBuilder(s).append(s1).toString();
		System.out.println("s --> " + s);
		
		// 3. Lấy một ký tự tại vị trí index(3) trong chuỗi s
		// --> charAt
		
		// 4. Duyệt từng kí tự, từ trong chuỗi
		// --> split("^[a-zA-Z]+")
		String[] words = s.split("[^a-zA-Z]+");
		System.out.println("Các từ: " + Arrays.toString(words));
		
		// 5. Tìm vị trí(chỉ số) xuất hiện đầu tiên, cuối cùng của kí tự  “a” trong chuỗi s
		// indexOf, lastIndexOf
		System.out.println("Bắt đầu: " + s.indexOf("a"));
		System.out.println("Kết thúc: " + s.lastIndexOf("a"));
		
		// 6. Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || kết thúc trong chuỗi s không.
		// startsWith, endsWidth
		
		// 7. Thay thế chuỗi s1 bằng chuỗi s2 trong  chuỗi s
		// replace
		s = s.replace(s1, s2);
		System.out.println("Thay thế: " + s);
		
		// 8. Loại bỏ các khoảng trắng thừa của chuỗi s3
		// s3.replaceAll(" ", "")
		String s3 = "  welcome #$%^&  t$%^o    java24  #$%^&  class   ";
		s3 = s3.strip().replaceAll("[^a-zA-Z0-9]+", " ");
		
		System.out.println("\s\sx1x2x3  ".trim());
		System.out.println("\s\sx1x2x3  ".strip()); // vn
		
		// s3 = s3.trim();
		// s3 = s3.strip(); // stripLeading, stripTraiing()
		System.out.println("s3|||" + s3 + "||||");
		
		// 9. Tạo chuỗi con của chuỗi s bắt đầu từ vị trí số 2
		// --> subString(2)
		// --> subString(a, b)
		
		// 10. Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
		// contains
	}
	
}