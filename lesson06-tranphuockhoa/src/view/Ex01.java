package view;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		int a = 0, b = 0;
		
		Scanner sc = new Scanner(System.in);

		while(true) {
			try {
				System.out.println("Nhap a (a#0): ");
				a = Integer.parseInt(sc.nextLine());
				if(a==0) {
					throw new ArithmeticException("a phai khac 0");
				}
				System.out.println("Nhap b: ");
				b = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
				System.out.println("So vua nhap khong hop le vui long nhap lai");	
			}
			
			double x = -b / a;
			System.out.println("Nghiem cua phuong trinh la: " + x);
				
		}
		
	}
	
}
