package datastructure.object;

public class Ex06ObjectTypeAvailableDiff {

	public static void main(String[] args) {
		//Giống nhau 
		//+KDL đối tượng lưu ở HEAP, chuỗi
		//+Đối tượng được tạo ra ở HEAP, đối tượng sẽ bất biến (immutable)
		//-->vì thuộc tính là private và final
		
		//Toán tử new
		//lưu trữ: HEAP
		//Khi tạo ra 1 đối tượng(new)-->luôn tạo ra ô nhwos mới
		
		String s1=new String("hello");
		String s2=new String("xinchao");
		String s3=new String("hello");
		System.out.printf(
				"s1[value=%s](hash=%s)\n"
				+"s2[value=%s](hash=%s)\n"
				+"s3[value=%s](hash=%s)\n",
				s1, System.identityHashCode(s1),
				s2, System.identityHashCode(s2),
				s3, System.identityHashCode(s3)
				
				);
		System.out.println("\n=============\n");
		//Gán trực tiếp giá trị của thuộc tính
		//Lưu trữ:HEAP-CONSTANT pool
		//Constant pool là 1 cùng nhớ dùng để lưu trữ
		//các giá trị
		
		
		
		
		
		
		//Khi tạo 1 đối tượng mới-->Kiểm tra xem giá trị
		//Của đối tượng cần tạo đã tồn tại ở constant pool chưa
		//+nếu chưa có--> tạo ra ô nhớ, gán địa chỉ cho biến
		//+Nếu có rồi--> ko tạo ra, dùng ô nhớ đã có gắn địa chỉ cho biến
		String s11="bye";//H1
		String s22="btambiet";//H2
		String s33="bye";//H1
		String s44="bye";//H1
		s33="teo";//H3
			System.out.printf(
					"s11[value=%s](hash=%s)\n"
					+"s22[value=%s](hash=%s)\n"
					+"s33[value=%s](hash=%s)\n"
					+"s44[value=%s](hash=%s)\n"
					
					);
	}
	
}
