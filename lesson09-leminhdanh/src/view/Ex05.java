package view;

public class Ex05 {
	public static void main(String[] args) {
		int n = 12;
		for (int i = 0; i < 10; i++) {
			int temp = 0;
			do {
				temp = temp + (n % 10) * (n % 10);
				n /= 10;
			} while (n > 0);
			n = temp;
		}
		System.out.println(n);
	}

	private static boolean isHappy(int n) {
		for (int i = 0; i < 10; i++) {
			int temp = 0;
			do {
				temp = (n % 10) * (n % 10);
				n /= 10;
			} while (n > 0);
			n = temp;
		}
		return true;
	}
}
