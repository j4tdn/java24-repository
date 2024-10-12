package datastructurehomework;

import java.util.Scanner;

public class Ex03Factorial {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập số nguyên N");
		int number = ip.nextInt();
		
		long factorial = factorial(number);
		
		System.out.println(number + "!" + " = " + factorial);
	}

	public static int factorial(int num) {
		int result = num;		
		while (num > 1) {
			result = result * --num;
		}
		return result;
	}
}

//Cách 2: Tham khảo cách đệ quy
//public class Ex03Factorial {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Nhập số nguyên dương n: ");
//		int n = scanner.nextInt();
//
//		long giaiThua = tinhGiaiThua(n);
//
//		System.out.println(n + "! = " + giaiThua);
//	}
//
//	public static long tinhGiaiThua(int n) {
//		if (n == 0) {
//			return 1; // Theo quy ước, 0! = 1
//		} else {
//			return n * tinhGiaiThua(n - 1); // Sử dụng đệ quy
//		}
//	}
//}
