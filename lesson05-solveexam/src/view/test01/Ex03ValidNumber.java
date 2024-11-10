package view.test01;

public class Ex03ValidNumber {
	
	public static void main(String[] args) {
		String s = "Uyk892nn1234uxo2";
		
		System.out.println("So hop le lon nhat --> " + findMaxValidNumber(s));
	}
	
	private static int findMaxValidNumber(String s) {
		int max = Integer.MIN_VALUE;
		int current = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
				if(!Character.isDigit(letter)) {
					continue;
				}
				current = current * 10 + Integer.parseInt("" + letter);
				
				if (i == s.length() - 1) {
					if (max < current) {
						max = current;
					}
					break;
				}
				
				char nextLetter = s.charAt(i + 1);
				
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

	

