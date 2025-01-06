package exercise;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Mời bạn nhập số bất kỳ : ");
		int n = Integer.parseInt(ip.nextLine());
		int number = 1;
		for(int i = 1;i <= n ; i ++) {
			number = number * i;
			
		}
		
		
		
		
		
		
		System.out.println(number);
	}

}
