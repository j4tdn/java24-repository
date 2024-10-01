package individual_exercises;

import java.util.Scanner;

public class Ex01MultipleOf2 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int count = 5;
		int N = 0;
		while (count > 0) {
			try {
				System.out.println("Nhap so can kiem tra: ");
				N = Integer.parseInt(ip.nextLine());
			} catch (Exception e) {
				System.out.println("Loi, moi nhap lai!");
				count--;
				continue;
			}
			if (N <= 0) {
				System.out.println("Loi, moi nhap lai!");
				count--;
				continue;
			}
			break;
		}

		if (isMultiple(N)) {
			System.out.println("N = " + N + " --> true");
		} else {
			System.out.println("N = " + N + " --> false");
		}
		ip.close();
	}

	private static boolean isMultiple(int number) {
		return number % 2 == 0;
	}
}
