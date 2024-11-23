package view;

import java.util.Scanner;

public class Ex01Equation {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = 0;
		double b = 0;
		boolean isInput = false;
		
		while(!isInput) {
			try {
			System.out.println("Nhập hệ số a = ");
			String input = scanner.nextLine();
			a = Double.parseDouble(input);
			
			if (a == 0) {
				System.out.println("Lỗi. Nhập lại số a khác 0!");
				continue;
			}
			isInput = true;
			} catch (NumberFormatException e) {
				System.out.println(" Vui lòng nhập lại!");
			}
		
		}
		isInput = false;
		while(!isInput) {
			try {
				System.out.println("Nhập hệ số b = ");
				String input = scanner.nextLine();
				b = Double.parseDouble(input);
				isInput = true;
			} catch (NumberFormatException e) {
				System.out.println("Vui lòng nhập lại!");
				
			}
			
		}
		double x = -b/a;
		System.out.println("Nghiệm của phương trình là x = " + x);
		scanner.close();
		
	}

}
