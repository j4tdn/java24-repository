package ex04;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = ip.nextInt();
		
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = ip.nextInt();
		}
		
		System.out.println(sum(a));
		
		ip.close();
		
	}
	
	private static int sum(int[] a) {
		int sum = 0;
		
		if (a.length <= 2) {
			sum = 0;
		}
		
		for (int i = 1; i < a.length - 1; i++) {
			sum += a[i];
		}
		
		return sum;
	}

}
