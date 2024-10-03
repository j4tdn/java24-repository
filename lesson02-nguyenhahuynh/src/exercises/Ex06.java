package exercises;

import java.util.Scanner;

public class Ex06 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		int a = input("a");
		int b = input("b");
		int c = input("c");
		
		System.out.println("Số lớn nhất là: " + findMax(a, b, c));
		System.out.println("Số nhỏ nhất là: " + findMin(a, b, c));
	}
	
	public static int input(String name) {
		while (true) {
			System.out.print("Nhập số " + name + ": ");
			String input = ip.nextLine();
			try {
				int n = Integer.parseInt(input);
				if (n >= 0 && n < 20) {
					return n;
				} else {
					System.out.println("Số nhập vào phải từ [0, 20)");
				}
			} catch (NumberFormatException e) {
				System.out.println("Dữ liệu phải là số nguyên dương!");
			}
		}
	}
	
	public static int findMax(int a, int b, int c) {
		int max = a;
		if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
		return max;
	}
	
	public static int findMin(int a, int b, int c) {
		int min = a;
		if (b < min) {
			min = b;
        }
        if (c < min) {
        	min = c;
        }
		return min;
	}
}
