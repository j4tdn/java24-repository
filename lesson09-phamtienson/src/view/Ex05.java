package view;

import java.util.HashSet;
import java.util.Scanner;

public class Ex05 {
	public static int sumSquare (int num) {
		int sum = 0;
		while (num>0) {
			int digit = num % 10;
			sum +=digit *digit;
			num/=10;
		}
		return sum;
		
	}
	
	public static boolean happyNumber(int num) {
		
		// Kết quả đúng
		// Mà HashSet a chưa hướng dẫn, em giải thích sơ giúp a hi
		HashSet<Integer> seen = new HashSet<>();
		
		while (num != 1 && !seen.contains(num)) {
			seen.add(num);
			num = sumSquare(num);
		}
		return num == 1;
	}
	
	public static void main(String[] args) {
		Scanner ip= new Scanner(System.in);
		System.out.println("Nhập số cần kiểm tra: ");
		int number = ip.nextInt();
		if (happyNumber(number)) {
			System.out.println("Là số hạnh phúc!");
		} else {
			System.out.println("Không phải là số hạnh phúc");
		}
	}

}
