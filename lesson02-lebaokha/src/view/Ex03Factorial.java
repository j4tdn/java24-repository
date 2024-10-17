package view;

import static utils.NumbersUtils.*;

import utils.IoUtils;

public class Ex03Factorial {

	public static void main(String[] args) {
		int n = IoUtils.inputNumber(0, 1, "Nhập N");

		System.out.println(n + "! = " + fact(n));
	}

}
