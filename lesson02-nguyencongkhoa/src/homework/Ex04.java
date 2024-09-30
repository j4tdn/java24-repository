package homework;

import java.util.Random;

public class Ex04 {

	public static int factorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}

	public static void main(String[] args) {
		Random rand = new Random();
		int number = 0;
		int sum = 0;
		
		for (int i = 1; i <= 4; i++) {
			number = rand.nextInt(10, 21);
			System.out.println("Số ngẫu nhiên thứ " + i + " = " + number);
			
			while (number > 0) {
				sum += factorial(number % 10);
				number /= 10;
			}

		}
		System.out.println("\nTổng 4 số ngẫu nhiên trong khoảng [10, 20] = " + sum);
	}

}
