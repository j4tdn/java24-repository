package lesson06_nguyenhuynhnhatduy;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a ;
		double b ;
		while(true) {
			try {
				System.out.println("Nhap vao so a");
				a = Double.parseDouble(sc.nextLine());
				System.out.println("Nhap vao so b");
				b = Double.parseDouble(sc.nextLine());
				if(a ==0) {
					System.out.println("So a phai khac 0. Nhap lai ");
					continue;
				}
				double x= -b/a;
				System.out.println("Nghiem cua phuong trinh bac nhat la" +x);
		
			} catch (NumberFormatException e) {
               System.out.println("nhap lai so a ");
			}
		}

	}

}
