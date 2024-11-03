package datastructure.object;

public class Ex06ObjectTypeAvailableDiff {

	public static void main(String[] args) {
		// Giống nhau: KDL đối tượng lưu ở HEAP
		// Đối tượng dc tạo ra ở HEAP --> sẽ bất biến (immutable)
		// ---> vì thuọc tính là private và final

		// immutable: bất biến tại HEAP
		// final: bất biến tại STACK

		// toán tử new
		// Lưu trữ: HEAP
		// khi new 1 đt: --> luôn tạo ra ô nhớ mới
		String s1 = new String("hello");
		String s2 = new String("xinchao");
		String s3 = new String("hello");
		System.out.printf("s1 [value=%s](hashcode=%s)\n s2 [value=%s](hashcode=%s)\n s3 [value=%s](hashcode=%s)\n ", s1,
				System.identityHashCode(s1), s2, System.identityHashCode(s2), s3, System.identityHashCode(s3));
		// gán trực tiếp giá trị của thuộc tính
		// lưu trữ: HEAP - CONSTANT pool
		// CONSTANT pool là 1 vùng nhớ dùng để lưu trữ
		// các giá trị k trùng nhau.
		// Chỉ lưu giá trị của những KDL có sẵn của JAVA thông qua gán trực tiếp
		// Khi tạo đt mới: --> kiểm tra giá trị của đt mới đã tồn tại ở CONSTANT pool
		// chưa
		// + Nếu chưa có --> tạo ra, gán địa chỉ cho biến
		// + Có rồi ---> ko tạo, dùng ô nhớ đã có để gán địa chỉ cho biến
		String s11 = "bye"; // h1
		String s22 = "tambuiet"; // h2
		String s33 = "bye"; // h1
		// đang gán dữ liệu trực tiếp, nó sẽ kiểm tra xem có ô nhớ nào trùng không rồi
		// tạo ô nhớ
		System.out.printf("s11 [value=%s](hashcode=%s)\n s22 [value=%s](hashcode=%s)\n s33 [value=%s](hashcode=%s)\n ",
				s11, System.identityHashCode(s11), s22, System.identityHashCode(s22), s33,
				System.identityHashCode(s33));
	}

}
