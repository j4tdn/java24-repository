package view;

import java.util.Scanner;

import exception.DivisionBy0Error;

public class Ex01Equation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a, b;

		while (true) {
			try {
				System.out.print("Enter a: ");
				a = Double.parseDouble(sc.nextLine());

				System.out.print("Enter b: ");
				b = Double.parseDouble(sc.nextLine());
				
				
				System.out.println("Solution of equation: " + solveEquation(a, b));
				break;
			} catch (NumberFormatException nfe) {
				System.out.println("Error: " + nfe.getMessage() + "\n");
			} catch (DivisionBy0Error ae) {
				System.out.println("Error: " + ae.getMessage() + "\n");
			}
		}
	}

	private static double solveEquation(double a, double b) throws DivisionBy0Error {
		
		if (a == 0) {
			throw new DivisionBy0Error("The coefficient a must be different from 0");
		}
		
		if (b == 0) {
			return 0;
		}
		
		return -b / a;
	}

}
