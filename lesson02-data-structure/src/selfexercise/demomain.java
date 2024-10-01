package selfexercise;

import java.util.Random;

/*/
 * 1. In ra Ex01TestMainMethod#main trong hàm main
 * 2. In ra Ex01TestMainMethod#anothermain nhưng trong hàm main chỉ dùng gọi hàm không dùng system println
 * 3. In ra --> closure  nhưng trong hàm main chỉ dùng gọi hàm không dùng system println
 * 4. Cũng in ra --> closure từ hàm thuộc class
 * 5. In ra --> expose tương tự 3
 * 6. In ra --> expose tương tự 4
 * 7. In ra NS-Test từ đối tượng mới thuộc class
 * 8. Cho 2 số a,b random, in ra kết quả tổng 2 số đó
 */

public class demomain {
	
	public static void main(String[] args) {
		System.out.println("Ex01TestMainMethod#main");
		anothermain();
		closure();
		demomain.closure();
		expose();
		demomain.expose();
		new demomain().nsTest();
		int a = random(10);
		int b = random(20);
		System.out.println(a);
		System.out.println(b);
		int sum= sum(a,b);
		System.out.println(sum);
	}
	
	private static void anothermain() {
		System.out.println("Ex01TestMainMethod#anothrman");
	}
	private static void closure() {
		System.out.println("--> closure");
	}
	private static void expose() {
		System.out.println("--> expose");
	}
	private void nsTest() {
		System.out.println("NS-Test");
	}
	private static int random(int bound) {
		return new Random().nextInt(bound);
	}
	private static int sum(int a, int b) {
		return a + b;
	}
}
