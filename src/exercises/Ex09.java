package exercises;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("You want find the second prime number ?");
		int num = sc.nextInt();
		int N = 2;
		int count = 0;
		while (true) {
			if (isPrime(N)) {
				count++;
				if (count == num) {
					System.out.println(count+"th prime number: " + N);
					break;
				}
			}
			N++;
		}
		sc.close();
		
	}
	private static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
