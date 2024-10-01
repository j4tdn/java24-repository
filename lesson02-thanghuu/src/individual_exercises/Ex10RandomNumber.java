package individual_exercises;

import java.util.Random;
import java.util.Scanner;

public class Ex10RandomNumber {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner ip = new Scanner(System.in);
		int a, b, c, d, e;
		a = random.nextInt(20, 30);
		while (true) {
			b = random.nextInt(20, 30);
			if (b == a)
				continue;
			else
				break;
		}
		while (true) {
			c = random.nextInt(20, 30);
			if (c == a || c == b)
				continue;
			else
				break;
		}
		while (true) {
			d = random.nextInt(20, 30);
			if (d == a || d == b || d == c)
				continue;
			else
				break;
		}
		while (true) {
			e = random.nextInt(20, 30);
			if (e == a || e == b || e == c || e == d)
				continue;
			else
				break;
		}

		System.out.println("Random five number: \n" + a + "\t" + b + "\t" + c + "\t" + d + "\t" + e);

		ip.close();
	}
}
