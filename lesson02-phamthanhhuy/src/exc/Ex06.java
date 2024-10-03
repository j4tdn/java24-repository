package exc;

import java.util.Scanner;

public class Ex06 {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);

		System.out.print("Nhap a: ");
		String a = ip.nextLine();
		System.out.println("a: " + Nhap(a));

		System.out.print("Nhap b: ");
		String b = ip.nextLine();
		System.out.println("b: " + Nhap(b));

		System.out.print("Nhap c: ");
		String c = ip.nextLine();
		System.out.println("c: " + Nhap(b));

		int max = Math.max(Math.max(Nhap(a), Nhap(b)), Nhap(c));
		int min = Math.min(Math.min(Nhap(a), Nhap(b)), Nhap(c));

		System.out.println("Số lớn nhất: " + max);
		System.out.println("Số nhỏ nhất: " + min);

	}

	public static int Nhap(String number) {
		int n;
		try {
			n = Integer.parseInt(number);
			if (n > -1 && n < 20) {
				return n;
			} else {
				while (n < -1 || n > 20) {
					System.out.print("Nhập lại: ");
					n = ip.nextInt();
				}
				return n;
			}

		} 
		catch (NumberFormatException e) {
			System.out.print("Nhập lại: ");
			n = Integer.parseInt(ip.nextLine());
			
		}
		return n;

	}

}
