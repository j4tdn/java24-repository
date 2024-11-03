package view;

import java.util.Scanner;

public class Ex02SpecialNumber {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập vào 1 số tự nhiên nguyên dương");
		int number = ip.nextInt();
		System.out.println("Số nhập vào là số đặc biệt ??? -- > " + isSpecialNumber(number));
		
		ip.close();
	}

	private static boolean isSpecialNumber(int number) {
		int count = 0;
		int i = 1;
		while (count < number) {			
			count = count + i;
			if (count == number) {
				return true;
			}
			i++;
		}
		return false;
	}

}
