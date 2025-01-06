package view;

import java.util.Arrays;

public class Ex03ReverseStr {
	public static void main(String[] args) {
		String s1 = "Welcome    to   JAVA10    class";
		reverseString(s1);
	}
	
	public static void reverseString(String string) {
		StringBuilder reverse = new StringBuilder();
		String str = string.trim();
		str = str.strip().replaceAll("[^a-zA-Z0-9]+", " ");
		System.out.println("Xoa khoang trang --> " + str);
		String[] words = str.split("\\s");
		for(String word : words) {
			StringBuilder rever = new StringBuilder(word).reverse();
			
		}
		System.out.println("zz --> " + Arrays.toString(words));
		
		
	}
}
