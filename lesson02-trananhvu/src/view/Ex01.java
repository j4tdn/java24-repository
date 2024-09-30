package view;

import utils.BindingInputUtils;

public class Ex01 {
	private static boolean isMultiples(int n) {
		if (n % 2 == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Integer n = BindingInputUtils.bindingInput();
		if (n != null)
			System.out.println(isMultiples(n));
		else
			System.out.println("Vui long thu lai sau!!");
	}
}
