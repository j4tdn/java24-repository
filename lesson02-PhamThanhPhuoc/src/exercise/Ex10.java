package exercise;

import java.util.Random;

public class Ex10 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomNumbers = new int[5];
        for (int i = 0; i < 5; i++) {
            randomNumbers[i] = random.nextInt(20, 30); 
            for (int j = 0; j < i; j++) {
                if (randomNumbers[i] == randomNumbers[j]) {
                   i--;
                    break; 
                }
            }
        }
        System.out.println("5 so ngau nhien : ");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
    }
}
