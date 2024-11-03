package view;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Nhập số phần tử 2 > n > 20: ");
		int n = ip.nextInt();
		
		int[] array = new int[n-1];
		
		int count = 0;
		while (count < n - 1) {
			int  random = (int) Math.floor(Math.random() * n);
			boolean exists = false;
			for (int i = 0; i < count; i++) {
				if (array[i] == random) {
                    exists = true;
					break;
				}
			}
			
			if (!exists) {
				array[count] = random;
                count++;
            }
		}
		
		
		for (int num : array) {
            System.out.print(num + " ");
        }
		
		int count1 = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (j == array[i]) {
					count1 = 1;
				}
			}
			if (count1 == 0) {
				System.out.println("\nPhần tử cần tìm có giá trị: " + i);
				break;
			}
			count1 = 0;
		}
		
		ip.close();
	}
}
