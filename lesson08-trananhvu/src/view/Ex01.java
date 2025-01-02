package view;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

    private static void reverseString(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.println(s.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String s;
        String[] s1;

        System.out.print("Nhap chuoi S: ");
        s = ip.nextLine();

        System.out.println("=============================");

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            System.out.println(ch);
        }

        System.out.println("=============================");

        s1 = s.split(" ");
        for (String s2 : s1) {
            System.out.println(s2);
        }

        System.out.println("=============================");

        reverseString(s);

        System.out.println("=============================");

        for (String s2 : s1) {
            reverseString(s2);
            System.out.println(" ");
        }

    }
}
