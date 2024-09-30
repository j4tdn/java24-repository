package datastructure.object;

public class Ex06ObjectTypeAvailableDiff {
	
	public static void main(String[] args) {
		// Giống nhau
		// + KDL đối tượng lưu ở HEAP, chuỗi
		// + Đối tượng được tạo ra ở HEAP, đối tượng sẽ bất biến (immutable)
		// --> vì thuộc tính là private và final
		
		// Toán tử new
		// Lưu trữ: HEAP
		// Khi tạo 1 đối tượng (new) --> luôn tạo ra ô nhớ mới
		String s1 = new String("hello");
		String s2 = new String("xin chào");
		String s3 = new String("hello");
		System.out.printf(
				"s1[value=%s](hash=%s)\n"
			  + "s2[value=%s](hash=%s)\n"
			  + "s3[value=%s](hash=%s)\n",
			  s1, System.identityHashCode(s1),
			  s2, System.identityHashCode(s2),
			  s3, System.identityHashCode(s3)
		);
		
		System.out.println("\n=============\n");
		
		// Gán trực tiếp giá trị của thuộc tính
		
		// Lưu trữ: HEAP - CONSTANT pool
		// Constant pool là 1 vùng nhớ dùng để lữu trữ các giá trị KHÔNG trùng nhau
		// Chỉ lưu giá trị của những đối tượng được tạo ra từ KDL có sẵn của JAVA thông qua việc gán trực tiếp
		
		// Khi tạo 1 đối tượng mới --> Kiểm tra xem giá trị của đối tượng cần tạo đã tồn tại ở constant pool chưa
		// + Nếu chưa có --> tạo ra ô nhớ, gán địa chỉ cho biến
		// + Nếu có rồi --> ko tạo ra, dùng ô nhớ đã có gán địa chỉ cho biến
		String s11 = "bye"; // H1
		String s22 = "tạm biệt"; //H2
		String s33 = "bye"; // H1
		String s44 = "bye"; // H1
		s33 = "tèo"; // H3
		System.out.printf(
				"s11[value=%s](hash=%s)\n"
			  + "s22[value=%s](hash=%s)\n"
			  + "s33[value=%s](hash=%s)\n"
			  + "s44[value=%s](hash=%s)\n",
			  s11, System.identityHashCode(s11),
			  s22, System.identityHashCode(s22),
			  s33, System.identityHashCode(s33),
			  s44, System.identityHashCode(s44)
		);
	}
}
