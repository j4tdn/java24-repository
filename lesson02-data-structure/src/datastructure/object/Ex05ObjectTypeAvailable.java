package datastructure.object;

import bean.Item;

public class Ex05ObjectTypeAvailable {
	
	public static void main(String[] args) {
		char c1 = 'a';
		byte c2 = 'a';
		
		System.out.println(c1);
		System.out.println(c2);
		
		int x1 = 5;
		
		Item i1 = new Item();
		Item i2 = new Item(1, 'b', 22d);
		
		Integer o1 = new Integer(55);
		
		System.out.println(o1);
		
		String s1 = new String("hello");
	
		System.out.println(s1);
		
		Long l1 = new Long(77l);
		
		System.out.println(l1);
		
		Integer o2 = 123;
		Long l2 = 345l;
		String s2 = "word";
		
		System.out.println(o2);
		System.out.println(l2);
		System.out.println(s2);
		
		
	}

}
