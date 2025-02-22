package exercise;

import java.util.Arrays;

import functional.SplitTest;

public class Ex04 {
	public static void main(String[] args) {
		// Bài này em chưa làm xong, em sẽ cập nhật sau ạ 
		String[] strings = {"-2", "-6", "10", null, "4", "8", null, "Special", "a", "c",
				"b", "xx"};
		int count = 0;
		String[] otherStr = new 
		for (String str: strings) {
			if (str.matches)
		}
		/*
		 * String[] numbers = splitElement(strings, numberTest);
		 * //System.out.println(Arrays.toString(numbers)); String[] specials =
		 * splitElement(strings, str -> str.toLowerCase().equals("special"));
		 * System.out.println(Arrays.toString(specials));
		 */
		
		System.out.println(Arrays.toString(splitNumStr(strings)));
	}
	
	public static String[] splitNumStr(String[] strings) {
		String[] numStr = new String[strings.length];
		int count = 0;
		for (String str: strings) {
			if (str.matches("\\d+")) {
				numStr[count++] = str;
			}
		}
		return Arrays.copyOfRange(numStr, 0, count);
	}
	
	public static String[] splitSpecial(String[] strings) {
		String[] specialStr = new String[strings.length];
		int count = 0;
		for (String str: strings) {
			if (str.toLowerCase().equals("special")) {
				specialStr[count++] = str;
			}
		}
		return Arrays.copyOfRange(specialStr, 0, count);
	}
	
	public static String[] splitElement(String[] strings, SplitTest splitTest) {
		String[] target = new String[strings.length];
		int count = 0;
		for (int i = 0; i < strings.length; i++) {
			if (splitTest.test(strings[i])) {
				target[count++] = strings[i];
			}
		}
		return Arrays.copyOfRange(target, 0, count);
	}
	
}
