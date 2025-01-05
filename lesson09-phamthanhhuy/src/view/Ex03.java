package view;

import java.util.Arrays;

public class Ex03 {
	
	public static void main(String[] args) {
		
		String s = " Welcome    to JAVA10    class ";
		String s1 = s.trim().replaceAll("\\s+", " ");
		System.out.println(s1); 
		
		String[] words = s1.split("\\s");
		System.out.println(Arrays.toString(words));
		
		for(int i = 0; i < words.length; i ++) {
			StringBuilder sb = new StringBuilder(words[i]);
			System.out.print(" " + sb.reverse() + " ");
		}

	}

}
