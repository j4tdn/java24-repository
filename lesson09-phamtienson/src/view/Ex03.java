package view;

import java.util.Scanner;

public class Ex03 {
	public static String revert(String s) {
	String trimed = s.trim();
	String[] words = trimed.split("\\s+");
	StringBuilder cleaned = new StringBuilder();
	for (int i = 0; i < words.length; i++) {
		cleaned.append(words[i]);
		if (i<words.length-1) {
			cleaned.append(" ");
		}
	}
	return cleaned.reverse().toString();
	}
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Nhập chuỗi kí tự: ");
		
		String input = ip.nextLine();
		String resulf = revert(input);
		
		System.out.println("Chuỗi sau khi xử lý là: "+resulf);
		ip.close();
		
		
	}
}
