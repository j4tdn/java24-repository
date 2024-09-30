package demomain;

import java.util.Random;

public class Ex01TestMainMethod {
	public static void main(String[] args) {
		System.out.println("Ex01TestMainMethod#main");
		main();
		closure();
		expose();
		
		new Ex01TestMainMethod().nsTest();
		
		System.out.println("--------------------\n");
		
		int a = random(10);
		int b = random(10);
		
		int sum = sum(a, b);
		System.out.println("sum --> " + sum);
	}
	
	private static int sum(int a, int b) {
		return a + b;
	}

	public static void main() {
		System.out.println("Ex01TestMainMethod#anotherMain");
	}
	
	private static void closure() {
		System.out.println("--> closure");
	}
	
	public static void expose() {
		System.out.println("--> expose");
	}
	
	public void nsTest() {
		System.out.println("NS-test");
	}
	
	private static int random(int bound) {
		return new Random().nextInt(bound);
	}
}
