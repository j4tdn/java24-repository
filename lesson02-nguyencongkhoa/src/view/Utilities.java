package view;

import java.util.Scanner;

public class Utilities {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int inputInt() {
		int cnt = 0;
		
		while (true) {
			System.out.print("Nhập N = ");
			String input = sc.nextLine(); 
			if (++cnt == 5) {
				return -1;
			}
			try {
				int number = Integer.parseInt(input);
				if (number >= 0) {
					return number;
				} else {
					System.out.println("Số nhập vào phải là số nguyên dương");
				}
			} catch (NumberFormatException e) {
				System.out.println("Dữ liệu đầu vào phải là số!!");
			}
		}
			
	}
	
}
