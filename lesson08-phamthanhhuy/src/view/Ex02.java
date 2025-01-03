package view;

import java.util.Scanner;

public class Ex02 {
	
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Nhập họ và tên: ");
		String name = ip.nextLine();

		String[] words = name.split("\\s+");
		for (int i = 0; i < words.length; i++) {
			String s = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
			name = name.replace(words[i], s);
		}
		System.out.println("Tên của bạn: " + name);

	}

}
