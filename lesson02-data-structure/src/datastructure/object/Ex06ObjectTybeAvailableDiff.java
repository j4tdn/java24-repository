package datastructure.object;

public class Ex06ObjectTybeAvailableDiff {
	public static void main(String[] args) {
		// giống nhau:
		// + KDL đối tượng lưu ở HEAP, chuỗi
		// + đối tượng được tạo ra ở HEAP , đối tượng sẽ bất biến(immutable)
		//  -> vì thuộc tính là private và final
		
		
		// toán tử new
		// lưu trữ :HEAP
		//khi tạo 1 đối tượng(new) --> luôn tạo ra ô nhớ mới
		String s1 = new String("hello");
		String s2 = new String("xin chao");
		String s3 = new String("hello");
		System.out.printf(
				"s1[Value=%s](hash=%s)\n"
				+"s2[Value=%s](hash=%s)\n"
				+"s3[Value=%s](hash=%s)\n",
				s1,System.identityHashCode(s1),
				s2,System.identityHashCode(s2),
				s3,System.identityHashCode(s3)
				);
		System.out.println("================================");
		
		
		String s11 = "bye"; //h1
		String s22 = "tam biet";//h2
		String s33 = "bye";//h1
		String s44 = "bye";//h1
		s33 = "teo";//h3

		System.out.printf(
				"s11[Value=%s](hash=%s)\n"
				+"s22[Value=%s](hash=%s)\n"
				+"s33[Value=%s](hash=%s)\n"
				+"s44[Value=%s](hash=%s)\n",
				s11,System.identityHashCode(s11),
				s22,System.identityHashCode(s22),
				s33,System.identityHashCode(s33),
				s44,System.identityHashCode(s44)
				);
		
	}

}