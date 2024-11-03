package utils;

import java.util.Random;
import java.util.Scanner;

public class Utilities {
	
	private static Scanner sc = new Scanner(System.in);
	private static Random rd = new Random();
	
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
	
	public static int randomInt(int minInclusive, int maxExclusive) {
		return rd.nextInt(minInclusive, maxExclusive);
	}
}
