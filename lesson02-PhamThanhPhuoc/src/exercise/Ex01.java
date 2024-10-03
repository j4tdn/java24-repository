package exercise;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 0, attempts = 0;

        while (attempts < 5) {
            System.out.print("Nhap N: ");
            try {
                N = Integer.parseInt(scanner.nextLine());
                if (N > 0) break;
            } catch (Exception e) {
                System.out.println("Khong hop le,hay thu lai");
            }
            attempts++;
        }

        if (N > 0)
            System.out.println(N % 2 == 0);
        else
            System.out.println("Da vuoc qua so lan thu toi da");
        scanner.close();
    }
}
