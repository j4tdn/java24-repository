package view;

public class Ex06 {
    public static void main(String[] args) {
        int k = 100;
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < k; i++) {
            s.append(i);
        }
        System.out.println(s.charAt(k));
    }
}
