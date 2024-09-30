package view;

import java.util.Scanner;

public class Ex03IoScanner {
	public static void main(String[] args) {
		//Scanner: nhập xuất 
		//Tham số: System.in --> nhập từ bàn phím
		Scanner ip = new Scanner(System.in);
		
		System.out.print("nhập MaMH = ");
		String id = ip.nextLine();
		
		System.out.print("Nhập TenMH = ");
		String name = ip.nextLine();
		
		System.out.print("Nhập SoLuong = ");
		int amount = Integer.parseInt(ip.nextLine());
		
		System.out.print("Nhập MoTa = ");
		String desc = ip.nextLine();
		
		System.out.printf("MaMH = %s\n"
				+ "TenMH = %s\n"
				+ "Soluong = %s\n"
				+ "MoTa = ",
				id, name, amount, desc );
	}
}
