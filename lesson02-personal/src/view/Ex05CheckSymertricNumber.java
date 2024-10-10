package view;

import Utils.IoUtils;

public class Ex05CheckSymertricNumber {
	
	public static void main(String[] args) {
		
		int number = IoUtils.inputNumber(10, 5, "Nhập số nguyên dương N có tối thiếu 2 chữ số: ");
		System.out.println(number + " là số đối xứng ?? => " + checkSymertric(number));
		
	}
	
	public static boolean checkSymertric(int number) {
		return number == getSymertricNumber(number);
	}
	public static int getSymertricNumber(int number) {
		int reverse = 0;
		int remainder;
		while(number != 0) {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number /= 10;
			
		}
		return reverse;
	}
}
