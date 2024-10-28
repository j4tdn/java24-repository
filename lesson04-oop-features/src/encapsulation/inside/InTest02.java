package encapsulation.inside;

public class InTest02 {

	public static void main(String[] args) {

		// chung package
		// --> protected, public
		InTest01.a2 = 10;
		InTest01.a3 = 12;
		new InTest01().a4 = 14;

	}

}
