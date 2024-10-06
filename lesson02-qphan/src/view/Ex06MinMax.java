package view;

import utils.IoUtils;

public class Ex06MinMax {
	
	public static void main(String[] args) {
		int a = IoUtils.inputNumber(-1, 20, 5, "Nhập a[0, 20)");
		int b = IoUtils.inputNumber(-1, 20, 5, "Nhập b[0, 20)");
		int c = IoUtils.inputNumber(-1, 20, 5, "Nhập c[0, 20)");
		System.out.println("max(a, b, c) --> " + Math.max(a, Math.max(b, c)));
	}
}
