package view;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Nhập vào số thứ nhất");
		int a = Integer.parseInt(ip.nextLine());
		
		System.out.println("Nhập vào số thứ hai");
		int b = Integer.parseInt(ip.nextLine());
		
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		
		System.out.println(max + " có phải là lũy thừa của " + min + " không ??? --> " + isPowerOf(min, max) );
		
		ip.close();
	}

	private static boolean isPowerOf(int num1, int num2) {
		int count = num1;
		while (num1 < num2) {
			num1 *= count;
			if (num1 == num2) {
				return true;
			}
		}
		return false;
	}

}
