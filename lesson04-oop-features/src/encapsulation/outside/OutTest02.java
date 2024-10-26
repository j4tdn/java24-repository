package encapsulation.outside;

import encapsulation.inside.InTest01;

public class OutTest02 extends InTest01 {
	public static void main(String[] args) {
		// Khac package, nhung la lop con
		// ---> public, protected
		InTest01.a2 = 10;
		InTest01.a3 = 20;
		// new InTest01().a4 = 30;
	}
}
