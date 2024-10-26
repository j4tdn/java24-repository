package encapsulation.inside;

public class Intest02 {
	public static void main(String[] args) {
		// chung package
		// --> protected, ,public

		InTest01.a2 = 10;
		InTest01.a3 = 10;
		new Intest01().a4 = 14;
	}
}
