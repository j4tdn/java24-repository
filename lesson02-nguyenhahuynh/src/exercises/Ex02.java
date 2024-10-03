package exercises;

public class Ex02 {

	public static void main(String[] args) {
		int n = checkN.input();
		if (n == 1) {
			System.out.println(false);
		}
		while (n != 1) {
			if (n % 2 != 0) {
				System.out.println(false);
				break;
			}
			n = n / 2;
			if (n == 1) {
				System.out.println(true);
			}
		}
	}
}
