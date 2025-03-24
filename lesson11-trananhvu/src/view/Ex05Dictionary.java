package view;

import bean.Word;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex05Dictionary {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        var dictionary = new HashMap<String, Word>();

        while (true) {
            System.out.println("\n----------------------------------");
            System.out.println("Vui long chon yeu cau!");
            System.out.println("1. Them moi tu vung");
            System.out.println("2. Tra tu dien");

            System.out.print("Chon: ");

            switch (sc.nextInt()) {
                case 1:
                    addWord(dictionary);
                    break;
                case 2:
                    getWord(dictionary);
                    break;
                default:
                    break;

            }
        }

    }

    private static void addWord(Map<String, Word> dictionary) {
        String word;
        String definition;
        String type;
        String note;

        System.out.print("Nhap tu vung: ");
        sc.nextLine();
        word = sc.nextLine();

        System.out.print("Nhap nghia: ");
        definition = sc.nextLine();

        System.out.print("Nhap kieu tu: ");
        type = sc.nextLine();

        System.out.print("Nhap ghi chu: ");
        note = sc.nextLine();

        Word newWord = new Word(word, definition, type, note);
        dictionary.put(newWord.getWord(), newWord);
    }

    private static void getWord(Map<String, Word> dictionary) {
        String word;

        sc.nextLine();
        System.out.print("Nhap tu can tra: ");
        word = sc.nextLine();

        if (dictionary.containsKey(word)) {
            System.out.println(dictionary.get(word));
        } else {
            System.out.println("Khong co tu vung nay!");
        }
    }
}
