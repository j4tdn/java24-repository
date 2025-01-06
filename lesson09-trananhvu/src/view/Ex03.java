package view;

public class Ex03 {

    private static void revert(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }

    private static String deleteExtraSpaces(String str) {
        return str.strip().replaceAll("[\\s]+", " ");
    }

    public static void main(String[] args) {
        String s = "Welcome    to    JAVA10    class";
        s = deleteExtraSpaces(s);
        String[] s1 = s.split(" ");
        for (String s2 : s1) {
            revert(s2);
            System.out.print(" ");
        }
    }
}
