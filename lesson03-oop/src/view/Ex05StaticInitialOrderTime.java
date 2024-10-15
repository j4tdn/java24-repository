package view;

public class Ex05StaticInitialOrderTime {
	public static void main(String[] args) {
	}
	// static method, attribute se duoc khoi tao cung thoi diem loading class
	// non-static chi duoc khoi tao khi co doi tuong thi class duoc tao ra

	private static void s1() {
		s2();
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
