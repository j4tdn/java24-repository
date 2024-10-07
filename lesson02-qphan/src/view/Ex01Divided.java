package view;

import java.util.Scanner;

import utils.IoUtils;

public class Ex01Divided {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		int n = IoUtils.inputNumber(8, 5, "Nhập N(>8)");
		
		if (n % 2 == 0) {
			System.out.println(n + " là bội của 2 ...");
		}
		
		System.out.println("*** Kết thúc chương trình ***");
		
		ip.close();
	}
	
	
	
}
