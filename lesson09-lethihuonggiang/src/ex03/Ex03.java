package ex03;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String s1 = ip.nextLine();

        String s2 = stringProcessing(s1);
        System.out.println("output: " + s2);

        ip.close();
    }
    
    // Sai yêu cầu
    // Xem kỹ lại đề bài
    public static String stringProcessing(String s) {
  
        String string = s.trim().replaceAll("\\s+", " ");

        StringBuilder reversedString = new StringBuilder(string);
        
        return reversedString.reverse().toString();
    }
}