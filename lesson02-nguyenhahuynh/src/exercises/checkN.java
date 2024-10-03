package exercises;

import java.util.Scanner;

public class checkN {
	private static Scanner ip = new Scanner(System.in);
	
	public static int input() {
		int count = 0;
		while (count < 5) {
			System.out.print("Nhập số nguyên dương: ");
			String input = ip.nextLine();
			try {
				int n = Integer.parseInt(input);
				if (n > 0) {
					return n;
				} else {
					System.out.println("Số nhập vào phải là số nguyên dương!");
				}
			} catch (NumberFormatException e) {
				System.out.println("Dữ liệu phải là số nguyên dương!");
			}
			count++;
		}
		return -1;
	}
}
