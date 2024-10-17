package utils;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class StringUtils {

	public static String removeAccent(String s) {

		String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");

		return pattern.matcher(temp).replaceAll("").replaceAll("đ", "d").replaceAll("Đ", "D").toLowerCase();

	}

	static String[] result = new String[10];

	public static int commonHobby(String[] hb1, String[] hb2) {

		int count = 0;
		for (String h1 : hb1) {
			for (String h2 : hb2) {
				if (removeAccent(h1).equals(removeAccent(h2))) {
					result[count] = h1;
					count++;
				}
			}
		}
		return count;
	}

	public static void printCommonHobby() {
		for (String a : result) {
			if (a != null) {
				System.out.printf("| %s ", a);
			}
		}
	}
}
