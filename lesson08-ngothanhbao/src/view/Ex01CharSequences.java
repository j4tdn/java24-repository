package view;

import java.util.Arrays;

public class Ex01CharSequences {
	public static void main(String[] args) {
		
		String s = "Việt Nam";
		printChar(s);
		printWord(s);
		reverseC(s);
		reverseW(s);
	}
	
	public static void printChar(String string) {
		for(int i = 0;i < string.length();i++) {
			System.out.println("Ki tu: " + string.charAt(i));
		}
	}
	
	public static void printWord(String string) {
		String[] words = string.split("[^a-zA-Záàảãạăắằẳẵặâấầẩẫậéèẻẽẹêếềểễệóòỏõọôốồổỗộơớờởỡợíìỉĩịúùủũụưứừửữựýỳỷỹỵđ]+");
			System.out.println("Từ: " + Arrays.toString(words));
	}
	
	public static void reverseC(String string) {
		StringBuilder str = new StringBuilder(string).reverse();
		System.out.println("Dao nguoc ki tu: " + str);
	}
	
	public static void reverseW(String string) {
		String[] words = string.split("[^a-zA-Záàảãạăắằẳẵặâấầẩẫậéèẻẽẹêếềểễệóòỏõọôốồổỗộơớờởỡợíìỉĩịúùủũụưứừửữựýỳỷỹỵđ]+");
		String temp = "";
		for(int i = 0;i < words.length	;i++) {
			temp = words[i];
			words[i] = words[words.length - 1 - i];
			words[words.length - 1 - i] = temp;
		}
		
	    System.out.println("Dao nguoc chu: " + Arrays.toString(words));
	}
	
}
