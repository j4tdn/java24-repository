package exercise;

public class Ex03Pascal {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            int value = 1; 
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " " ); 
                value++;
            }
            System.out.println();
        }

    }
}
