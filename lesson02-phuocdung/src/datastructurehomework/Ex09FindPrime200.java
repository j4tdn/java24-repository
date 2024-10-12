package datastructurehomework;

public class Ex09FindPrime200 {

	public static boolean isPrime(int number) {

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] Primes = new int[201];
		int count = 0;
		for (int i = 2; count <= 200; i++) {
			if (isPrime(i)) {
				Primes[count] = i;
				count++;
			}
		}
		System.out.println("Số nguyên tố thứ 200 có giá trị là " + Primes[199]);
	}
}
