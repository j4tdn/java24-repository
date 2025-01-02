package view;

import java.util.HashSet;
import java.util.Set;

public class Ex04 {
    public static Set<Long> getPrimeFactors(long x) {
        Set<Long> primeFactors = new HashSet<>();
        while (x % 2 == 0) {
            primeFactors.add(2L);
            x /= 2;
        }
        for (long i = 3; i * i <= x; i += 2) {
            while (x % i == 0) {
                primeFactors.add(i);
                x /= i;
            }
        }
        if (x > 1) {
            primeFactors.add(x);
        }
        return primeFactors;
    }

    public static String arePrimeEquivalent(long N, long M) {
        Set<Long> factorsN = getPrimeFactors(N);
        Set<Long> factorsM = getPrimeFactors(M);
        System.out.println(factorsN);
        System.out.println(factorsM);
        return factorsN.equals(factorsM) ? "YES" : "NO";
    }

    public static void main(String[] args) {
        long N = 75;
        long M = 15;

        System.out.println(arePrimeEquivalent(N, M));
    }
}

