package nguyenthilannhu.Ex03;

public class Main {
	
         public static String revert(String s) {
        	 if (s == null || s.isEmpty()) {
        		 return "";
        	 }
			
			s = s.trim().replaceAll("\\s+", " ");
			
			StringBuilder reversed = new StringBuilder(s);
			return reversed.reverse().toString();
			
         }
         public static void main(String[] args) {
			String input = "Welcome to java10 class";
			String output = "emocleW ot 01AVAJ ssalc";
			System.out.println("input: " + input);
			System.out.println("output: " + output);
		}
}

