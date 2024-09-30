package homework;

import java.util.InputMismatchException;
import java.util.Scanner;

import view.Utilities;

public class Ex05 {
	
	public static boolean symmetric(int n) {
		int m = n;
		int res = 0;
		while (n > 0) {
			res = res * 10 + n % 10;
			n /= 10;
		}
		return res == m;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = 0;
		while (true) {
			System.out.print("Nhập N = ");
			String input = sc.nextLine();
			try {
				number = Integer.parseInt(input);
				if (number >= 10) {
					break;
				} else {
					System.out.println("Số nhập vào phải là số nguyên dương tối thiểu 2 chữ số!!");
				}
			} catch (NumberFormatException e) {
				System.out.println("Dữ liệu đầu vào phải là số nguyên dương!!");
			}
		}
		
		if (symmetric(number)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
	}
	
}
