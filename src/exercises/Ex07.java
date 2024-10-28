package exercises;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		decimalToBinary(number);
		sc.close();
	}
	private static void decimalToBinary(int decimal) {
		String result = "";
		int remainder;
		do {
			remainder = decimal % 2;
			result += remainder;
			decimal /= 2;
		} while(decimal != 0);
		reverseString(result);
	}
	private static void reverseString(String str) {
		char[] strArr = str.toCharArray();
		for(int i = 0; i < strArr.length / 2; i++) {
			char temp = strArr[i];
			strArr[i] = strArr[strArr.length - i - 1];
			strArr[strArr.length - i - 1] = temp;
		}
		System.out.println(strArr);
	}
}
