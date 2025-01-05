package view;

import utils.UtilsInput;
import static java.lang.Math.*;

public class Ex05 {

	public static void main(String[] args) {
		int num = UtilsInput.inputInt("Nhập số cần kiểm tra: ");
		if (num == 0) {
			System.out.println("0 là số hạnh phúc");
			return;
		}
		isHappyNumber(num);
	}

	private static void isHappyNumber(int n) {
		int res = n;
		int sum = 0;
		while (n > 0) {
			sum = getSquareNum(n);
			if (sum > 10) {
				n = sum;
			} else if (sum >= 2 && sum <= 9) {
				System.out.println(res + " không phải số hạnh phúc!!");
				return;

			} else {
				System.out.println(res + " là số hạnh phúc");
				return;
			}
		}
	}

	private static int getSquareNum(int n) {
		int sum = 0;
		while (n > 0) {
			sum += pow(n % 10, 2);
			n /= 10;
		}
		return sum;
	}
}
