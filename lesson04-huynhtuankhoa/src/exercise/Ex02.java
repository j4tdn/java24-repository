package exercise;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String start = "";
		String mid = "";
		String end = "";
		
		System.out.println("Enter number string: ");
		
		String[] input = (sc.nextLine()).split(", ");
		
		for (String str: input) {
			int num = Integer.parseInt(str);
			if (num % 7 == 0 && num % 5 != 0) {
				
				start += str + ',';
			} else if (num % 5 == 0 && num % 7 != 0) {
				end += str + ',';
			} else {
				mid += str + ',';
			}
		}

		System.out.println(start.substring(0, start.length() - 1) + "|" + 
					       mid.substring(0, mid.length() - 1) + "|" + 
				           end.substring(0, end.length() - 1));
	}
}
