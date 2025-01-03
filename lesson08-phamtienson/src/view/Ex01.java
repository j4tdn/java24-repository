package view;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Nhập chuỗi: ");
		String input = ip.nextLine();
		
		System.out.println("\n Mỗi ký tự trên một dòng:");
		for (int i=0; i<input.length(); i++) {
			System.out.println(input.charAt(i));
		}
		
		System.out.println("\n Mỗi từ trên một dòng:");
		String[] words = input.split("\\s+");
		for (String word : words) {
			System.out.println(word);
		}
		 System.out.println("\n Chuỗi đảo ngược theo ký tự:");
		 String reverseStringByChar = new StringBuilder(input).reverse().toString();
		 System.out.println(reverseStringByChar);
		 
		 System.out.println("\nChuỗi đảo ngược theo từ: ");
		 StringBuilder reverseStringByWord = new StringBuilder();
		 for (int i = words.length - 1; i>=0; i--) {
			 reverseStringByWord.append(words[i]).append(" ");
		 }
		 System.out.println(reverseStringByWord.toString().trim());
		 ip.close();
	}
	

}
