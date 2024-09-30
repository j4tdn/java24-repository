package controlling;

import java.util.Random;

public class Ex03SwitchCase {

	public static void main(String[] args) {

		/*
		 * use switch case de lam gon code khi bt IF ELSE compare =
		 */

		Random rand = new Random();
		int number = rand.nextInt(1, 10);
		System.out.println("number --> " + number + "\n");

		/*
		 * neu nhu switch case dung ma ko co break bo qua check cac case con lai ma nhay
		 * vao luon code ben trong case thuc thi stop: break || xong het default
		 */
		switch (number) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		default:
			System.out.println("Invalid");
			// break;
		}

		System.out.println("\n========================\n");

		switch (number) {
		case 2, 3, 4, 5, 6:
			System.out.println("Week Day");
			break;
		case 1, 7:
			System.out.println("Weekend Day");
			break;
		default:
			System.out.println("Invalid");
		}
	}

}
