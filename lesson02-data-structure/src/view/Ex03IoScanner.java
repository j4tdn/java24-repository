package view;

import java.util.Scanner;

public class Ex03IoScanner {
	
	public static void main(String[] args) {
		// Scanner: Nhập xuất
		// Tham số: System.in --> Nhập từ bàn phím
		Scanner ip = new Scanner(System.in);
		
		// nextLine:
		
		System.out.printf("Nhập id = ");
		String id = ip.nextLine();
		
		System.out.printf("Nhập TenMH = ");
		String name = ip.nextLine();
		
		System.out.printf("Nhập SoLuong = ");
		int amount = Integer.parseInt(ip.nextLine());
		
		System.out.printf("Nhập MoTa = ");
		String desc = ip.nextLine();

		System.out.printf("\nMaMH = %s\n"
				+ "TenMH = %s\n"
				+ "SoLuong = %s\n"
				+ "MoTa = %s", id, name, amount, desc);
	}
}
