package individual_exercises;

import java.util.Scanner;

public class Ex02PowerOf2 {
	
	private static boolean isPowerOfTwo(int number) {
		 return (number > 0) && ((number & (number - 1)) == 0);
	}
	
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
		
		if (isPowerOfTwo(N)) {
			System.out.println("N = " + N + " --> true");
		} else {
			System.out.println("N = " + N + " --> false");
		}
		
		ip.close();
	}
}
