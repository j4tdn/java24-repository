package view;

import java.util.Arrays;

public class Ex03 {
	
	public static void main(String[] args) {
		
		String original = "Welcome  to JAVA10  class";
		
		String[] words = original.split("\\s+");
		
		System.out.println(Arrays.toString(words));
		
		// Kết quả tốt
		// Nhưng bài này a expect mọi người dùng StringBuilder đó em
		for (String word: words) {
			word =  revert(word);
			System.out.print(word + " ");
			 
		}
		
		
	}
	private static String revert(String s) {
		String reverted = "";
		for (int i = 0; i<s.length(); i++) {
			char letter = s.charAt(i);
			reverted = letter + reverted;
		}
		return reverted;
	}
	
	
	

}
