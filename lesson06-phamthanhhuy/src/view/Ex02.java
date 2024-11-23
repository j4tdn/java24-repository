package view;

import java.io.IOException;
import java.util.Scanner;

import utils.PasswordCheck;

public class Ex02 {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		String pass = "";

		System.out.print("Nhập mk: ");

		do {
			try {
				pass = ip.nextLine();
				PasswordCheck.passCheck(pass);
				break;
			} catch (IOException e) {
				e.printStackTrace();
				System.out.print("Nhập lại mk: ");
			}
		} while (true);
		 
		System.out.println("mk" + pass);

	}

}
