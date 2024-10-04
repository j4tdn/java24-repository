package exerciese;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số tự nhiên N: ");
        
        int N = scanner.nextInt();

        if (N < 0) {
            System.out.println("Vui lòng nhập một số tự nhiên (0 hoặc dương).");
        } else {
            String binary = convertToBinary(N);
            System.out.println("Số " + N + " trong hệ nhị phân là: " + binary);
        }

        scanner.close();
    }

    private static String convertToBinary(int N) {
        if (N == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();

        while (N > 0) {
            binary.insert(0, N % 2);
            N /= 2;
        }

        return binary.toString();
    }

}
