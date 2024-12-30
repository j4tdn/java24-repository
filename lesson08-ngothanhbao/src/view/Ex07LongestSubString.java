package view;

import java.util.Arrays;

public class Ex07LongestSubString {
	public static void main(String[] args) {
		String s1 = "aaabaaabbaaaaa";
		String[] subStrings = findSubString(s1);
		System.out.println("Chuoi con ngan nhat: " + shortestSubString(subStrings));
		System.out.println("Chuoi con dai nhat: " + longestSubString(subStrings));
	}
	
	public static String[] findSubString(String str) {
		String[] res = new String[str.length()];
		int count = 0;
		int start = 0;
		for(int i = 0;i < str.length() - 1;i++) {
			if(str.charAt(i) != str.charAt(i+1)) {
				String subString = str.substring(start,i+1);
				res[count++] = subString;
				start = i + 1	;
			}
		}
		String subString = str.substring(start);
		res[count++] = subString;
		return Arrays.copyOfRange(res, 0, count);
	}
	
	public static String shortestSubString(String[] strs) {
		String shortest = "aaaaaaaaaaaaaaaaaaaaaaaaa";
		for(String str:strs) {
			if(str.length() < shortest.length()) {
				shortest = str;
			}
		}
		return shortest;
	}
	public static String longestSubString(String[] strs) {
		String longest = "";
		for(String str:strs) {
			if(str.length() > longest.length()) {
				longest = str;
			}
		}
		return longest;
	}
}
