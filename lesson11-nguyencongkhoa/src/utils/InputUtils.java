package utils;

import java.util.Scanner;

public class InputUtils {

	private InputUtils() {
	}

	private static Scanner sc = new Scanner(System.in);

	public static String inputString(String input) {
		System.out.print(input);
		while (true) {
			String result = sc.nextLine();
			if (!result.isEmpty()) {
				return standardization(result);
			} else {
				System.out.print("Input cannot be empty. Please enter again: ");
			}
		}
	}

	public static int inputInt(String input) {
		while (true) {
			System.out.print(input);
			String data = sc.nextLine();
			try {
				return Integer.parseInt(data);
			} catch (NumberFormatException nfe) {
				System.out.println("The input data must be a int!!");
			}
		}
	}
	
	public static double inputDouble(String input) {
		while (true) {
			System.out.print(input);
			String data = sc.nextLine();
			try {
				return Double.parseDouble(data);
			} catch (NumberFormatException nfe) {
				System.out.println("The input data must be a double!!");
			}
		}
	}
	
	public static String standardization(String str) {
		String[] strings = str.strip().split("\\s+");
		String normalize = "";
		for (String s : strings) {
			normalize += normalizeWord(s).strip() + " ";
		}
		return normalize.strip();
	}

	public static String normalizeWord(String str) {
		return (Character.toUpperCase(str.charAt(0)) + str.substring(1).toLowerCase()).strip();
	}
}
