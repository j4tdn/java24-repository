package view;

import utils.BindingInputUtils;

public class Ex05 {
	private static int reverseNumber(int n) {
		int a = 0;
		while (n != 0) {
			int res = n % 10;
			n /= 10;
			a = a * 10 + res;
		}
		return a;
	}

	public static void main(String[] args) {
		Integer n = BindingInputUtils.bindingInput(2);
		if (n != null)
			if (n == reverseNumber(n))
				System.out.println("True");
			else
				System.out.println("False");
		else
			System.out.println("Vui long thu lai sau!!");
	}
}
