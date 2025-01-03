package view;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex04 {
	private static boolean checkPrime(int num) {
        if (num % 2 == 0) return false;
        
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
    private static int[] getPrimeFactors(int num) {
        int[] factors = new int[32];
        int index = 0;
        
        for (int i = 2; i <= num; i++) {
            if (checkPrime(i) && num % i == 0) {
                factors[index++] = i;
            }
        }
        
        return factors;
    }
    
    private static String checkEquivalent(int n, int m) {
        int[] factorsN = getPrimeFactors(n);
        int[] factorsM = getPrimeFactors(m);
        boolean[] checkedN = new boolean[32];
        boolean[] checkedM = new boolean[32];
        
        for (int i = 0; factorsN[i] != 0; i++) {
            for (int j = 0; factorsM[j] != 0; j++) {
                if (factorsN[i] == factorsM[j]) {
                    checkedN[i] = checkedM[j] = true;
                    break;
                }
            }
            if (!checkedN[i]) return "NO";
        }
        
        for (int i = 0; factorsM[i] != 0; i++) {
            if (!checkedM[i]) return "NO";
        }
        
        return "YES";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 2 số bất kì lớn hơn 2 nhỏ hơn 3000000000:");
        System.out.println(checkEquivalent(sc.nextInt(), sc.nextInt()));
        sc.close();
    }
}
