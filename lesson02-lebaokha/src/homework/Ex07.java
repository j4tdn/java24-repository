package homework;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.print("Nhập N: ");
		int number = ip.nextInt();
		
		int num = number;

		if (number == 0) {
			System.out.println("0");
		} else {
			String temp = "";
			for (; number > 0; number = number / 2) {
				if (number % 2 == 0) {
					temp = '0' + temp;
					
				} else {
					temp = '1' + temp;
				}
			}
			System.out.println(num + " --> " + temp);
		}

		ip.close();
	}
}
