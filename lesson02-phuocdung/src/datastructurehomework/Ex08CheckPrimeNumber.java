package datastructurehomework;

import java.util.Scanner;

public class Ex08CheckPrimeNumber {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n;

		while (true) {
			int count = 1;
			try {
				System.out.println("Hãy nhập một số nguyên dương bất kì");
				n = Integer.parseInt(ip.nextLine());
			} catch (Exception e) {
				count++;
				if (count <= 5) {
					System.out.println("Không hợp lệ, hãy nhập lại");					
				}
				continue;
			}
			if (n < 0) {
				count++;
				if (count <= 5) {
					System.out.println("Không hợp lệ, hãy nhập lại");
					continue;
				}
			}
			break;
		}
		isPrimeNumber(n);
		ip.close();

	}

	public static boolean isPrimeNumber(int number) {

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				System.out.println(number + " không phải là số nguyên tố");
				return false;
			}
		}
		System.out.println(number + " là số nguyên tố");
		return true;

	}
}
