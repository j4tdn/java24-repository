package ex03;

import java.util.Scanner;

public class PascalTriPrint {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = Integer.parseInt(ip.nextLine());
		ip.close();
		pascalTriangle(n);

	}

//	private static int factorial(int n) {
//		if (n == 0 || n == 1) {
//			return 1;
//		}
//		return factorial(n - 1) * factorial(n);
//
//	}
	
	private static int factorial(int n) {
		int number = 1;
		for(int i = 1;i <= n;i++) {
			number = number * i;
		}
		return number;
	}

	private static int compoundK(int n, int k) {
		int number = factorial(n) / (factorial(k) * factorial(n - k));
		return number;
	}

	private static void pascalTriangle(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(compoundK(i, j) + "\t");
			}
			System.out.println();
		}
	}

}
