package exercises;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhap so can kiem tra: ");
		int number = Integer.parseInt(ip.nextLine());
		
		if(number < 0) {
			System.out.println("Loi, n Khong phai la so nguyen duong!");
		}
		else {
			System.out.println(number +"! = " +factorial(number) );
		}
		ip.close();
	}
	private static int factorial(int number) {
		if(number == 0) return 1 ;
		return factorial(number-1) * number ;
	}
}
