package view;

import utils.IoUtils;
import static java.lang.Math.*; // import tất cả các static method, attribute của class Math

public class Ex02Power {

	public static void main(String[] args) {
		int n = IoUtils.inputNumber(0, 5, "Nhập N");

		System.out.println(isPowerOf2(n));
	}

	/*
	 * N là lũy thừa của 2 khi x^2 = n Với x là 1 số nguyên x => x = log(n)/log(2)
	 * Ktra nếu x là số nguyên ==> n là lũy thừa của 2
	 * 
	 * Math là 1 class
	 * 
	 * log, ceil, floor: static method Thay vì lấy Math.log, Math.ceil, Math.floor
	 * --> import static cho class Math, sau đó dùng trực tiếp các hàm static log,
	 * ceil, floor
	 */
	private static boolean isPowerOf2(int n) {
		double x = log(n) / log(2);

		System.out.println("Số mũ --> " + x);

		return ceil(x) == floor(x);

	}
}
