package view;

import utils.UtilsInput;

public class Ex03 {

	public static void main(String[] args) {
		String str = UtilsInput.getValue("input: ");
		System.out.println("output: " + revert(str));
	}
	
	private static String revert(String s) {
		String[] str = s.split("\\s+");
		String strReverse = "";
		for (String string : str) {
			StringBuilder sb = new StringBuilder(string);
			sb.reverse();
			strReverse += sb.toString() + " ";
		}
		return strReverse.strip();
	}
	
}
