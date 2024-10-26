package encapsulation.outside;

import encapsulation.inside.InTest01;

public class OutTest02 extends InTest01 {
	public static void main(String[] args) {
		// khác package, là lớp con
		// --> public, protected

		InTest01.a2 = 10;
		InTest01.a3 = 10;
//		new Intest01().a4 = 14;
	}
}
