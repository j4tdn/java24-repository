package ex01;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		int a = ip.nextInt();
		int b = ip.nextInt();
		
	    System.out.println(isPowerOf(a, b));
	    
	    ip.close();
	}
	
	private static boolean isPowerOf(int a, int b) {
		if (a < 0 || b < 0) {
			return false;
		}
		
		if (a > b) {
			while(a > 1) {
				if (a % b != 0) {
					return false;
				}
				a /= b;
			}
			return a == 1;
		}
		
		else {
			while(b > 1) {
				if (b % b != 0) {
					return false;
				}
				b /= a;
			}
			return b == 1;
		}
	}
}
