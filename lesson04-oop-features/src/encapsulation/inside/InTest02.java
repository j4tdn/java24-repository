package encapsulation.inside;

public class InTest02 {
	
	public static void main(String[] args) {
		// Chung package
		// ---> protected, public,
		InTest01.a2 = 10;
		InTest01.a3 = 20;
		new InTest01().a4 = 30;
	}
	
}
