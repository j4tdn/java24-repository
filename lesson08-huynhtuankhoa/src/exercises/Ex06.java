package exercises;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		StringBuilder range = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i < 100; i++ ) {
			range.append(i);
		}
		System.out.println("Enter k: ");
		int k = Integer.parseInt(sc.nextLine());
		System.out.println(range.charAt(k - 1));
		sc.close();
	}
}
