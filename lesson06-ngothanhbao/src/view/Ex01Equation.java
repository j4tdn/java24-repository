package view;

import java.util.Scanner;

public class Ex01Equation {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		double a, b;

		System.out.print("Nhap b: ");
		b = Double.parseDouble(ip.nextLine());

		do {
			try {
				System.out.print("Nhap a: ");
				a = Double.parseDouble(ip.nextLine());
				System.out.println("GT ---> " + Equation(a, b));
				break;
			} catch (NumberFormatException nfe) {
				System.out.println("Nhap a la so !!!");
			} catch (ArithmeticException ae) {
				System.out.println(ae.getMessage());
			}

		} while (true);
		ip.close();
	}

	public static double Equation(double a, double b) {
		double x;

		if (a == 0) {
			throw new ArithmeticException("Nhap a != 0 !!!");
		} else {
			x = -b / a;
		}

		return x;
	}

}
