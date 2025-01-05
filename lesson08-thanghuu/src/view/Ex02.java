package view;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Nhap chuoi s: ");
		String s = ip.nextLine();
		
		if (!s.matches("[a-zA-Z\\s]+"))
			return;
		
		String s1 = s.toLowerCase();
		
		String s2 = "";
		
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (i == 0) {
				s2 += (char)(c - 32);
				continue;
			}
			s2 += c;
		}
		
		System.out.println(s2);
	}
}
