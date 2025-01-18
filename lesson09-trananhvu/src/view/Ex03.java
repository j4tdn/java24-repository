package view;

public class Ex03 {

	// A expect các bạn dùng StringBuilder để nhớ lại bài + chuỗi cho string mutable và hàm reverse có sẵn
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
        
        // Cố gắng đặt tên biến hay hơn em hi
        String[] s1 = s.split(" ");
        for (String s2 : s1) {
            revert(s2);
            System.out.print(" ");
        }
    }
}
