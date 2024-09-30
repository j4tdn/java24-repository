package view;

import utils.BindingInputUtils;

public class Ex02 {
	private static boolean isExponentialOfTwo(float n) {
		if (n == 1)
			return true;
		else if (n == 0)
			return false;
		while (n > 2)
			n /= 2;
		if (n % 2 == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Integer n = BindingInputUtils.bindingInput();
		if (n != null)
			System.out.println(isExponentialOfTwo(n));
		else
			System.out.println("Vui long thu lai sau!!");
	}
}
