package datastructure.object;

public class Ex06ObjectTypeAvailableDiff {

	public static void main(String[] args) {
			//  Giống nhau:
			// + KDL đối tượng lưu ở HEAP, dạng chuỗi
			// + Đối tượng được tạo ra ở HEAP, đối tượng sẽ bất biến (Immutable)
			// --> Vì thuộc tính là private và final
		
			// Toán tử new
			// Lưu truwxL HEAP
			// Khi tạo 1 đối tượng (new) --> luôn tạo ra ô nhớ mới
			String s1 = new String("hello");
			String s2 = new String("xin chao");
			String s3 = new String("hello");
			System.out.printf(
					"s1[value=%s] (hash=%s)\n"
				+	"s2[value=%s] (hash=%s)\n"
				+	"s3[value=%s] (hash=%s)\n",
				s1, System.identityHashCode(s1),
				s2, System.identityHashCode(s2),
				s3, System.identityHashCode(s3)
					);
			
			System.out.println("\n======================\n");
			
			// Gán trực tiếp giá trị của thuộc tính
			
			// Lưu trữ: HEAP - CONSTANT pool
			// Constant pool là 1 vùng nhớ dung để lưu trữ các
			// giá trị KHÔNG TRÙNG NHAU
			// Chỉ lưu giá trị của những đối tượng được tạo ra
			// từ KDL có sẵn của JAVA thông qua việc gán trực tiếp
			
			// Khi tạo 1 đối tượng mới ----> Kiểm tra xem giá trị
			// của đối tượng cần tạo đã tồn tại ở constant pool hay chưa
			// + Nễu chưa có --> tạo ra ô nhớ, gán địa chỉ cho biến
			// + Nếu có rồi --> không tạo ra ô nhớ, dùng ô nhớ đã có gán địa chỉ chp biến
			String s11 = "bye";
			String s22 = "tam biet";
			String s33 = "bye";
			String s44 = "bye";
			s33 = "teo";
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
