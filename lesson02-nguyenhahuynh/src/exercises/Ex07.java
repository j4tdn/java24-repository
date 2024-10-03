package exercises;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Nhập số tự nhiên: ");
		int n = ip.nextInt();
		
		String binary = convertToBinary(n);
		
		System.out.println("Số nhị phân của " + n + " là: " + binary);
		
	}
	
	public static String convertToBinary(int n) {
		return Integer.toBinaryString(n);
	}
}
