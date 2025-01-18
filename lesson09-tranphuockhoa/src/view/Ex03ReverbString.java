package view;

import java.util.ArrayList;
import java.util.List;

public class Ex03ReverbString {

	public static void main(String[] args) {

		String input = "Welcome    to JAVA10    class";
		System.out.println("Chuỗi ban đầu");
		System.out.println(input);
		revert(input);


	}

	// Kết quả đúng
	// Mà do em để hàm return void nên code khá dài
	public static void revert(String s) {
        
        System.out.println("\nChuỗi đảo ngược theo từng từ:");

        String[] words = s.split("\\s+");

        List<String> reversedWords = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder sb = new StringBuilder(word);
            String reversedWord = sb.reverse().toString();
            reversedWords.add(reversedWord);
        }

        String result = String.join(" ", reversedWords);

        System.out.println(result);
    }

    public static String reverseWord(String word) {
        StringBuilder sb = new StringBuilder(word);
        return sb.reverse().toString();
    }
}

