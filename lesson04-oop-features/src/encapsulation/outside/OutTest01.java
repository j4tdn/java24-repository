package encapsulation.outside;

import encapsulation.inside.InTest01;

public class OutTest01 {

	public static void main(String[] args) {
		// Khác package
		// --> public
		InTest01.a2 = 10;
		// InTest01.a3 = 12;
		// new InTest01().a4 = 14;
	}
}
