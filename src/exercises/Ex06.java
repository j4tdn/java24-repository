package exercises;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		while (true) {
			System.out.print("Enter a: ");
			String a = sc.nextLine();
			System.out.print("Enter b: ");
			String b = sc.nextLine();
			System.out.print("Enter c: ");
			String c = sc.nextLine();
			if (!isNumber(a) || !isNumber(b) || !isNumber(c)) {
				System.out.println("Invalid number!");
			} else {
				int a1 = Integer.parseInt(a);
				int a2 = Integer.parseInt(b);
				int a3 = Integer.parseInt(c);
				
				int[] arr = {a1, a2, a3};
				findMaxMin(arr);
				break;
			}
		}
		sc.close();
	}
	private static boolean isNumber(String str) {
		if (str == null || str.isEmpty()) {
			return false;
		} else {
			for (char c: str.toCharArray()) {
				if (!Character.isDigit(c)) {
					return false;
				}
			} 
			return true;
		}
	}
	
	private static void findMaxMin(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		for (int i: arr) {
			if (max < i) {
				max = i;
			}
			if (min > i) {
				min = i;
			}
		}
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
	}
}
