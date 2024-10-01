package view;

import java.util.Scanner;

public class Ex03IoScanner {
	
	public static void main(String[] args) {
		//Scanner Nhập xuất
		//Tham số system.in  -> nhập từ bàn phím
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Nhập maMH = ");
		String id = ip.nextLine();
		
		System.out.print("Nhập tenMH = ");
		String name = ip.nextLine();
		
		
		System.out.print("Nhập soluong = ");
		int amout = Integer.parseInt(ip.nextLine());
		
		System.out.print("Nhập mota = ");
		String desc = ip.nextLine();
		
		System.out.printf("MaMH = %s\n"
				+ "tenMH =  %s\n"
				+ "soluong =  %s\n"
				+ "mota = %s\n" ,id,name,amout,desc
				);
		
	}

}