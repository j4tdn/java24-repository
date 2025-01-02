package view;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex03 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi tiếng Việt có dấu:");
        String input = sc.nextLine();

        String output = removeAccent(input);
        System.out.println("Chuỗi không dấu:");
        System.out.println(output);

        sc.close();
    }

    public static String removeAccent(String string) {
        String normalized = Normalizer.normalize(string, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{M}");
        return pattern.matcher(normalized).replaceAll("").replaceAll("[^\\p{ASCII}]", "");
    }
}

