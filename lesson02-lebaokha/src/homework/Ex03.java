package homework;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);

		System.out.print("Nhập N là số nguyên dương: ");
		int number = ip.nextInt();
		if (number == 1) {
			System.out.println("1! = 1");
		}

		else {
			System.out.print(number + "!" + " = ");
			int factorial = 1;

			for (int i = number; i >= 1; i--) {
				factorial = factorial * i;
				if (i > 1) {
					System.out.printf("%d.", i);
				} else {
					System.out.printf("%d = ", i);
				}
			}

			System.out.println(factorial);
		}
		
		ip.close();

	}
}
