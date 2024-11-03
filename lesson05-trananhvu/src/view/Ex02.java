package view;

import java.util.Scanner;

public class Ex02 {

	private static boolean isSpecialNumber(int s) {
		int res = 0;
		for (int i = 1; i <= s; i++) {
			res += i;
			if (res == s)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhap so nguyen S: ");
		int s = ip.nextInt();
		if (isSpecialNumber(s))
			System.out.println(s + " la so dac biet");
		else
			System.out.println(s + " ko phai la so dac biet");

		ip.close();
	}
}
