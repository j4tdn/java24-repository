package exercises;

import java.util.Arrays;

public class Ex01Demo {

	public static void main(String[] args) {
		String s = "hello vietnam";
		String s1 = "- danang";
		String s2 = "- hue";
		

		// 1. Tính chiều dài của chuỗi s
		System.out.println("length s --> "+ s.length());
		
		System.out.println("\n==========================\n");
		
		// 2. Nối chuỗi s1 vào chuỗi s
		System.out.println("s + s1 --> "+ (s + s1));
		s= new StringBuilder(s).append(s1).toString();
		System.out.println("s --> "+s );
		System.out.println("\n==========================\n");
		
		// 3. Lấy một ký tự tại vị trí index(3) trong chuỗi s
		
		System.out.println("Ki tu index(3) --> "+ s.charAt(3));
		System.out.println("\n==========================\n");
		
		
		// 4. Duyệt từng kí tự, từ trong chuỗi
		char letter; 
		for (int i = 0; i < s.length(); i++) {
			letter = s.charAt(i);
			System.out.println("letter("+i+")--> " + letter);
			
		}
		String[] words =  s.split("[^a-zA-Z]+");
		System.out.println("Cac tu: "+ Arrays.toString(words));
		
		System.out.println("\n==========================\n");
		
		// 5. Tìm vị trí(chỉ số) xuất hiện đầu tiên, cuối cùng của kí tự  “a” trong chuỗi s
		System.out.println("vi tri dau tien cua a --> "+ s.indexOf("a"));
		System.out.println("vi tri cuoi cung cua a --> "+ s.lastIndexOf("a"));
		
		
		System.out.println("\n==========================\n");
		
		// 6. Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || kết thúc trong chuỗi s không.
		System.out.println("co phai bat dau trong s --> "+ s.startsWith(s1));
		System.out.println("co phai ket thuc trong s --> "+ s.endsWith(s1));
		System.out.println("\n==========================\n");
		// 7. Thay thế chuỗi s1 bằng chuỗi s2 trong  chuỗi s
		
		System.out.println("thay the --> "+ s.replace(s1, s2));
		System.out.println("\n==========================\n");
		// 8. Loại bỏ các khoảng trắng thừa của chuỗi s3
		String s3 = "        hello      viet    nam ";
		System.out.println("Khoang trang thua --> "+ s3.trim().replaceAll("\\s+", " "));
		System.out.println("\n==========================\n");
		
		// 9. Tạo chuỗi con của chuỗi s bắt đầu vị trí số 2 
		String s4 = s.substring(2);
		System.out.println("Tao chuoi con cua s --> "+ s4);
		System.out.println("\n==========================\n");
		
		 
		// 10. Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
		System.out.println("Chuoi s2 co ton tai trong s1 --> "+ s1.contains(s2));
		System.out.println("\n==========================\n");
		
	}
	
	
}
