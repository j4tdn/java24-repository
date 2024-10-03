package exercises;

import java.util.Random;

public class Ex04 {
	public static void main(String[] args) {
		Random random = new Random();
		int a = random.nextInt(10, 20);
		int b = random.nextInt(10, 20);
		int c = random.nextInt(10, 20);
		int d = random.nextInt(10, 20);
		long result  = factorial(a) + factorial(b) + factorial(c) + factorial(d);
		System.out.println(
				"Tong giai thua 4 so ngau nhien: \n" + a + "\n" + b + "\n" + c + "\n" + d + "\n" + "---> " + result);

	}

	private static long factorial(int number) {
		if (number == 0)
			return 1;
		return factorial(number - 1) * number;
	}
}