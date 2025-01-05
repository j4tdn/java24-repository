package view;

public class Ex04 {
	
	private static boolean isPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
	
	private static boolean isEquivalentPrimes(int n, int m) {
		if (n % 2 == 0 && m % 2 != 0 || n % 2 != 0 && m % 2 == 0)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (isPrime(i)) {
				if (n % i == 0 && m % i != 0 || n % i != 0 && m % i == 0)
					return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		int n = 15, m = 300;
		
		boolean isEquivalentPrimes;
		
		if (n > m) isEquivalentPrimes = isEquivalentPrimes(n, m);
        else isEquivalentPrimes = isEquivalentPrimes(m, n);

        System.out.println(isEquivalentPrimes);
	}
}
