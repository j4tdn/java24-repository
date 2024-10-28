package exercises;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		while (true) {
			String input = sc.nextLine();
			if (isNumber(input)) {
				int number = Integer.parseInt(input);
				if (number > 10 && isSymmetric(number)) {
					System.out.println("True");
				} else {
					System.out.println("False");
				}
				break;
			} else {
				System.out.print("Invalid number! Enter again: ");
			}
		}
		sc.close();
	}
	private static boolean isNumber(String str) {
		if (str == null || str.isEmpty()) {
			return false;
		} else {
			for (char c: str.toCharArray()) {
				if(!Character.isDigit(c)) {
					return false;
				}
			}	
			return true;
		}
	}
		
	private static boolean isSymmetric(int num) {
		int length = findLengthOfNumber(num);
		boolean check = true;
		while(num > 10) {
			int end = num % 10;
			int start = (int) (num / (Math.pow(10, length-1)));
			if (start != end) {
				check = false;
				break;
			} else {
				num %= (Math.pow(10, length-1));
				num /= 10;
				length -= 2;
			}
		}
		return check;
	}
	
	private static int findLengthOfNumber(int num) {
		int count = 0;
		while (num != 0) {
			count++;
			num /= 10;
		}
		return count;
	}
}

