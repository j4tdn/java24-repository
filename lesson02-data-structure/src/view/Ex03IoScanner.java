package view;

import java.util.Scanner;

public class Ex03IoScanner {
	
	public static void main(String[] args) {
		// Scanner: Nhập xuất
		// Tham số: System.in --> Nhập từ bàn phím
		
		Scanner ip = new Scanner(System.in);
		
		// nextLine : 
		// + Nhập giá trị --> Enter -> Lấy giá trị gán về biến
		// + Ko nhập --> Enter -> Lấy giá trị rỗng "" gán về biến
		// --> Kthuc nhập Enter --> clear Enter khỏi vùng nhớ tạm
		
		//!nextLine:
		// + Nhập giá trị --> Enter -> Lấy giá trị gán về biến
		// + Ko nhập --> Enter -> Ko làm gì cả
		// --> Kthuc nhập Enter --> Ko clear Enter khỏi vùng nhớ tạm
		
		System.out.print("Nhập MaMH = ");
		String id = ip.nextLine();
		
		System.out.print("Nhập TenMH = ");
		String name = ip.nextLine();
		
		System.out.print("Nhập SoLuong = ");
		int amount = ip.nextInt();
//		int amount = Integer.parseInt(ip.nextLine());
////		ip.nextLine();
		
		System.out.print("Nhập MoTa = ");
		String desc = ip.nextLine();
		
		System.out.printf("MaMH = %s\n"
				+ "TenMH = %s\n"
				+ "SoLuong = %s\n"
				+ "MoTa = %s", id, name, amount, desc);
	}
}
