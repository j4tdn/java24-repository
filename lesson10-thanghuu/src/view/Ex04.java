package view;

import static utils.ArrayUtils.sumOfAnAscii;
import static utils.ArrayUtils.swap;

import java.util.Arrays;

import functional.StringCompFunc;
public class Ex04 {
	
	public static void main(String[] args) {
		
		String[] strings = new String[] {"-2", "-6", "10", null, "4", "8", null, "Special", "a", "c",
			"b", "xx"};
		
		String[] arrClone = new String[strings.length];
		String[] res = new String[strings.length];
		
		int count = 0;
		
		for (int i = 0; i < strings.length; i++) {
			if (strings[i] != null) {
				arrClone[count++] = strings[i];
			}
		}
		
		arrClone = Arrays.copyOf(arrClone, count);
		
		arrClone = sortString(arrClone, (a, b) -> {
			if (isNumber(a) && isNumber(b) && Integer.parseInt(a) > Integer.parseInt(b)) return 1;
			return -1;
		});
		arrClone = sortString(arrClone, (a, b) -> {
			if (!isNumber(a) && !isNumber(b) && sumOfAnAscii(a.getBytes()) > sumOfAnAscii(b.getBytes())) {
				return 1;
			}
			return -1;
		});
		
		System.out.println("Result>>>> " + Arrays.toString(arrClone));
	}
	
	private static boolean isNumber(String str) {
		return str.matches("^-?\\d+$");
	}
	
	private static String[] sortString(String[] str, StringCompFunc scf) {
		for (int i = 0; i < str.length - 1; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (scf.compare(str[i], str[j]) > 0) {
					swap(str, i, j);
				}
			}
		}
		return str;
	}
	
}
