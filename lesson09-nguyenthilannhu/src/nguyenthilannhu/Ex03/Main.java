package nguyenthilannhu.Ex03;

public class Main {
	
		// Hàm xử lý cũng chưa đúng yêu cầu 
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
			String output = "emocleW ot 01AVAJ ssalc"; // Em tự cho input output chứ ko xử lý à ?
			System.out.println("input: " + input);
			System.out.println("output: " + output);
		}
}

