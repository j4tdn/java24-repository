package excercises;

import java.util.Random;

public class Bai4 {
	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(10, 21);
		int b = rd.nextInt(10, 21);
		int c = rd.nextInt(10, 21);
		int d = rd.nextInt(10, 21);

		long sum = Bai3.factorial(a) + Bai3.factorial(b) + Bai3.factorial(c) + Bai3.factorial(d);
		System.out.println("Sum: " + sum);

	}

}
