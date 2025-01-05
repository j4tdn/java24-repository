package string.excercises;

import java.util.Arrays;

public class Ex01Demo {

	public static void main(String[] args) {
		String s = "hello vietnama";
		String s1 = "- danang";
		String s2 = "- hue";
		String s3 = "   welcome  @#$%^  to java24 @#$%^$%^&*  class  ";

		// 1. Tính chiều dài của chuỗi s		
		System.out.println("Chiều dài của chuỗi s = " + s.length());
		
		// 2. Nối chuỗi s1 vào chuỗi s
		s = s.concat(s1);
		System.out.println("s1 nối s --> " + s);
		
		// 3. Lấy một kí tự tại vị trí index(3) trong chuỗi s
		System.out.println("Vị trí index(3) trong chuỗi s --> " + s.charAt(3));
		
		// 4. Duyệt từng kí tự, từ trong chuỗi
		String[] words = s.split("[^a-zA-Z]+");
		System.out.println("Các từ: " + Arrays.toString(words));
		
		// 5. Tìm vị trí(chỉ số) xuất hiện đầu tiên, cuối cùng của kí tự  “a” trong chuỗi s
		;
		System.out.println("index đầu tiên của kí tự a = " + s.indexOf('a'));
		System.out.println("index cuối cùng của kí tự a = " + s.lastIndexOf('a'));
		
		// 6. Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || kết thúc trong chuỗi s không.
		// startsWith, endsWith
		
		// 7. Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
		System.out.println("replace --> " + s.replace(s1, s2));
		
		// 8. Loại bỏ các khoảng trắng thừa của chuỗi s3
		s3 = s3.strip().replaceAll("[^a-zA-Z0-9]+", " ");
		System.out.println("s3|||" + s3 + "|||");
		
		// 9. Tạo chuỗi con của chuỗi s bắt đầu từ vị trí số 2
		// --> subString(2)
		// --> subString(a, b)
		
		// 10. Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
		// contains
	}

}
