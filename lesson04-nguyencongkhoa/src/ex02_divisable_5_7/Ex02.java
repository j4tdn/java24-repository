package ex02_divisable_5_7;

import util.Utilities;

public class Ex02 {
	
	
	
	public static void main(String[] args) {
		int numberSeries = Utilities.randomInt(5, 101);
		String divisible5 = "";
		String divisibleBoth = "";
		String divisible7 = "";
		
		System.out.print("Input: ");
		for (int i = 0; i <= numberSeries; i++) {
			int number = Utilities.randomInt(0, 1001);
			System.out.print(number + " ");
			if (number % 5 == 0 && number % 35 != 0) {
				divisible5 += number + " ";
			} else if (number % 7 == 0 && number % 35 != 0) {
				divisible7 += number + " ";
			} else {
				divisibleBoth += number + " ";
			}
		}
		
		System.out.println("\nOutput: " + divisible7 + "| " + divisibleBoth + "| " + divisible5);
	}
	
}
