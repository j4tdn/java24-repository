package datastructure.object;

import bean.Item;

public class Ex03ReassignValues {
	
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		
		a = b;
		b = 20;
		
		Item i1 = new Item(1, 'a', 11d); 
		final Item i2 = new Item(2, 'b', 22d); 
	    Item i3 = new Item(3, 'c', 33d); 
	    
	    i2.salesPrice = 999;
	    
	    System.out.println("i1 address: " +System.identityHashCode(i1));
	    System.out.println("i2 address: " +System.identityHashCode(i2));
	    System.out.println("i3 address: " +System.identityHashCode(i3));
	    
	    System.out.println();
	    
	    i1 = i3;
	    i1 = new Item(4, 'd', 44d);
	    
	    System.out.println("i1 address: " +System.identityHashCode(i1));
	    System.out.println("i2 address: " +System.identityHashCode(i2));
	    System.out.println("i3 address: " +System.identityHashCode(i3));
	    
	    i1.id = 999;
	    
	    i2.name = 'z';
	    
	    System.out.println();
	    
	    System.out.println("i1 address: " +System.identityHashCode(i1));
	    System.out.println("i2 address: " +System.identityHashCode(i2));
	    System.out.println("i3 address: " +System.identityHashCode(i3));
	    
	    System.out.println("i1 --> " + i1);
	    System.out.println("i2 --> " + i2);
	    System.out.println("i3 --> " + i3);
	}

}
