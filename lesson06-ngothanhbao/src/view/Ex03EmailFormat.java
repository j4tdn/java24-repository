package view;

import java.util.Scanner;

import exception.PrefixEmailException;

public class Ex03EmailFormat {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String prefix;
		do {
			try {
				System.out.print("Nhap email: ");
				prefix = ip.nextLine();
				createEmail(prefix);
				System.out.println("Email hop le !");
				break;
			} catch (PrefixEmailException pee) {
				System.out.println(pee.getMessage());
			}
		} while (true);
		
		ip.close();
		
	}

	public static void createEmail(String prefix) throws PrefixEmailException {
		if (!prefix.matches("[a-zA-Z0-9_-]+(\\._[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)")) {
			throw new PrefixEmailException("Nhap email khong dung voi yeu cau, vui long nhap lai !!!");
		}

	}
	
}
