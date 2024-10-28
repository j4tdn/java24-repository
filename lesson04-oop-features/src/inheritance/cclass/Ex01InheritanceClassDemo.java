package inheritance.cclass;

import bean.ReferenceBook;
import bean.TestBook;

public class Ex01InheritanceClassDemo {
	/*
	 * Giả lập
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {

		TestBook tb1 = new TestBook("SGK-1", "Toán", 22d);
		TestBook tb2 = new TestBook("SGK-2", "Lịch sử", 14d);
		TestBook tb3 = new TestBook("SGK-3", "Khoa học tự nhiên", 38d);

		ReferenceBook rb1 = new ReferenceBook("STK-1", "STK Toán", 220d, 4d);

		ReferenceBook rb2 = new ReferenceBook("STK-2", "STK Lý", 180d, 1d);
		System.out.println("TB1 --> " + tb1);
		System.out.println("TB2 --> " + tb2);
		System.out.println("TB3 --> " + tb3);
		System.out.println("\n=======================================================\n");
		System.out.println("RB1 --> " + rb1);
		System.out.println("RB2 --> " + rb2);

	}
}
