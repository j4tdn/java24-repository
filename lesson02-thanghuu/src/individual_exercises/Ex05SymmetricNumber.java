package individual_exercises;

import java.util.Scanner;

public class Ex05SymmetricNumber {
	
	private static boolean reversed(int n) {
		int original = n;
		int reversed = 0;
		while (original > 0) {
	        int digit = original % 10;
	        reversed = reversed * 10 + digit;
	        original /= 10;
	    }
		return n == reversed;
	}
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int N;
		while (true) {
			try {
				System.out.println("Nhap so can kiem tra: ");
				N = Integer.parseInt(ip.nextLine());
			} catch (Exception e) {
				System.out.println("Loi, moi nhap lai!");
				continue;
			}
			if (N < 10) {
				System.out.println("Loi, moi nhap lai!");
				continue;
			}
			break;
		}
		if(reversed(N))
			System.out.println("--> True");
		else
			System.out.println("--> False");
		ip.close();
	}
	
}
