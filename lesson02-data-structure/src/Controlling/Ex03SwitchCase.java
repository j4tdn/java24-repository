package Controlling;

import java.util.Random;

public class Ex03SwitchCase {

	public static void main(String[] args) {
		/*
		 * Su dung Switch Case de lam gon code khi: + Bieu thuc if else so sanh " = "
		 * Cau 1: Random so ngau nhien tu 1 -> 5 => In ra tu Tieng Anh tuong ung
		 */

		Random rd = new Random();
		int number = rd.nextInt(1, 10);
		System.out.println("Number= " + number);
		switch (number) {

		/*
		 * Neu switch case dung ma ko break -> se bo qua kiem tra cac case con lai ma
		 * nhay vao code ben trong case thuc thi Dung lai khi: + Gap break + Xong het
		 * default
		 */
		case 1: // if (number ==1)
			System.out.println("ONE");
			break;

		case 2: // else if (number ==2)
			System.out.println("TWO");
			break;

		case 3:
			System.out.println("THREE");
			break;

		case 4:
			System.out.println("FOUR");
			break;

		case 5:
			System.out.println("FIVE");
			break;
		default: // else
			System.out.println("Unsupported");
		}
		System.out.println("=================================");
		switch (number) {
		case 2, 3, 4, 5, 6:
			System.out.println("Week Day");
			break;
		case 7, 8:
			System.out.println("Weekend Day");
			break;
		default:
			System.out.println("Invalid Day");
		}
	}
}
