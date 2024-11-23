package view;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int a = 0;
		int b = 0;
		
		do {
			try {
				System.out.print("Nhập a: ");
				a = Integer.parseInt(ip.nextLine());
				System.out.print("Nhập b: ");
				b = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Dữ liệu nhập vào chưa hợp lệ, nhập lại");
			}
		} while (true);


		try {
			int x = -b/ a;
			System.out.println("x = " +  x);
		} catch (ArithmeticException ae) {
			System.out.println("A phải khác 0");
		}
		ip.close();
	}
	
}
