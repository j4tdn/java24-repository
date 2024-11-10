package view.test01;

import java.util.Arrays;

public class Ex03ValidNumber {
	
	public static void main(String[] args) {
		String s = "888uuu$%^&u12yk3nn456u777x----o987 ";
		System.out.println("Số hợp lệ lớn nhất --> " + findMaxValidNumber(s));
	
		
		String[] nbrAsStrings = s.split("[^\\d]+");
		
		System.out.println("Cắt chuỗi --> " + Arrays.toString(nbrAsStrings));
		
	}
	
	private static int findMaxValidNumber(String s) {
		int max = Integer.MIN_VALUE;
		int current = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			if (!Character.isDigit(letter)) {
				continue;
			}
			current = current * 10 + Integer.parseInt("" + letter);
			
			// đổi logic
			// nếu ptu hiện tại là kí tự
			// nếu trước đó là số --> mới so sánh
			
			if (i == s.length() - 1) {
				if (max < current) {
					max = current;
				}
				break;
			}
			
			char nextLetter = s.charAt(i+1);
			
			if (Character.isDigit(nextLetter)) {
				continue;
			}
			
			if (max < current) {
				max = current;
			}
			
			current = 0;
		}
		return max;
	}
	
}
