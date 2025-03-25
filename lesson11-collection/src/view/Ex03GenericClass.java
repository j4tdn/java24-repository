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
		System.out.println("size: " + elements.size());
	}
	
}
