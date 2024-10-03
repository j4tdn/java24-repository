package exercises;

public class Ex08 {
	
	public static void main(String[] args) {
		int n = checkN.input();
		if (isPrime(n)) {
			System.out.println(n + " là số nguyên tố");
		} else {
			System.out.println(n + " không phải là số nguyên tố");
		}
	}
	
	public static boolean isPrime(int n) {
		if (n == 1) return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) return false;
		}
		return true;
	}
}
