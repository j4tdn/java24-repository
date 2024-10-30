package utils;

public class calcLevel {
    public static int calculateLevel(int number) {
        int level = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                level++;
            }
        }
        return level;
    }
}
