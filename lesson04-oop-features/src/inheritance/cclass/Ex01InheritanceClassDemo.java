package inheritance.cclass;

import bean.ReferenceBook;
import bean.TextBook;

public class Ex01InheritanceClassDemo {

	public static void main(String[] args) {

		TextBook tb1 = new TextBook("SGK-1", "Toán", 22d);
		TextBook tb2 = new TextBook("SGK-2", "Anh", 23d);
		TextBook tb3 = new TextBook("SGK-3", "Lịch sử", 25d);

		ReferenceBook rb1 = new ReferenceBook("STK-1", "STK Toán", 220d, 4d);
		ReferenceBook rb2 = new ReferenceBook("STK-2", "STK Anh", 250d, 5d);
		ReferenceBook rb3 = new ReferenceBook("STK-3", "STK Lịch Sử", 270d);

		System.out.println("tb1 --> " + tb1);
		System.out.println("tb2 --> " + tb2);
		System.out.println("tb3 --> " + tb3);

		System.out.println("\n=========\n");

		System.out.println("rb1 --> " + rb1);
		System.out.println("rb2 --> " + rb2);
		System.out.println("rb3 --> " + rb3);

	}
}
