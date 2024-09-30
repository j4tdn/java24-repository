package view;

import java.util.Scanner;

public class Ex03IOScanner {
	public static void main(String[] args) {
		// scanner: nhap xuat
		// tham so: system.in -> nhap tu ban phim
		Scanner sc = new Scanner(System.in);
		
		//nextLine()
		//ket thuc nhap Enter => clear Enter
		
		//!nextLine()
		//ket thuc nhap Enter => ko clear Enter
		System.out.print("Nhap MaMH = ");
		String id = sc.nextLine();
		
		System.out.print("Nhap TenMH = ");
		String name = sc.nextLine();
		
		//Cach fix troi lenh dung parse Int hoac sc.nextLine()
		//khi nhap !nextLine() truoc nextLine()
		System.out.print("Nhap So Luong = ");
		int amount = Integer.parseInt(sc.nextLine());
		
		
		System.out.print("Nhap Mo Ta = ");
		String desc = sc.nextLine();
		
		System.out.printf("MaMH = %s\n"
				+ "TenMH = %s\n"
				+ "So Luong = %s\n"
				+ "Mo Ta = %s\n"
				, id, name, amount, desc);
		
	}

}
