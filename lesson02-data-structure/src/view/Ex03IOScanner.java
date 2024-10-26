package view;

import java.util.Scanner;

public class Ex03IOScanner {

	public static void main(String[] args) {
		// Scanner: Nhập xuất
		// Tham số: System.in ---> Nhập từ bàn phím
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhap maMH: ");
		String id = ip.nextLine();
		
		System.out.print("Nhap ten mh: ");
		String name = ip.nextLine();
		
		System.out.print("So luong: ");
		int amount = Integer.parseInt(ip.nextLine()) ;
		
		System.out.print("Nhap mo ta: ");
		String desc = ip.nextLine();
		
		System.out.printf("Ma MH: %s\n"
				+ "Ten MH: %s\n"
				+ "So luong: %s\n"
				+ "Mo ta: %s",id,name,amount,desc);
	}
	
}
