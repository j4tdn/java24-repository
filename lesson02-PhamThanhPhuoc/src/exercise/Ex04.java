package exercise;

import java.util.Random;

public class Ex04 {
    public static void main(String[] args) {
        Random random = new Random();
        long sum = 0;

        for (int i = 0; i < 4; i++) {
            int number = random.nextInt(10,20);
            sum += factorial(number);
            System.out.println(number + "! = " + factorial(number)); 
        }

        System.out.println("Tổng = " + sum); 
    }
    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
