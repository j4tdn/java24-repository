package view;

import utils.UtilsInput;

public class Ex07CountMaxMinSubstring {

	//private static String[] arrMax = new String[52];
	//private static String[] arrMin = new String[52];

	public static void main(String[] args) {
		String input = UtilsInput.getValue("Enter the string: ");
		maxSubstring(input);
		System.out.println();
		minSubstring(input);
	}

	private static void maxSubstring(String str) {
        String maxLength = "" + str.charAt(0), curLength = "" + str.charAt(0);
        int cnt = 1, cntMax = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                curLength += str.charAt(i);
                cnt++;
            } else {
                if (cnt > cntMax) {
                    maxLength = curLength;
                    cntMax = cnt;
                }
                curLength = "" + str.charAt(i);
                cnt = 1;
            }
        }

        if (cnt > cntMax) {
            maxLength = curLength;
            cntMax = cnt;
        }

        System.out.printf("Maximum length of subsequence: %d  -  \"%s\"  -  Index: [%d]%n", cntMax, maxLength, str.indexOf(maxLength));
    }

    private static void minSubstring(String str) {
        String minLength = "" + str.charAt(0), curLength = "" + str.charAt(0);
        int cnt = 1, cntMin = str.length();

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                curLength += str.charAt(i);
                cnt++;
            } else {
                if (cnt < cntMin) {
                    minLength = curLength;
                    cntMin = cnt;
                }
                curLength = "" + str.charAt(i);
                cnt = 1;
            }
        }

        if (cnt < cntMin) {
            minLength = curLength;
            cntMin = cnt;
        }

        System.out.printf("Minimum length of subsequence: %d  -  \"%s\"  -  Index: [%d]%n", cntMin, minLength, str.indexOf(minLength));
    }
}