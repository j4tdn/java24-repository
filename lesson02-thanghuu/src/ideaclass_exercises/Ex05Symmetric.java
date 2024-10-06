package ideaclass_exercises;

import utils.IoUtils;

public class Ex05Symmetric {

	public static void main(String[] args) {
		int n = IoUtils.inputNumber(9 , 1, "Nhap n");
		
		System.out.println(n + " la so doi xung ?? --> "+ isSymmetricNumber(n));
	}

	private static boolean isSymmetricNumber(int number) {
		return number == getSymmetricNumber(number);
	}

	private static int getSymmetricNumber(int number) {
		int reversed = 0;
		while (number != 0) {
			int modPart = number % 10;
			reversed = reversed * 10 + modPart;
			number = number / 10;
		}
		return reversed;
	}

}
