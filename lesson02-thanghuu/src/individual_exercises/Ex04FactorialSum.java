package individual_exercises;

import java.util.Random;

public class Ex04FactorialSum {
	private static long factorial(int number) {
		long result = 1;
		for (int i = 1; i <= number; i++) {
			result *= i;
		}
		return result;
	}

	public static void main(String[] args) {
		Random random = new Random();

		int a = random.nextInt(10, 20);
		int b = random.nextInt(10, 20);
		int c = random.nextInt(10, 20);
		int d = random.nextInt(10, 20);

		long result = factorial(a) + factorial(b) + factorial(c) + factorial(d);
		System.out.println(
				"Tong giai thua 4 so ngau nhien: \n" + a + "\n" + b + "\n" + c + "\n" + d + "\n" + "---> " + result);

	}
}
