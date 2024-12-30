package view;

import utils.UtilsInput;

public class Ex06FindIndexOfNaturalNumber {

	public static void main(String[] args) {
		String strNum = "";
		while (true) {
			strNum = UtilsInput.getValue("Enter the natural number series: ");
			if (!containsLetter(strNum)) {
				break;
			}
		}
		if (strNum.length() < 100) {
			System.out.println("The sequence of natural numbers does not contain 100 numbers. 100th position could not be determined");
		} else {
			System.out.println("The 100th position of the natural number sequence is: " + strNum.charAt(99));
		}
	}
	
	private static boolean containsLetter(String str) {
		for (char c : str.toCharArray()) {
			if (Character.isLetter(c)) {
				return true;
			}
		}
		return false;
	}
	
}
