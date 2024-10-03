package homework;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Nhập vào a: ");
		int a = ip.nextInt();
		System.out.print("Nhập vào b: ");
		int b = ip.nextInt();
		System.out.print("Nhập vào c: ");
		int c = ip.nextInt();
		
		int max = a;
		if (b>max) {
			max = b;
		}
		else {
			max = c;
		}
		
		int min = a;
		if (b<min) {
			min = b;
		}
		else {
			min = c;
		}
		
		System.out.print("Số lớn nhất là " + max);
		System.out.print("\nSố nhỏ nhất là " + min);
		ip.close();
		
	}
}
