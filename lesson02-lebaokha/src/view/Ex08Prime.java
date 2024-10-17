package view;

import utils.IoUtils;
import utils.NumbersUtils;

public class Ex08Prime {

	public static void main(String[] args) {
		int n = IoUtils.inputNumber(0, 5, "Nhập n");

		System.out.println("Kiểm tra số nguyên tốt --> " + NumbersUtils.isPrime(n));
	}
}
