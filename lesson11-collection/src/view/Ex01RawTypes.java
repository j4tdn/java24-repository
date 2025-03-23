package view;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01RawTypes {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(7);
		numbers.add(12);
		numbers.add(6);
		numbers.add(98);
		numbers.add(2, 23);
		
		numbers.remove(2);
		
		System.out.println("Độ dài numbers: " + numbers.size());
		List list = new LinkedList();
		
		list.add(7);	
		list.add(12);		
		list.add("aa");	
		list.add(12f);
		
		for(Object object:list) {
			System.out.println(object + " ==> " + (int)object * (int)object);
		}
		System.out.println("Độ dài list: " + list.size());
	}
}
