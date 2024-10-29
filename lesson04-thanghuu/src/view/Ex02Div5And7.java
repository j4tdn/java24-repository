package view;

import java.util.Random;
import java.util.Scanner;

public class Ex02Div5And7 {

	private static Random rd = new Random();
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		int[] div5;
		int[] div7;
		int[] divBoth;
		int amount;
		int[] array;
		
		System.out.println("Nhap so luong phan tu Input: ");
		amount = Integer.parseInt(ip.nextLine());
		div5 = new int[amount];
		div7 = new int[amount];
		divBoth = new int[amount];
		
		array = ranDom(amount);
		
		int countDiv5 = 0;
		int countDiv7 = 0;
		int countBoth = 0;
		System.out.print("Input: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
			
			if(array[i] % 5 == 0 && array[i] % 35 != 0) {
				div5[countDiv5] = array[i];
				countDiv5++;
			}else if(array[i] % 7 == 0 && array[i] % 35 != 0) {
				div7[countDiv7] = array[i];
				countDiv7++;
			}else {
				divBoth[countBoth] = array[i];
				countBoth++;
			}
				
		}
		
		// Đoạn này em chịu rồi anh ơi :((((
		
		System.out.print("\nOutput: " );
		for(int i =0; i < div7.length; i++) {
			System.out.print(div7[i] + ", ");
		}
		System.out.print("|");
		for(int i =0; i < div5.length; i++) {
			System.out.print(div5[i] + ", ");
		}
		System.out.print("|");
		for(int i =0; i < divBoth.length; i++) {
			System.out.print(divBoth[i] + ", ");
		}
	}
	
	private static int[] ranDom(int amount) {
		int[] array = new int[amount];
		for(int i = 0; i < amount; i++) {
			array[i] = rd.nextInt(5, 101);
		}
		return array;
	}
}
