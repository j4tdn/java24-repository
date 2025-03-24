package view;

public class Ex02PrintRectangle {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n) {
                    System.out.print(j);
                } else if (j == i || i == n - j + 1) System.out.print(j);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
