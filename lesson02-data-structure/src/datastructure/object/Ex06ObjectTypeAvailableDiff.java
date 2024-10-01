package datastructure.object;

public class Ex06ObjectTypeAvailableDiff {
	public static void main(String[] args) {
		// Toán tử new
		
		// Gán trực tiếp
		
		/*
		 Giống nhau: 
		 + KD: đối tượng lưu ở HEAP, chuỗi
		 + ĐỐi tượng đưuọc tạo ra ở HEAP, đối tượng sẽ bất biến(Immutable)
		 ---> Vì thuộc tính là private và final
		 
		 
		 
		 Toán tử new
		 Lưu trữ: HEAP
		 Khi tạo ra 1 đối tượng (new) --> Luôn tọa ra ô nhớ mới
		 */
		String s1 = new String("Hello");
		String s2 = new String("Xinchao");
		String s3 = new String("Hello");
		
		System.out.printf(
				"S1[value=%s](hash=%s)\n"
			+	"S1[value=%s](hash=%s)\n"
			+	"S1[value=%s](hash=%s)\n",
			s1, System.identityHashCode(s1),
			s2, System.identityHashCode(s2),
			s3, System.identityHashCode(s3)
				);
		System.out.println("\n========================\n");
		
		// Gán trực tiếp giá trị của thuộc tính
		
		// Lưu trữ: HEAP - Constant Pool
		//Constant pool là một vùng nhớ dùng để lưu trữ các giá trị KHONG TRÙNG NHAU
		// CHỉ lưu trữ ác giá trị cảu những đối tượng được tạo ra
		// Từ KDL có sẵn của JAVA thông qua việc gán trực tiếp

	// Khi tạo 1 đối tượng mới --> Kiểm tra xem giá trị của đối tượng cần tạo đã tồn tại ở COnstant Pool chưa
		//+ Nếu chưa có --> tạo ra ô nhớ, gán địa chỉ cho biến
		//+ Nếu có rồi --> ko tạo ra, dùng ô nhớ đã có gán địa chỉ cho biến
		
			String s11 = "bye";//H1		
			String s22 = "tambiet";//H2	
			String s33 = "bye";//H1		
			String s44 = "bye";//H1		
			 s33 = "teo";//H3
			 System.out.printf(
						"S11[value=%s](hash=%s)\n"
					+	"S22[value=%s](hash=%s)\n"
					+	"S33[value=%s](hash=%s)\n"
					+	"S44[value=%s](hash=%s)\n",
					s11, System.identityHashCode(s11),
					s22, System.identityHashCode(s22),
					s33, System.identityHashCode(s33),
					s44, System.identityHashCode(s44)
						);			
		
		
		}

}
