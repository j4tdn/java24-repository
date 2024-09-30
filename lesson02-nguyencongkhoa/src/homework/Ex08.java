package homework;

import view.Utilities;

public class Ex08 {
	
	public static boolean isPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return n > 1;
	}
	
	public static void main(String[] args) {
		int number = Utilities.inputInt();
		
		if (number == -1) {
			System.out.println("Đã đạt giới hạn cho phép nhập lại (tối đa 5 lần)!!");
			return;
		}
		
		if (isPrime(number)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
	}
}
