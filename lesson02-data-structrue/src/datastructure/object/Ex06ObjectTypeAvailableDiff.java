package datastructure.object;

public class Ex06ObjectTypeAvailableDiff {
	
	public static void main(String[] args) {
		//Same: 
		//+KDL obj luu o HEAP, chuoi
		//+Onj duoc tao ra o HEAP, obj se bat bien(immutable)
		//-> vi thuoc tinh la private va final
		
		
		//toan tu new
		//luu tru:HEAP
		//khi tao 1 obj(new) --> luon tao ra o nho moi
		String s1 = new String("Hello");
		String s2 = new String("Xin chao");
		String s3 = new String("Hello");
		System.out.printf(
				  "s1[value=%s] (hash=%s)\n"
				+ "s2[value=%s] (hash=%s)\n"
				+ "s3[value=%s] (hash=%s)\n",
				s1, System.identityHashCode(s1),
				s2, System.identityHashCode(s2),
				s3, System.identityHashCode(s3)
				);
		System.out.println("\n====================\n");
		//gan truc tiep val cua thuoc tinh
		
		//luu tru: HEAP - CONSTANT pool
		//constant pool la 1 vung nho dun gde luu tru cac val KHONG TRUNG NHAU
		//Chi luu val cua nhung obj duoc tao ra
		//tu KDL co san cua JAVA thong qua viec gan truc tiep
		
		//khi tao 1 obj moi -> check xem val cua obj can tao da exist o constant pool chua
		//+ neu chua -> tao ra o nho, gan dia chi cho bien
		//+ neu co -> ko tao ra, dung o nho da co gan dia chi cho bien
		String s11 = "bye"; //H1
		String s22 = "tam biet"; //H2
		String s33 = "bye"; //H1
		String s44 = "bye"; //H1
		s33 = "teo"; //H3
		System.out.printf(
				  "s11[value=%s] (hash=%s)\n"
				+ "s22[value=%s] (hash=%s)\n"
				+ "s33[value=%s] (hash=%s)\n"
				+ "s44[value=%s] (hash=%s)\n",
				s11, System.identityHashCode(s11),
				s22, System.identityHashCode(s22),
				s33, System.identityHashCode(s33),
				s44, System.identityHashCode(s44)
				);
		
		
	}
	
}
