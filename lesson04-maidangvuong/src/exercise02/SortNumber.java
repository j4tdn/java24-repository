package exercise02;

import java.util.Scanner;

public class SortNumber {
	
	public static void main(String[] args) {
		 
		
		Scanner ip = new Scanner(System.in);
		
		int[] number = new int[10];
		for (int i = 0; i < number.length; i++) {
			System.out.println("Enter the " + (i+1)+ "th number");
		 number[i] = Integer.parseInt(ip.nextLine());
		
		}
		
		System.out.println("input: ");
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + "  ");
		} 
		
		ip.close();
		
		int[] result = new int[10];
		int count = 0;
						
		for (int i = 0; i < number.length; i++) {
			if(number[i] % 7 == 0 && number[i] % 5 !=0) {
				result[count++] = number[i];
			}
		}
		
		for (int i = 0; i < number.length; i++) {
			if(number[i] % 7 == 0 && number[i] % 5 == 0) {
				result[count++] = number[i];
			}
		}
		for (int i = 0; i < number.length; i++) {
			if(number[i] % 7 != 0 && number[i] % 5 != 0) {
				result[count++] = number[i];
			}
		}
		
		for (int i = 0; i < number.length; i++) {
			if(number[i] % 5 == 0 && number[i] % 7 != 0) {
				result[count++] = number[i];
			}
		}
		
		System.out.println("Output: ");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " , ");
		}
  }
}
