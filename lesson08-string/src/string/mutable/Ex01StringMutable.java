package string.mutable;

import java.util.Iterator;

public class Ex01StringMutable {
	public static void main(String[] args) {
		String[] letters = {"a","b","c","d","e"};
		String immutable = "";
		for(String letter :letters) {
			immutable = immutable  + letter;
			
		}
		System.out.println(immutable);
		
		System.out.println("\n==============\n");
		
		
		StringBuilder mutable = new StringBuilder();
		for(String letter :letters) {
			mutable = mutable.append(letter);
			
			
		}
		System.out.println(mutable);
		
		
	}
}
