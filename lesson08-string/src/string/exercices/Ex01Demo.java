package string.exercices;

public class Ex01Demo {
	public static void main(String[] args) {
		String s = "hello vietnam";
		String s1 = "- danang";
		String s2 = "- hue";
		
		// 1. Tính chiều dài của chuỗi s
		int length = s.length();
		System.out.println(length);
		// 2. Nối chuỗi s1 vào chuỗi s
		//---> +, append, concat
		// 3. Lấy một ký tự tại vị trí index(3) trong chuỗi s
		//--> charAt
		// 4. Duyệt từng ký tự, từ trong chuỗi
			String[] words = s.split("^[a-zA-Z]+");
			System.out.println("chuoi: " + words);
		// 5. Tìm vị trí(chỉ số) xuất hiện đầu tiên, cuối cùng của ký tự
			System.out.println("Bat dau: " + s.indexOf("a"));
			System.out.println("Bat dau: " + s.lastIndexOf("a"));
			
		// 6. Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || kết thúc trong chuỗi s không.
			//startWidth, endWidth
			
		// 7. Thay thế chuỗi s1 bằng chuỗi s2 trong  chuỗi s
			s = s.replace(s1, s2);
			System.out.println("Thay the: " + s);
		// 8. Loại bỏ các khoảng trắng thừa của chuỗi s3
			String s3 = "Hello    java   24 class";
			s3 = s3.strip().replaceAll("[^a-zA-Z0-9]+", " ");
			System.out.println("s3|||" + s3 + "|||");
		// 9. Tạo chuỗi con của chuỗi s bắt
		// --> subString(2)
		// --> subString(a, b)
		// 10. Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
		// --> contains
	}
}
