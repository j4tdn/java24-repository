package view;

import utils.BindingInputUtils;

public class Ex07 {
	private static String convertHexToBin(int n) {
		String res = "";
		if (n == 0)
			res = "0";
		while (n != 0) {
			int mod = n % 2;
			n /= 2;
			res = String.valueOf(mod) + res;
		}
		return res;
	}

	public static void main(String[] args) {
		Integer n = BindingInputUtils.bindingInput();
		if (n != null)
			System.out.println(convertHexToBin(n));
		else
			System.out.println("Vui long thu lai sau!!");
	}
}
