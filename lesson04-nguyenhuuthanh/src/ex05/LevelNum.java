package ex05;

import java.util.Scanner;

public class LevelNum {
	
	public static int levelNumber(int n) {
		int count = 0;
		for(int i = 1; i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		return count;
	}
	public static void ipArray(int a[], int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mảng : ");
		for(int i = 0; i <n; i++) {
			a[i] = sc.nextInt();
		}
	}
	
	public static void sortLevel(int a[]) {
		int n = a.length;
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n-i-1; j++){
				if(levelNumber(a[j]) > levelNumber(a[j+1])) {
					int swap = a[j];
					a[j] = a[j+1];
					a[j+1] = swap;
				}
			}
		}
	}
	public static void printArr(int a[]) {
		System.out.println("Mảng sau sắp xếp : ");
		for(int num :  a) {
			System.out.print(num+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập n : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		ipArray(a, n);
		sortLevel(a);
		printArr(a);

	}
}
