package view;

import java.util.Scanner;

public class Ex01 {
	
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		int a,b;
		double x;
		do {
			try {
				System.out.println("Nhap a: ");
				a = Integer.parseInt(ip.nextLine());
				System.out.println("Nhap b: ");
				b = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException | ArithmeticException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
				System.out.println("Vui long nhap so hop le!");
			}
		} while (true);
		
		x = calSOE(a, b);
		
		System.out.println("Nghiem cua phuong trinh --> " + x);
	}
	
	public static double calSOE(int a, int b) {
		if(a == 0)
			throw new ArithmeticException("Lỗi chia cho 0");
		return (double)-b/a;
	}
	
}
