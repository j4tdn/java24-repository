package Utilities;

import java.util.Random;
import java.util.Scanner;

public class Utils {

	private static Scanner sc = new Scanner(System.in);
	private static Random rand = new Random();
	
	public static String getValue(String input) {
		while (true) {
			System.out.print(input);
			String data = sc.nextLine();
			if (!data.isEmpty()) {
				return data;
			} else {
				System.out.println("Input data cannot be empty. Please enter again!!");
			}
		}
	}

	public static boolean isNumber(String n) {
		for (int i = 0; i < n.length(); i++) {
			char c = n.charAt(i);
			if (c < '0' || c > '9') {
				return false;
			}
		}
		return true;
	}

	public static int inputPositiveInteger(String input) {
		while (true) {
			String data = getValue(input);
			if (isNumber(data)) {
				int dataInt = Integer.parseInt(data);
				if (dataInt > 0) {
					return dataInt;
				} else {
					System.out.print("Input data must be positive number (n > 0). Please enter again: ");
				}
			} else {
				System.out.print("Input data must be positive number. Please enter again: ");
			}
		}
	}

	public static int inputIntegerLimit(int min, int max) {
		while (true) {
			int result = inputPositiveInteger("");
			if (min <= result && max >= result) {
				return result;
			} else {
				System.out.print("Please input a number in range [" + min + ", " + max + "]. Please enter again: ");
			}
			
		}
	}
	
	public static int randomInteger(int minInclusive, int maxExclusive) {
		if (minInclusive > maxExclusive) {
			System.out.println("Min inclusive must be less than max exclusive!!");
		} 
		return rand.nextInt(minInclusive, maxExclusive);
	}
	
	public static String getGender(String input) {
		while (true) {
			System.out.print(input);
			String gender = sc.nextLine();
			if (gender.equalsIgnoreCase("Male") || gender.contentEquals("M")) {
				return "Male";
			} else if (gender.equalsIgnoreCase("Female") || gender.contentEquals("F")) {
				return "Female";
			} 
			System.out.println("Invalid input gender. Please enter Male/M or Female!!");
		}
	}
}
