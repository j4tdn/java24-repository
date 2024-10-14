package view;

public class Ex05StaticInitialOrderTime {
	public static void main(String[] args) {
		
	}
	// static method, attribute sẽ được khởi tạo cùng thời điểm loading class
	// nen-static chỉ được khở tạo khi có đối tượng từ class được tạo ra
	
	private static void s1() {
		new Ex05StaticInitialOrderTime();
	}
	private static void s2() {
		
	}
	private void ns1() {
		ns2();
		s1();
	}
	private void ns2() {
		
	}
}
