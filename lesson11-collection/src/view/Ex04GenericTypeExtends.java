package view;

import java.util.Arrays;

import model.DataModel;

public class Ex04GenericTypeExtends {

	public static void main(String[] args) {
		Object[] items = DataModel.mockItems().toArray();
		String[] words = {"a", "b", "c", "d", "e"};
		
		
		sort(words);
		System.out.println(items);
	}
	
	private static <E extends Comparable<E>> void sort(E[] elements) {
		Arrays.sort(elements);
	}
	
}
