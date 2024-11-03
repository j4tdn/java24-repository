package view;

import java.util.Scanner;

public class Ex01 {

	private static double calLog(int a, int b) {
		int n1 = Math.max(a, b);
		int n2 = Math.min(a, b);
		return Math.log(n1) / Math.log(n2);
	}

	private static boolean isPowerOf(int a, int b) {
		double n1 = (double) calLog(a, b);
		int n2 = (int) calLog(a, b);
		double n3 = n1 - n2;
		return n3 == 0;
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int a = ip.nextInt();
		int b = ip.nextInt();
		if (isPowerOf(a, b))
			System.out.println("true");
		else
			System.out.println("false");
		ip.close();
	}
}
