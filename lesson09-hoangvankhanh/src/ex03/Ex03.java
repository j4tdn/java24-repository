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
    
    public static String stringProcessing(String input) {
  
        String trimmedInput = input.trim().replaceAll("\\s+", " ");

        StringBuilder reversedString = new StringBuilder(trimmedInput);
        
        return reversedString.reverse().toString();
    }
}