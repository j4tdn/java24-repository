package view;


import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi kí tự(không nhập kí tự đặc biệt): ");
        String input = sc.nextLine();

        printCharEachLine(input);
        printWordEachLine(input);
        printSwapChar(input);
        printSwapLetter(input);
        
        sc.close();
    }
    public static void printCharEachLine(String string) {
    	System.out.println("\nMỗi kí tự trên một dòng:");
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }
    }

	public static void printWordEachLine(String string) {
		System.out.println("\nMỗi từ trên một dòng:");
		String[] words = string.split("\\s+");
		for (int i = 0; i < words.length; i++) {
		    System.out.println(words[i]);
		}
    }
	
	public static void printSwapChar(String string) {
		System.out.println("\nChuỗi đảo ngược theo kí tự:");
        StringBuilder sb = new StringBuilder(string);
		System.out.println(sb.reverse());
	}
	
	public static void printSwapLetter(String string) {
		System.out.println("\nChuỗi đảo ngược theo từ:");
		String[] words = string.split("\\s+");
        for (int i = words.length - 1; i >= 0; i--) {
        	System.out.print(words[i] + " ");
        }
        
	}
}
