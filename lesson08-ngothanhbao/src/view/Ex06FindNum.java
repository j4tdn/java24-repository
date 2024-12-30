package view;

import java.util.Scanner;

public class Ex06FindNum {

	public static void main(String[] args) {
		String num = "6268818387474782";
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập thứ K: ");
		int k = Integer.parseInt(ip.nextLine());

		System.out.println("Gia tri o vi tri K: " + num.charAt(k));

		ip.close();
	}

}
