package string.exercices;

public class Ex01Demo {
	public static void main(String[] args) {
		String s = "hello vietnam";
		String s1 = "- danang";
		String s2 = "- hue";
		// 1. Tính chiều dài của chuỗi s
		int length = s.length();
		System.out.println("chiều dài của chuỗi s là : " + length);
		// 2. Nối chuỗi s1 vào chuỗi s
		new StringBuilder(s).append(s1).toString();
		String noi = s + s1;
		System.out.println(noi);
		// 3. Lấy một ký tự tại vị trí index(3) trong chuỗi s
		char thu = s.charAt(3);
		System.out.println(thu);
		// 4. Duyệt từng kí tự, từ trong chuỗi
		for(int i = 0 ; i< length;i++) {
			System.out.println("Ký tự thứ " + i + ": " + s.charAt(i));
		}
		// 5. Tìm vị trí(chỉ số) xuất hiện đầu tiên, cuối cùng của kí tự  “a” trong chuỗi s
		System.out.println("Bắt đầu: " + s.indexOf("a"));
		System.out.println("Kết thúc: " + s.lastIndexOf("a"));
		// 6. Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || kết thúc trong chuỗi s không.
		//startWith endWith
		// 7. Thay thế chuỗi s1 bằng chuỗi s2 trong  chuỗi s
		s= s.replace(s1, s2);
		System.out.println("thay thế : " + s);
		// 8. Loại bỏ các khoảng trắng thừa của chuỗi s3
		String s3 = "welcome   to java24  class";
		s3 = s3.strip().replaceAll("[^a-zA-Z0-9]+", " ");
		System.out.println("s3|||" + s3 + "||||");
		// 9. Tạo chuỗi con của chuỗi s bắt
		
		// 10. Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
		
	}

}
