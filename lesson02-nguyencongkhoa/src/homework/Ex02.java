package homework;

import view.Utilities;

public class Ex02 {

	public static void main(String[] args) {
		int number = Utilities.inputInt();
		int res = 0;

		if (number == -1) {
			System.out.println("\nĐã hết lượt nhập (tối đa 5 lần)");
			return;
		}

		while (number > 0) {
			if (number % 2 == 0) {
				res = number / 2;
			} else {
				break;
			}
			number /= 2;
		}
		
		if (res == 1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
