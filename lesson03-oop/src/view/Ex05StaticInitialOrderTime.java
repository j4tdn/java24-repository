package view;

public class Ex05StaticInitialOrderTime {
	public static void main(String[] args) {

	}
	//static method , attribute  sẽ được khởi tạo cùng thời điểm loading class
	//non static  chỉ khỏi tạo khi co đối tượng từ class tạo ra
	
	private static void s1() {
		s2();
		ns1();
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
