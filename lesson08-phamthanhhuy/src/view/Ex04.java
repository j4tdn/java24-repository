package view;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {
	
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Nhập a: ");
		int a = Integer.parseInt(ip.nextLine());

		System.out.print("Nhập b: ");
		int b = Integer.parseInt(ip.nextLine());

		System.out.println("Các ước chung của " + a + " và " + b + " là: " + Arrays.toString(array(a, b)));
		
		if(isVicePrime(array(a, b))) {
			System.out.println(a + " và " + b + " là các số nguyên tố tương đối");
		} else {
			System.out.println(a + " và " + b + " không là các số nguyên tố tương đối");
		}
	}

	private static int[] array(int a, int b) {

		int min = Math.min(a, b);
		int[] commonNum = new int[min];
		int count = 0;

		for (int i = 1; i <= min; i++) {

			if (a % i == 0 && b % i == 0) {
				commonNum[count] = i;
				count++;
			}
		}

		return Arrays.copyOfRange(commonNum, 0, count);
	}
	
	private static boolean isVicePrime(int[] arrays) {
		for(int array:arrays) {
			if(!isPrime(array)) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isPrime(int n){
        for(int i=2; i<=n/2; i++)
        {
           if(n%i==0) return false;
        }
        return true;
}

}
