package datastructurehomework;

import java.util.Scanner;

public class Ex06FindMinMaxOfInteger {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		int a, b, c;

		for (int i = 0;; i++) {
			System.out.println("Nhập vào số a ");
			String num = ip.nextLine();
			if (isDigit(num)) {
				int targetNum = Integer.parseInt(num);
				if (targetNum < 20) {
					a = targetNum;
					break;
				} else {
					System.out.println("Không hợp lệ, hãy nhập lại");
				}
			} else {
				System.out.println("Không hợp lệ, hãy nhập lại");
			}
		}
		
		for (int i = 0;; i++) {
			System.out.println("Nhập vào số b ");
			String num = ip.nextLine();
			if (isDigit(num)) {
				int targetNum = Integer.parseInt(num);
				if (targetNum < 20) {
					b = targetNum;
					break;
				} else {
					System.out.println("Không hợp lệ, hãy nhập lại");
				}
			} else {
				System.out.println("Không hợp lệ, hãy nhập lại");
			}
		}
		
		for (int i = 0;; i++) {
			System.out.println("Nhập vào số c ");
			String num = ip.nextLine();
			if (isDigit(num)) {
				int targetNum = Integer.parseInt(num);
				if (targetNum < 20) {
					c = targetNum;
					break;
				} else {
					System.out.println("Không hợp lệ, hãy nhập lại");
				}
			} else {
				System.out.println("Không hợp lệ, hãy nhập lại");
			}
		}
		
		int max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		
		int min = a;
		if(b < min) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		
		System.out.println("Số nguyên lớn nhất là " + max);
		System.out.println("Số nguyên nhỏ nhất là " + min);
		
				
	}

	public static boolean isDigit(String str) {

		for (char ch : str.toCharArray()) {
			if (!Character.isDigit(ch)) {
				return false;
			}
		}
		return true;
	}

}
