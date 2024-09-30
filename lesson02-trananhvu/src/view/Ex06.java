package view;

import utils.BindingInputUtils;

public class Ex06 {
	private static void findMinAndMax(int a, int b, int c) {
		int min = a < b ? a < c ? a : c : b < c ? b : c;
		int max = a > b ? a > c ? a : c : b > c ? b : c;
		System.out.println("So lon nhat la: " + max);
		System.out.println("So be nhat la: " + min);
	}

	public static void main(String[] args) {
		int min = 0, max = 20;
		Integer a = BindingInputUtils.bindingInput("Nhap a: ", min, max);
		Integer b = BindingInputUtils.bindingInput("Nhap b: ", min, max);
		Integer c = BindingInputUtils.bindingInput("Nhap c: ", min, max);
		if (a != null && b != null && c != null)
			findMinAndMax(a, b, c);
		else
			System.out.println("Vui long thu lai sau!!");
	}
}
