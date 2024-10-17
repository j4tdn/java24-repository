package view;

public class Ex05StaticInitalOderTime {

	public static void main(String[] args) {

	}

	// static method, attribute sẽ đc khởi tạo cùng thời điểm loading class
	// non static chỉ đc khởi tạo khi có đối tượng từ class đc tạo ra

	private static void s1() {
		s2();
		// ns1()
		Ex05StaticInitalOderTime o1 = new Ex05StaticInitalOderTime();
		o1.ns1();

		new Ex05StaticInitalOderTime().ns2();
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
