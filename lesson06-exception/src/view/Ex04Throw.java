package view;

public class Ex04Throw {
    public static void main(String[] args) {
        int div;
        try {
            div = div(2, 0);
            System.out.println(div);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int div(int num, int den) {
        if (den == 0) throw new ArithmeticException("Division by zero");
        return num / den;
    }


}
