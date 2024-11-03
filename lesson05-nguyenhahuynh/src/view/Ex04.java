package view;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Nhập số phần tử 2 > n > 20: ");
		int n = ip.nextInt();
		
		int[] array = new int[n];
		
		for (int i = 0; i < n; i++) {
			int  random = (int) Math.floor(Math.random() * 100);
			array[i] = random;
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (array[j] == array[i]) {
					
				}
			}
		}
		
		for (int num : array) {
            System.out.print(num + " ");
        }
		
		ip.close();
	}
}
