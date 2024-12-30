package view;

import java.util.Arrays;

public class Ex05LongestDupStr {

	public static void main(String[] args) {
		String s1 = "ABCEDEABC";
		String s2 = "ABCEDCBBCK";
		String[] strs = getDupStrs(s1, s2);
		String longest = "";
		for(String str : strs) {
			if(str.length() > longest.length()) {
				longest = str;
			}
		}
		System.out.println("Chuoi trung dai nhat: " + longest);
	}

	public static String[] getDupStrs(String str1, String str2) {
		int n = 0;
		int start = -1;
		if (str1.length() < str2.length()) {
			n = str1.length();
		} else {
			n = str2.length();
		}
		String[] res = new String[n];
		int count = 0;
		String subString = "";
		for (int i = 0; i < n; i++) {

			if (str1.charAt(i) == str2.charAt(i)) {
				if (start == -1) {
					start = i;
				}
				if (i == n - 1) {
					subString = str1.substring(start, n);
					res[count++] = subString;
				}

			} else if (start != -1) {
				subString = str1.substring(start, i);
				res[count++] = subString;
				start = -1;
			}
		}
		return Arrays.copyOfRange(res, 0, count);
	}

}
