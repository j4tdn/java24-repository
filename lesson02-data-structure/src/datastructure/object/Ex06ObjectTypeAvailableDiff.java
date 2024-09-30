package datastructure.object;

public class Ex06ObjectTypeAvailableDiff {
	public static void main(String[] args) {
		String s1 = new String("heloo");
		String s2 = new String("xin chao");
		String s3 = new String("heloo");
		System.out.printf(
				"s1[value=%s](hash%s)\ns2[value=%s](hash%s)\ns3[value=%s](hash%s)\n",
				s1, System.identityHashCode(s1),
				s2, System.identityHashCode(s2),
				s3, System.identityHashCode(s3)
				);
		System.out.println("\n===================\n");
		//gán trực tiếp giá trị của thuộc tính 
		
		//Lưu trự: HEAP
		//constant pôl là 1 vùng nhớ dùng để lưu trự các giá trị không trùng nhau 
		// chỉ lưu giá trị của đối tưỡng được tạo ra 
		// từ KDL có sặn của JAVA thông qua việc gán trực tiếp 
		
		// Khi tạo 1 đối tượng mới --> kiểm tra xem giá trị 
		// của dối tượng cần tạo đã tồn tại ở constant pool chưa 
		// + nếu chưa có  --> tạo ra ô nhớ , gán địa chỉ cho biến 
		// + nếu có rồi 
		
		String s11 ="bye";
		String s22 ="tam biet";
		String s33 ="bye";
		String s44 ="bye";
		s33 = "teo";
		System.out.printf(
				"s11[value=%s](hash=%s)\ns22[value=%s](hash=%s)\ns33[value=%s](hash=%s)\ns[v44alue=%s](hash=%s)\n",
				s11, System.identityHashCode(s11),
				s22, System.identityHashCode(s22),
				s33, System.identityHashCode(s33),
				s44, System.identityHashCode(s44)
		);
		
		
	}
}
