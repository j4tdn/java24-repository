package view;

import java.io.IOException;
import java.util.Scanner;

import utils.ValidEmailFormat;

public class Ex03 {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);

		String pre = "";

		System.out.print("Nhập prefix email: ");

		do {
			try {
				pre = ip.nextLine();
				ValidEmailFormat.validPrefix(pre);
				break;
			} catch (IOException e) {
				e.printStackTrace();
				System.out.print("Nhập lại mk: ");
			}
		} while (true);

		System.out.println("Email của bạn: " + pre +"@mail.com");

	}


}
