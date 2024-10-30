package ex03;

public class PascalTriangle {

	public static void main(String[] args) {
        int maxRows = 6;

        for (int i = 1; i < maxRows; i++) {
            int number = 1;
            System.out.print(number + " ");

            for (int j = 1; j <= i; j++) {
                number = number * (i - j + 1) / j;
                System.out.print(number + " ");
            }

            System.out.println();
        }
    }
}