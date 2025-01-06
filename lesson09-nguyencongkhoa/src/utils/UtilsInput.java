package utils;

import java.util.Scanner;

public class UtilsInput {

	private static Scanner sc = new Scanner(System.in);

	public static String getValue(String input) {
		System.out.print(input);
		while (true) {
			String result = sc.nextLine();
			if (!result.isEmpty()) {
				return result;
			} else {
				System.out.print("Input cannot be empty. Please enter again: ");
			}
		}
	}
	
	public static void nextLine() {
		sc.nextLine();
	}
	
	public static int inputInt(String input) {
		while (true) {
			System.out.print(input);
			int data = sc.nextInt();
			try {
				return data;
			} catch (NumberFormatException nfe) {
				System.out.println("The input data must be a positive integer!!");
			}
		}
	}
}
