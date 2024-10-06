package view;

import utils.IoUtils;

// Bài toán về số đối xứng
public class Ex05Symetric {
	
	public static void main(String[] args) {
		int n = IoUtils.inputNumber(10, 1, "Nhập n");
		
		System.out.println(n + " là số đối xứng ??? --> " + isSymetricNumber(n));
	}
	
	private static boolean isSymetricNumber(int number) {
		return number == getSymetricNumber(number);
	}
	
	private static int getSymetricNumber(int number) {
		int reversed = 0;
		while(number != 0) {
			int modePart = number % 10;
			reversed = reversed * 10 + modePart;
			number = number / 10;
		}
		return reversed;
	}
	
}
