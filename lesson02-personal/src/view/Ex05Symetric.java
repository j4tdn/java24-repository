package view;

import utils.Ex01Utils;

//Bài toán về số đối xứng
public class Ex05Symetric {
	
	public static void main(String[] args) {
		
		int n = Ex01Utils.testInput(10, 1, "Nhập n");
		
		System.out.println(n+ " là số đối xứng ??? --> " + isSymertricNumber(n));
		
	}
	
	private static boolean isSymertricNumber(int number) {
		return number == getSymertricNumber(number);
	}
	
	//
	private static int getSymertricNumber(int number) {
		
		int reversed = 0;
		while(number != 0) {
			int modePart = number % 10;
			reversed = reversed * 10 + modePart;
			number = number / 10;
		}
		
		return reversed;
	}
	
}
