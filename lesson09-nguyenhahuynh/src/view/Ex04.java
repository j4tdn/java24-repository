package view;

public class Ex04 {

	public static void main(String[] args) {
		
		String s = "xyz";
		
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			String s2 = s.substring(0, i) + s.substring(i + 1);
		}
	}
}
