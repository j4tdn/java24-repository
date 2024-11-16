package view;

import utils.IoUtils;

public class Ex06MinMax {

	public static void main(String[] args) {

		int a = IoUtils.inputNumber(0, 20, 10, "Nhập số nguyên a nhỏ hơn 20 ");
		int b = IoUtils.inputNumber(0, 20, 10, "Nhập số nguyên b nhỏ hơn 20 ");
		int c = IoUtils.inputNumber(0, 20, 10, "Nhập số nguyên c nhỏ hơn 20 ");

		System.out.println("Số lớn nhất là " + Math.max(a, Math.max(b, c)));
		System.out.println("Số lớn nhất là " + Math.min(a, Math.min(b, c)));
	}
}