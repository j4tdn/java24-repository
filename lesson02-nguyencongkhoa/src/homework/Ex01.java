package homework;

import view.Utilities;

public class Ex01 {

	public static void main(String[] args) {

		int number = Utilities.inputInt();
		if (number == -1) {
			System.out.println("\nĐã hết lượt nhập (tối đa 5 lần)");
			return;
		}
		if (number % 2 == 0) {
			System.out.println(true);
		} else {
			System.out.println("false");
		}

	}

}
