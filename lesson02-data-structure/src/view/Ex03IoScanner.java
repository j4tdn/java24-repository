package view;

import java.util.Scanner;

public class Ex03IoScanner {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.print("Nhập MaMH = ");
		String id = ip.nextLine();
	
		System.out.print("Nhập TenMH = ");
		String name = ip.nextLine();
		
		System.out.print("Nhập SoLuong = ");
		int amount = Integer.parseInt(ip.nextLine());
		
		System.out.print("Nhập MoTa = ");
		String desc = ip.nextLine();
		
		System.out.printf("MaMH = %s\n"
				+ "TenMH = %s\n"
				+ "SoLuonh = %s\n"
				+ "MoTa = %s", id, name, amount, desc);
	}
}
