package view;

import java.util.Arrays;
import java.util.Random;

public class Ex02RandomInteger {
	private static Random rd = new Random();

	public static void main(String[] args) {
		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rd.nextInt(0, 30);
		}
		System.out.println(Arrays.toString(numbers));
		System.out.println("=================================");
		for (int i = 0; i < arrayOfMod7(numbers).length; i++) {
			System.out.print(" " + arrayOfMod7(numbers)[i]);
		}
		System.out.print(" |");
		for (int i = 0; i < arrayOfMod7And5(numbers).length; i++) {
			System.out.print(" " + arrayOfMod7And5(numbers)[i]);
		}
		System.out.print(" |");
		for (int i = 0; i < arrayOfMod5(numbers).length; i++) {
			System.out.print(" " + arrayOfMod5(numbers)[i]);
		}
		/*
		 * System.out.println(Arrays.toString(arrayOfMod7(numbers)) + "|" +
		 * Arrays.toString(arrayOfMod7And5(numbers)) + "|" +
		 * Arrays.toString(arrayOfMod5(numbers)));
		 */
	}

	private static int[] arrayOfMod7(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for (int number : numbers) {
			if (isMod7(number)) {
				result[count] = number;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static int[] arrayOfMod5(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for (int number : numbers) {
			if (isMod5(number)) {
				result[count] = number;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static int[] arrayOfMod7And5(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for (int number : numbers) {
			if (isMod7And5(number) || isNotMod7And5(number)) {
				result[count] = number;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static boolean isMod7(int number) {
		return number % 7 == 0 && number % 5 != 0;
	}

	private static boolean isMod5(int number) {
		return number % 5 == 0 && number % 7 != 0;
	}

	private static boolean isMod7And5(int number) {
		return number % 7 == 0 && number % 5 == 0;
	}

	private static boolean isNotMod7And5(int number) {
		return number % 7 != 0 && number % 5 != 0;
	}

}

/*
 * private static boolean isValid(int n) { return n >= 5 && n <= 100; }
 * 
 * private static int inputN() { int n = 0; int wrongtimes = 0; while (true) {
 * System.out.print("Nhap n (5 <= n <= 100): "); n = ip.nextInt(); if
 * (isValid(n)) { break; } wrongtimes++;
 * System.out.println("Khong hop le, sai lan " + wrongtimes); if (wrongtimes ==
 * 3) { System.out.println("Da sai " + wrongtimes + " lan, Thoat chuong trinh");
 * System.exit(0); }
 * 
 * } return n; }
 */
