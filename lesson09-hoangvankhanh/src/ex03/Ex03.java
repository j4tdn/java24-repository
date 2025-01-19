package ex03;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("input: ");
        String input = ip.nextLine();

        String output = stringProcessing(input);
        System.out.println("output: " + output);

        ip.close();
    }
    
    // Em xem lại kỹ đề sẽ thấy mình làm sai
    // A yêu cầu đảo từng từ trong chuỗi, chứ ko phải đảo nguyên chuỗi hi
    public static String stringProcessing(String input) {
  
        String trimmedInput = input.trim().replaceAll("\\s+", " ");

        StringBuilder reversedString = new StringBuilder(trimmedInput);
        
        return reversedString.reverse().toString();
    }
}