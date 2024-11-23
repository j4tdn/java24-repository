package exercise; 

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		
	
//		do {
//			try {
//				System.out.println("Enter number a: ");
//				a = Integer.parseInt(ip.nextLine());
//				
//				System.out.println("Enter number b: ");
//				b = Integer.parseInt(ip.nextLine());
//				
//				break;
//			} catch(NumberFormatException nfe) {
//				System.out.print("Character is invalid. Please enter the number: ");
//			}
//		}while(true);
		
		do {
			try {
				System.out.println("Enter number a: ");
				a = Integer.parseInt(ip.nextLine());
				
				if (a == 0) {
					throw new ArithmeticException("Please enter a != 0 ");
				}
				
				System.out.println("Enter number b: ");
				b = Integer.parseInt(ip.nextLine());
				
				break;
			} catch (ArithmeticException ae) {
				System.out.println(ae.getMessage());
			} catch(NumberFormatException nfe) {
				System.out.println("Character is invalid. Please enter the number again ");
			}
		}while(true);
		
		
		System.out.println("The equation is: " + a +"x" + " + " + b + " =0");
		
		double result = -b/a;
		System.out.println("x = " + result);
		
		ip.close();
	}
	
}
