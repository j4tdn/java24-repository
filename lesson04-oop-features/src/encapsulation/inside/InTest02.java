package encapsulation.inside;

public class InTest02 {

	public static void main(String[] args) {
		// Chung package
		// --> potected, , public
		
		InTest01.a2 = 10;
		InTest01.a3 = 12;
		
		new InTest01().a4 = 14;
	}
}