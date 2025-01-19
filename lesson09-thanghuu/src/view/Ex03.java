package view;

public class Ex03 {

	private static void reverseString(String s) {
		for (int i = s.length() - 1; i >=0; i--) {
			System.out.print(s.charAt(i));
		}
	}
	
	// Hmm chưa được
	public static void main(String[] args) {
		String s = "Welcome      to JAVA10 class";
		
		for(int i = 0; i < s.length(); i++) {
			
//			if(s.charAt(i) == " ") {
//				
//			}
		}
		
		String[] s1 = s.split(" ");
		for(String s2 : s1)
			reverseString(s2);
		

		
	}
}
