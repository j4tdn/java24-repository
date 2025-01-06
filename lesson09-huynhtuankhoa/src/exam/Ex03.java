package exam;


public class Ex03 {
	public static void main(String[] args) {
		String input = "Welcome  to JAVA10  class";
		String[] inputs = input.split("[\s]+");
		StringBuilder result = new StringBuilder();
		
		System.out.println(revert(inputs));
		
	}
	
	public static String revert(String[] str) {
		StringBuilder strReversed = new StringBuilder();
		for (String s: str) {
			for (int i = s.length() - 1; i >= 0; i--) {
				strReversed.append(s.charAt(i));
			}
			strReversed.append(" ");
		}
		return strReversed.toString();
	}
}
