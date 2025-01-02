package exercises;

public class Ex07 {
	public static void main(String[] args) {
        String S = "aaabaaabbaaaaa";
        findSubstring(S);
    }

    public static void findSubstring(String s) {
    	
        int maxLength = 1, minLength = s.length();
        int curLength = 1;
        int maxStart = 0, minStart = 0, temp = 0;

        for (int i = 1; i <= s.length(); i++) {
        	char c1 = s.charAt(i);
        	char c2 = s.charAt(i - 1);
        	
            if (i < s.length() && c1 == c2) {
            	curLength++;
            } else {
                if (curLength > maxLength) {
                    maxLength = curLength;
                    maxStart = temp;
                }
                if (curLength < minLength) {
                    minLength = curLength;
                    minStart = temp;
                }
                
                curLength = 1;
                temp = i;
            }
        }

        System.out.println(maxLength + ": " + (maxStart + 1));
        System.out.println(minLength + ": " + (minStart + 1));
    }
}
