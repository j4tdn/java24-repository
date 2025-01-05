package view;

public class Ex07 {
	
	public static void main(String[] args) {
		String s = "aaabaaabbbbbbbbaaaaaabb";
		 int max = 0, endIndex = 0, startIndex = 0;
		 int count = 1;
		 
		 for (int i = 1; i < s.length(); i++) {
			 if (s.charAt(i) == s.charAt(i - 1)) {
				 count++;
				 if (count > max) {
					 endIndex = i;
					 max = count;
				 }
			 }else {
				count = 1; 
			 }
		 }
		 
		 startIndex = endIndex - max + 1;
		 String res = s.substring(endIndex - max + 1, endIndex + 1);
		 System.out.printf("Do dai lon nhat cua day con dung: %d %s [%d]", max, res, startIndex);
	}
}
