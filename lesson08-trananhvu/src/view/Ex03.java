package view;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex03 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Nhap chuoi s: ");
        String s = ip.nextLine();

        s = s.replace("đ", "d").replace("Đ", "D");
        String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        s =  pattern.matcher(temp).replaceAll("");
        System.out.println(s);
    }
}
