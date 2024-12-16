package immutable;
public class Ex01ImmutableDemo {
	
	public static void main(String[] args) {
		Store s1 = new Store(1, "Store 101", "Đà Nẵng");
		System.out.println("s1 --> " + s1);
	
		// Tạo ra 1 class, có các tt là private
		// ko hỗ trợ setter
		
		// --> private/non-private ...
		// --> accessible: boolean
		// reflection(trong các tv hay dùng hơn)
	}
	
}