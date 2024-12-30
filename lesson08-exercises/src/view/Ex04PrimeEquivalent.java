package view;

import utils.UtilsInput;
import static java.lang.Math.*;

public class Ex04PrimeEquivalent {
	
	public static void main(String[] args) {
		long nA = UtilsInput.inputLong("Enter the first integer number: ");
		long nB = UtilsInput.inputLong("Enter the second integer number: ");
		if (checkEquivalent(nA, nB)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	private static boolean checkEquivalent(long a, long b) {
		long max = max(a,b);
		for (int i = 2; i <= sqrt(max); i++) {
			if (a % i == 0 && b % i == 0) {
				while (a % i == 0) {
					a/=i;
				}
				while (b % i == 0) {
					b/=i;
				}
				
			} 
		}
		if (a == b) {
			return true;
		}
		return false;
	}
	
	
}
