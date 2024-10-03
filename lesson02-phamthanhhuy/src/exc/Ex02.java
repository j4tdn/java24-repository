package exc;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		int number=0;
		int count = 1;
		while (count < 7) {
			try {

				System.out.print("Nhập N: ");
				Scanner ip = new Scanner(System.in);
				number = Integer.parseInt(ip.nextLine());
				if (number > 0) {
					break;
				}
				if (number < 1) {
					System.out.println("Không hợp lệ lần " + count);

				}
			} catch (NumberFormatException e) {
				if (count >= 6) {
					System.out.println("Không hợp lệ quá 5 lần ");
				} else {
					System.out.println("Không hợp lệ lần " + count);
				}

			}
			count++;
			
		}
		if(number == 0) {
			System.out.println("=======================================");
		}
		double songuyen = Math.log(number)/Math.log(2);
		if (songuyen == Math.floor(songuyen)) {
			System.out.println("N là lũy thừa của 2");
			
		} else {
			System.out.println("N không là lũy thừa của 2 ");
		}
		
	}
	
}
