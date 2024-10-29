package ex05;

import java.util.Scanner;

public class NumberLevel {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = Integer.parseInt(ip.nextLine());
		int[] array = new int[n];
		System.out.println("Nhap mang: ");
		for(int i = 0;i < n;i++) {
			System.out.printf("a[%d] = ",i);
			array[i] = Integer.parseInt(ip.nextLine());
		}
		ip.close();
		sortArray(array, n);
		printArr(array);
	}
	
	private static void sortArray(int[] array,int n) {
		for(int i = 0;i < n-1;i++) {
			for(int j = n-1;j > i;j--) {
				if(divisorQuantity(array[j]) < divisorQuantity(array[i])) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	
	private static int divisorQuantity(int n) {
		int count = 0;
		for(int i =1;i <= n;i++) {
			if(n % i == 0) {
				count++;
			}
		}
		return count;
	}
	
	private static void printArr(int[] array) {
		for(int i= 0;i < array.length;i++) {
			System.out.print(array[i] + "\t");
		}
	}
}
