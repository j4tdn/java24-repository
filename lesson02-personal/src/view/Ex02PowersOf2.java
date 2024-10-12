package view;

import utils.IoUtils;

public class Ex02PowersOf2 {
	
	public static void main(String[] args) {
		
		int number = IoUtils.inputNumber(0, 5, "Nhập vào số nguyên dương N: ");
		System.out.println(number + " là lũy thừa của 2 ??? => " + isPowersOf2(number));
		
	}

	public static boolean isPowersOf2(int number) {
		double x = Math.log(number) / Math.log(2);
		return Math.ceil(x) == Math.floor(x);
	}
}
