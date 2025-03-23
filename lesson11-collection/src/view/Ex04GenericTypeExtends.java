package view;

import java.util.Arrays;

import model.DataModel;

public class Ex04GenericTypeExtends {

	public static void main(String[] args) {
		
		Object[] items =DataModel.mockItems().toArray();
		String[] words = {"a", "b", "c"," f"};
		
		// sort thì nên dùng Comparator -> để sort 1 lúc nhiều kiểu
		// còn Comparable thì chỉ 1 class sẽ chỉ sort được 1 tính năng thôi 
		
		// Arrays.sort(items);
		Arrays.sort(words);
		
		System.out.println(items);
		System.out.println(words);
	
	}
	private static <Element extends Comparable<Element>> void sort(Element[] elements) {
		Arrays.sort(elements);
		
	};
	
}
