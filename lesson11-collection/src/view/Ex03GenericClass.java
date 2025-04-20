package view;

import bean.CustomList;
import bean.IList;

public class Ex03GenericClass {
	
	public static void main(String[] args) {
		IList<String> elements = new CustomList<>();
		
		elements.add("a1");
		elements.add("a2");
		elements.add("a3");
		elements.add("a4");
		elements.add("a5");
		elements.add("a6");
		elements.add("a7");
		
		System.out.println("size: " + elements.size());
		System.out.println("lenght: " + elements.capacity());
		
		for (int i = 0; i < elements.size(); i++) {
			System.out.println("  - " + elements.get(i));
		}
	}
	
}