package homework;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		int temp = 0;
		int primeNumber = 0;

		for (int count = 0; count < 5; count++) {
			System.out.print("Nhập vào số N từ bàn phím: ");
			String number = ip.nextLine();

			try {
				primeNumber = Integer.parseInt(number);

				if (primeNumber > 0) {
					temp = 1;
					break;
				} else {
					System.out.println("Nhập lại, không hợp lệ!");
				}
			} catch (Exception e) {
				System.out.println("Nhập lại, không hợp lệ!");
			}

		}

		if (temp == 1) {

			if (primeNumber == 1 || primeNumber == 2) {
				System.out.println("true");
			}

			else {
				int a = 0;
				for (int i = 1; i <= primeNumber; i++) {
					if (primeNumber % i == 0) {
						a++;
					}
				}
				if(a>2) {
					System.out.println("false");
				}else {
					System.out.println("true");
				}

			}

		}

		ip.close();

	}}
