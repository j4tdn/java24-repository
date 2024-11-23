package view;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("Giải phương trình bậc nhất ax + b = 0");
		Scanner scanner = new Scanner(System.in);
		double a =0;
		double b =0;
		while(true) {
			try {
				System.out.print("Vui lòng nhập số a : ");
				a=Double.parseDouble(scanner.nextLine());
				System.out.print("Vui lòng nhập số b :");
				b=Double.parseDouble(scanner.nextLine());
				if(a == 0) {
					 throw new ArithmeticException("Hệ số a không được bằng 0 ");
				}
				break;
			} catch (NumberFormatException  e) {
				 System.out.println("Lỗi: Vui lòng nhập số hợp lệ!");
			}catch(ArithmeticException ar) {
				System.out.println("Lỗi:" + ar.getMessage());
			}
		}
		double result = -b/a;
		System.out.println("Nghiệm của pt là "+ result);
	}
}
