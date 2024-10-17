package view;

public class Ex05StaticInitialOrderTime {
	

	
	// static method, attribute sẽ được khởi tạo cùng thời điểm loading class
	// non-static chỉ được khởi tạo khi có đối tượng từ class được ttạo ra
	
	// non-static diễn ra trước static
	
	private static void s1() {
		s2();
		
		//ns1();
		
		Ex05StaticInitialOrderTime o1 = new Ex05StaticInitialOrderTime();
		o1.ns1();
		
		new Ex05StaticInitialOrderTime().ns2();
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
