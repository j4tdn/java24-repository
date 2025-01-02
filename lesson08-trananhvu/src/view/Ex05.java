package view;

public class Ex05 {
    public static void main(String[] args) {
        String s1 = "QWERWETERTY";
        String s2 = "QWERWEQWERWETERDGDF";

        int endIndex = 0;
        int count = 0;
        int max = 0;

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                while (s1.charAt(i) == s2.charAt(j)) {
                    count++;
                    if (count > max) {
                        max = count;
                        endIndex = i;
                    }
                    i++;
                    j++;
                    if (i == s1.length() || j == s2.length()) {
                        break;
                    }
                }
                i = i - count;
                j = j - count + 1;
                count = 0;
            }

        }
        System.out.println(max);
        System.out.println(endIndex);
        System.out.println(s1.substring(endIndex - max + 1, endIndex + 1));

    }
}
