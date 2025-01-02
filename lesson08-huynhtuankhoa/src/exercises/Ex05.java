package exercises;

public class Ex05 {
	public static void main(String[] args) {
		System.out.println(findLCS("SDABCDTU", "TUESABCD"));
	}
	
	public static String findLCS(String s1, String s2) {
		
		StringBuilder result = new StringBuilder();
		for (int i = 1; i <= s1.length(); i++) {
			
			char c = s1.charAt(i - 1);
			int s2index = 1;
			
			while (s2index - 1 < s2.length() && s2.charAt(s2index - 1) != c) {
				s2index ++;
			}
			System.out.println(s2index);
			
			
			if (s2.charAt(s2index - 1) == c) {
				if (s2index >= s2.length()) {
					result.append(s2.charAt(s2index - 1));
				} else {
					if (s2.charAt(s2index) == s1.charAt(i)) {
						result.append(c);
					}
				}
			}
			System.out.println(result);
			
		}
		return result.toString();
	}
}
