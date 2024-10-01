package individual_exercises;

import java.util.Scanner;

public class Ex08PrimeNumber {
	
	private static boolean isPrime(int number) {
		if(number < 2)
			return false;
		for(int i = 2; i * i <= number; i++ ) {
			if(number % i == 0) return false;
		}
		return true;
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
		
		if(isPrime(N))
			System.out.println("--> True");
		else
			System.out.println("--> False");
		
		
		ip.close();
	}
}
