package datastructure.object;

import bean.Item;

public class Ex05ObjectTypeAvailable {
	public static void main(String[] args) {
		//primitive
		int x1 = 5;
		
		//object type: custom
		Item it1 = new Item();
		Item i2 = new Item(2, 'B', 22d);
		
		//object type; available
		//Integer: value(int)
		//String: value(byte{})
		Integer o1 = new Integer(55);
		Long l1 = new Long(77l);
		String s1 = new String("hello");
		
		
		
		System.out.println("o1 -->" + o1);
		System.out.println("l1 -->" + l1);
		System.out.println("s1 -->" + s1);
		
		
		Integer o2 = 22;
	    Long l2 = 88l;
	    String s2 = "word";
	}
}
