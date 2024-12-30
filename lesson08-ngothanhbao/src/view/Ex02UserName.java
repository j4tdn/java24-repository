package view;

import java.util.Scanner;

import exception.NameIllegalException;

public class Ex02UserName {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String name;
		do {
			try {
				System.out.print("Nhập tên: ");
				name = ip.nextLine();
				nameReq(name);
				break;
			} catch (NameIllegalException nie) {
				System.out.println(nie.getMessage());
			}
		} while(true);
		name = name.strip().replaceAll("[^a-zA-Z0-9]+"," ");
		
		System.out.println("Tên: " + upperCaseName(name));
		
		ip.close();
	}
	
	public static void nameReq(String str) throws NameIllegalException {
		if(!str.matches("[a-zA-Z\\s]+")) {
			throw new NameIllegalException("Ten khong hop le!!!");
		}
	}
	
	public static String upperCaseName(String str) {
		String[] words = str.split("\\s");
		StringBuilder res = new StringBuilder();
		for(String word:words) {
			res.append(word.substring(0, 1).toUpperCase()).append(word.substring(1).toLowerCase()).append(" ");
		}
		return res.toString().strip();
	}
	
	
	
	
}
