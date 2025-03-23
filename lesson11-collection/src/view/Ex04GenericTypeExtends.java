package view;

import java.util.Arrays;

import model.DataModel;

public class Ex04GenericTypeExtends {
	
	public static void main(String[] args) {
		Object[] items = DataModel.mockItems().toArray();
		String[] words = {"a", "b", "c", "d"};
		
		// sort(items);
		sort(words);
		
		System.out.println(items);
		System.out.println(words);
	}
	
	private static <Element extends Comparable<Element>> void sort(Element[] elements) {
		Arrays.sort(elements);
	}
	
}