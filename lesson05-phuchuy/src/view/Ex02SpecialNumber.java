package view;

public class Ex02SpecialNumber {
	public static void main(String[] args) {

		System.out.println(isSpecialNumber(6, 2));

	}

	private static boolean isSpecialNumber(int number, int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
			if (sum == number) {
				return true;
			}
		}
		return false;
	}

}
