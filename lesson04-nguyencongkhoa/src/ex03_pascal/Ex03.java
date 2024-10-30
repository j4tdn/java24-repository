package ex03_pascal;

import java.util.Scanner;

public class Ex03 {

	private static int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}
	// tổ hợp chập k của n (n k)
	// số thứ k trên dóng thứ n
	// (n, k) = n! / (k! * (n - k)!)
	private static int combinationNK(int n, int k) {
		return factorial(n) / (factorial(k) * factorial(n - k));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of height triang Pascal: ");
		int height = sc.nextInt();

		System.out.println("Triangle Pascal:");
		for (int n = 0; n < height; n++) {
//			for (int j = 0; j < height - n; j++) {
//				System.out.print(" ");
//			}
			for (int k = 0; k <= n; k++) {
				System.out.print(combinationNK(n, k) + " ");
			}
			System.out.println();
		}

	}

}
