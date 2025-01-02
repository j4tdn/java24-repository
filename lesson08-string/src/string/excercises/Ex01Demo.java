package string.excercises;

import java.util.Arrays;

public class Ex01Demo {
	
	public static void main(String[] args) {
		String s = "hello vietnam";
		String s1 = "- da Nang";
		String s2 = "- hue";
		// 1. Tính chiều dài của chuỗi s
		System.out.println("chieu dai cua chuoi la: " + s.length());
		
		// 2. Nối chuỗi s1 vào chuỗi s
		System.out.println("s + s1 --> " + s + s1);
				
		// 3. Lấy một ký tự tại vị trí index(3) trong chuỗi s
		System.out.println("Ki tu tai vi tri index(3): " + s.charAt(3));
				
		// 4. Duyệt từng kí tự, từ trong chuỗi

		String[] words = s.split("[^a-zA-Z]");
		System.out.println("Cac tu: " + Arrays.toString(words));
				
		// 5. Tìm vị trí(chỉ số) xuất hiện đầu tiên, cuối cùng của kí tự  “a” trong chuỗi s
		System.out.println("bat dau: " + s.indexOf('a'));
		System.out.println("ket thuc: " + s.lastIndexOf('a'));
		// 6. Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || kết thúc trong chuỗi s không.
		System.out.println("chuỗi s1 có phải là chuỗi bắt đầu s không: " + s1.startsWith(s2));
		System.out.println("chuỗi s1 có phải là chuỗikết thúc trong chuỗi s không: " + s1.startsWith(s2));
		// 7. Thay thế chuỗi s1 bằng chuỗi s2 trong  chuỗi s
		s.replace(s1, s2);
		
		System.out.println("thay the " + s);
		// 8. Loại bỏ các khoảng trắng thừa của chuỗi s3
		s.strip().replaceAll("[^a-zA-Z0-9]+", " ");
		System.out.println(s);
		// 9. Tạo chuỗi con của chuỗi s bắt đầu từ vị trí số 2
		System.out.println(s.substring(2));
		// 10. Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
		System.out.println(s1.contains(s2));
	}
	

}
