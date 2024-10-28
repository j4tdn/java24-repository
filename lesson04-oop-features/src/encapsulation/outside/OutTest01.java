package encapsulation.outside;

import encapsulation.inside.InTest01;

public class OutTest01 {
	public static void main(String[] args) {
		//ngoài package
		// --> public
		InTest01.a2 = 12;
//		InTest01.a3 = 14;
//		new InTest01().a4 = 14;
	}
}
