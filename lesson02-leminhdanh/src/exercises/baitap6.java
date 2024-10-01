package exercises;

import java.util.Scanner;

public class baitap6 {

	public static Integer nhapSoNguyen(char c) {
		int n;
		Scanner ip = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.printf("Nhap so nguyen duong %s: ", c);

			try {
				n = Integer.parseInt(ip.nextLine());
				if (n < 0 || n >= 20) {
					int result = 10 / 0;
				}
				return n;
			} catch (Exception e) {
				System.out.println();
			}
		}
		return null;
	}

	public static void main(String[] args) {
		/*
		 * Viết chương trình tìm số nguyên lớn, nhỏ nhất trong 3 chữ số a,b,c Biết rằng
		 * a,b,c là số nguyên được nhập từ bàn phiasm và nhỏ hơn 20 [0, 20)
		 */
		System.out.println("nhap so nguyen [0, 20)");
		Integer a = nhapSoNguyen('a');
		Integer b = nhapSoNguyen('b');
		Integer c = nhapSoNguyen('c');

		int min = 0;
		int max = 0;
		if (a > b && a > c) {
			max = a;
		} else if (b > c && b > a) {
			max = b;
		} else if (c > a && c > b) {
			max = c;
		}

		if (a < b && a < c) {
			min = a;
		} else if (b < c && b < a) {
			min = b;
		} else if (c < b && c < a) {
			min = c;
		}

		System.out.println("max = " + max);
		System.out.println("min = " + min);

	}
}
