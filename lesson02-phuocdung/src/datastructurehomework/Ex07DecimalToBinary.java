package datastructurehomework;

import java.util.Scanner;

public class Ex07DecimalToBinary {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		int n;
		
		while(true) {
			try {
				System.out.println("Nhập vào một số tự nhiên ở hệ cơ số cấp 10");
				n = Integer.parseInt(ip.nextLine());
			} catch (Exception e) {
				System.out.println("Không hợp lệ, hãy nhập lại");
				continue;
			}
			if(n < 0) {
				System.out.println("Không hợp lệ, hãy nhập lại");
				continue;
			}
			
			break;
		}
		decimalToBinary(n);
		ip.close();
		
	}

	public static void decimalToBinary(int number) {
		
		int n = number;
		int[] binarys = new int[100];
		int index = 0;
		do {
			binarys[index] = number % 2;
			number /= 2;
			index++;
		} while (number > 0);

		System.out.print("N = " + n + " --> ");
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binarys[i]);
		}
	}

}
