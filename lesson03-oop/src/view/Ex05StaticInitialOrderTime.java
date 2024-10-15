package view;

public class Ex05StaticInitialOrderTime {
	public static void main(String[] args) {
		
	}
	
	//static method, attribute sẽ được khởi tạo cùng thời điểm
	// loading class
	
	//non-static chỉ được khởi tạo khi có đối tượng từ class được khởi tạo
	private static void s1() {
		s2();
//		ns1();
	}
	private static void s2() {
		
	}
	
	private void ns1() {
		ns2();
		s1();
	}
	private void ns2() {}
}
