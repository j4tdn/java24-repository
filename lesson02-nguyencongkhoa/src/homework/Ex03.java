package homework;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập N = ");
		int number = sc.nextInt();
		int factorial = 1;
		
		if (number == 0) {
			System.out.println("0! = 1");
		} else {
			for (int i = 1; i <= number; i++) {
				factorial *= i;
			}
			System.out.println(number + "! = " + factorial);
		}
		
	}
	
}
