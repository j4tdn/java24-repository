package exerciese;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int tongGiaiThua = giaiThua(a) + giaiThua(b) + giaiThua(c) + giaiThua(d);
		System.out.println("Tổng giai thừa của 4  a b c d là " + tongGiaiThua);
	}

	public static int giaiThua(int number) {
		int tich = 1;
		for (int i = 1; i <= number; i++) {
			tich *= i;
		}
		return tich;
	}

}
