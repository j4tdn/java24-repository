package view;

import java.util.Scanner;

public class Ex03IoScanner {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.print("Nhap MaMH = ");
		String id = ip.nextLine();

		System.out.print("Nhap TenMH = ");
		String name = ip.nextLine();

		System.out.print("Nhap SoLuong = ");
		int amount = Integer.parseInt(ip.nextLine());

		System.out.printf("MaMH = %s\n" + "TenMH = %s\n" + "SoLuong = %s", id, name, amount);

	}
}
