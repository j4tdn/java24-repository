package demomain;

public class Ex01TestMainMethod {

	public static void main(String[] args) {
		System.out.println("Ex01TestMainMethod#main");
		main();

		expose();
		closure();

		new Ex01TestMainMethod().nsTest();
	}

	/*
	 * goị đc bên ngoài hay ko = access modifier gọi được bên trong class hay ko thì
	 * là static or non-static
	 */
	
	public static void main() {
		System.out.println("Ex01TestMainMethod#anotherMain");
	}

	private static void closure() {
		System.out.println("Closure");
	}

	public static void expose() {
		System.out.println("Expose");
	}

	public void nsTest() {
		System.out.println("NS-Test");
	}
}
