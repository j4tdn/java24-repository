package demomain;

import java.util.Random;

public class Ex01TestMainMethod {
	public static void main(String[] args) {
		System.out.println("Ex01TestMainMethod#main");
		main();
		new Ex01TestMainMethod().nsTest();
		int a = random(10);
		int b = random(10);
		System.out.println(sum(a,b));
				
	}

	public static void main() {
		System.out.println("Ex01TestMainMethod#anothermain");
	}

	private static void expose() {

	}

	public static void closure() {

	}

	public void nsTest() {
		System.out.println("SN-Test");
	}
	private static int random(int bound) {
		return new Random().nextInt(bound);
	}
	private static int sum(int a, int b) {
		return a + b;
	}
}
