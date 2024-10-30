package ex05;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = ip.nextInt();
		
		int[] numbers = new int[n];
		
		System.out.print("Mảng số nguyên: ");
		for (int i = 0; i < n; i++) {
			numbers[i] = ip.nextInt();
		}
		
		for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (lever(numbers[i]) > lever(numbers[j])) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
		
		System.out.print("Kết quả sau khi được sắp xếp: ");
		
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		
		
		ip.close();
	}
	
	private static int lever(int n) {
		int d = 0;
		
		for (int i = 1; i <= n; i++) {
			if(n % i == 0) {
				d++;
			}
		}
		return d;
	}
	
}
