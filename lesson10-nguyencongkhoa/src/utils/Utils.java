package utils;

import java.util.Random;
import java.util.Scanner;

public class Utils {

	private static Random rd = new Random();
	private static Scanner sc = new Scanner(System.in);
	
	
	public static int[] arrayRandom(int n, int start, int end) {
		int[] arrRand = new int[n];
		for (int i = 0; i < n; i++) {
			arrRand[i] = rd.nextInt(start, end + 1);
		}
		return arrRand;
	}
	
	public static int inputInt(String mess) {
		while (true) {
			System.out.print(mess);
			int n = sc.nextInt();
			sc.nextLine();
			try {
				return n;
			} catch (NumberFormatException e) {
				System.out.println("Invalid input integer. Please enter again!!");
			}
		}
	}
	
}
