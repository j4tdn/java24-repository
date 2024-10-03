package utils;

import java.util.Scanner;

public class BindingInputUtils {
	private static int n;

	public static Integer bindingInput() {
		Scanner ip = new Scanner(System.in);
		int count = 5;
		do {
			try {
				System.out.print("Nhap N: ");
				n = Integer.parseInt(ip.next());
				if (n < 0)
					throw new Exception();
				return n;
			} catch (Exception e) {
				System.out.println("Vui long nhap lai!!");
				count--;
				continue;
			}
		} while (count > 0);
		ip.close();
		return null;
	}

	public static Integer bindingInput(int bindingLength) {
		Scanner ip = new Scanner(System.in);
		int count = 5;
		do {
			try {
				System.out.print("Nhap N: ");
				n = Integer.parseInt(ip.next());
				if (n < 0)
					throw new Exception();
				if (Integer.toString(n).length() < bindingLength)
					throw new Exception();
				return n;
			} catch (Exception e) {
				System.out.println("Vui long nhap lai!!");
				count--;
				continue;
			}
		} while (count > 0);
		ip.close();
		return null;
	}

	public static Integer bindingInput(String mess, int min, int max) {
		Scanner ip = new Scanner(System.in);
		int count = 5;
		do {
			try {
				System.out.print(mess);
				n = Integer.parseInt(ip.next());
				if (n < 0)
					throw new Exception();
				if (n < min || n >= max)
					throw new Exception();
				return n;
			} catch (Exception e) {
				System.out.println("Vui long nhap lai!!");
				count--;
				continue;
			}
		} while (count > 0);
		ip.close();
		return null;
	}

}
