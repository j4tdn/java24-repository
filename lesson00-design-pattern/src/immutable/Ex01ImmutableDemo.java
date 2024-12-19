package immutable;

public class Ex01ImmutableDemo {

	public static void main(String[] args) {
		Store s1 = new Store(1, "Store 101", "Da Nang");
		System.out.println("s1 --> " + s1);
		
		// Tạo ra 1 class, có các tt là private
		// Không hỗ trọ setter
		// --> private / non-private ...
		// --> accessible: boolean
		// reflection(trong các tv hay dùng hơn)
	}
}
