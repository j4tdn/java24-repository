package view;

public class Ex03 {
	
	public static void main(String[] args) {
		String s = "Welcome to JAVA10 class";
		System.out.println("Đảo chuỗi: " + reverseWords(s));
	}
	
	private static String reverseWords(String s) {
		StringBuilder result = new StringBuilder();

		String[] tokens = s.strip().split("\\s+");
		for(String token: tokens) {
			result.append(new StringBuilder(token).reverse()).append(" ");
		}
		
		return result.toString().strip();
	}
	
}
