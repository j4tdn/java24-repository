package inheritance.cclass;

import bean.ReferenceBook;
import bean.TextBook;

public class Ex01InheritanceClassDemo {
	
	public static void main(String[] args) {
		TextBook tb1 = new TextBook("SGK-1", "Toan", 22d);
		TextBook tb2 = new TextBook("SGK-2", "Lich su", 38d);
		TextBook tb3 = new TextBook("SDK-3", "Khao hoc tu nhien", 38d);
		
		ReferenceBook rb1 = new ReferenceBook("STK-1", "STK Toan", 220d, 4d);
		ReferenceBook rb2 = new ReferenceBook("STK-2", "STK Ly", 180d, 4d);
	
		System.out.println("tb1 --> " + tb1);
		System.out.println("tb2 --> " + tb2);
		System.out.println("tb3 --> " + tb3);
		
		System.out.println("\n======================================\n");
		
		System.out.println("rb1 --> " + rb1);
		System.out.println("rb2 --> " + rb2);
	}
}
