package view;

import utils.UtilsInput;

public class Ex03 {

	public static void main(String[] args) {
		String str = UtilsInput.getValue("input: ");
		System.out.println("output: " + revert(str));
	}
	
	private static String revert(String s) {
		String[] str = s.split("\\s+");
		// Vấn đề nằm ở đây, khi + chuỗi em nên dùng string mutable như StringBuider, StringBuffer
		// A sửa tạm như dưới
		StringBuilder strReverse = new StringBuilder();
		for (String string : str) {
			strReverse.append(new StringBuilder(string).reverse()).append(" ");
		}
		return strReverse.toString();
	}
	
}
