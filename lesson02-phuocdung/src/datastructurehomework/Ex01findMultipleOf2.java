package datastructurehomework;

import java.util.Scanner;

public class Ex01findMultipleOf2 {
	
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập số nguyên N");	
			
		
	for(int i = 0; i < 5; i++) {
		String number = ip.nextLine();	
		if(isAllDigits(number)) {
			long targetNumber = Long.parseLong(number);
			if(targetNumber > 0) {
				if(targetNumber % 2 == 0) {
					System.out.println(targetNumber + " là bội của 2");
				} else {
					System.out.println(targetNumber + " không phải là bội của 2");
				}			
			}
		} else {
			System.out.println("Không hợp lệ hãy nhập lại");
		}
	}
}
	public static boolean isAllDigits(String str) {
	    for (char ch : str.toCharArray()) {
	        if (!Character.isDigit(ch)) {
	        	return false;
	        }
	    }
	    return true;
	}

}
