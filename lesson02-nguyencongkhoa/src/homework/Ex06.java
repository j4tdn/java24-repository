package homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex06 {
		
	private static Scanner sc = new Scanner(System.in);
	
	public static int inputData(char c) {
		int number = 0;
		while (true) {
			System.out.print("Nhap " + c + " = ");
			String input = sc.nextLine();
			try {
				number = Integer.parseInt(input);
				if (number < 20) {
					return number;
				} else {
					System.out.println("Số nhập vào phải là số nguyên nhỏ hơn 20!!");
				}
			} catch (NumberFormatException e) {
				System.out.println("Dữ liệu đầu vào phải là số nguyên!!");
			}
		}
	}
	
	public static void main(String[] args) {

		int a = inputData('a'); 
		
		int b = inputData('b'); 
		
		int c = inputData('c'); 
		
		int max = Math.max(a, Math.max(b, c));
		int min = Math.min(a, Math.min(b, c));
		
		System.out.println("\nSố lớn nhất là " + max);
		System.out.println("Số nhỏ nhất là " + min);
	}

}
