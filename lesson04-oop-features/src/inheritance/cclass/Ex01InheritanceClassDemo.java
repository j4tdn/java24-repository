package inheritance.cclass;

import bean.ReferenceBook;
import bean.TextBook;

public class Ex01InheritanceClassDemo {

	public static void main(String[] args) {
		
		/*
		 
		 */
		
		TextBook tb1 = new TextBook("SGK-1", "Toán", 22d);
		TextBook tb2 = new TextBook("SGK-2", "Lịch sử", 14d);
		TextBook tb3 = new TextBook("SGK-3", "Khoa học tự nhiên", 38d);
		
		ReferenceBook rb1 = new ReferenceBook("STK-1", "STK Toán", 220d, 4d);
		ReferenceBook rb2 = new ReferenceBook("STK-2", "STK Lý", 180d, 1d);
		
		System.out.println("tb1 --> " + tb1);
		System.out.println("tb2 --> " + tb2);
		System.out.println("tb3 --> " + tb3);
		
		System.out.println("\n===================\n");

		System.out.println("rb1 --> " + rb1);
		System.out.println("rb2 --> " + rb2);
	}
}
