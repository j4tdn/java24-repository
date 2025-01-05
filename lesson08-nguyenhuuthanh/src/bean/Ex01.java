package bean;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập vào một chuỗi ký tự tiếng Việt có dấu : ");
		String input = sc.nextLine();
		
		printCharOneLine(input);
		
	}
	
	public static void printCharOneLine(String input) {
		System.out.println("--> In mỗi ký tự một dòng : ");
		for(char c : input.toCharArray()) {
			System.out.println(c);
		}
//--> Cách 2 :
//		for(int i = 0; i < input.length(); i++) {
//			System.out.println(input.charAt(i));
//		}
	}
	
	public static void printEachWordOneLine(String input) {
		System.out.println("--> In mỗi từ 1 dòng");
		
	}
}
