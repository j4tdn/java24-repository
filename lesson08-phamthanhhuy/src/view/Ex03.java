package view;

import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.Scanner;

public class Ex03 {
	
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Nhập chuỗi: ");
		String s = ip.nextLine();
		
		System.out.println("Chuỗi vừa nhập: " + s);
		
		String rmMark = Normalizer.normalize(s, Form.NFD);

		System.out.println("Output: " + rmMark.replaceAll("\\p{M}+", ""));
	}

}
