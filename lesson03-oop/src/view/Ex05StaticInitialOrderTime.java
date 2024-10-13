package view;

public class Ex05StaticInitialOrderTime {

	public static void main(String[] args) {

	}

	/*
	 static method, attribute sẽ đc khởi tạo cùng thời điểm loading class
	 non-static chi dc khởi tạo khi có Obj từ class đc tạo ra
	 */
	
	private static void s1() {
		s2();
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
