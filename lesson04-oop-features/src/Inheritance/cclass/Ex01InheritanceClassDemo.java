package Inheritance.cclass;

import bean.ReferenceBook;
import bean.TextBook;

public class Ex01InheritanceClassDemo {
	public static void main(String[] args) {
		TextBook tb1 = new TextBook("SGK-1", "Toan", 22d);
		TextBook tb2 = new TextBook("SGK-2", "Lich su", 22d);
		TextBook tb3 = new TextBook("SGK-3", "Khoa hoc tu nhien", 22d);

		ReferenceBook rb1 = new ReferenceBook("STK-1", "STK Toan", 220d, 4d);
		ReferenceBook rb2 = new ReferenceBook("STK-2", "STK ly", 180d, 1d);

		System.out.println("Tb1 -->" + tb1);
		System.out.println("Tb2 -->" + tb2);
		System.out.println("Tb3 -->" + tb3);

		System.out.println("============================================");

		System.out.println("rb1 --> " + rb1);
		System.out.println("rb2 --> " + rb2);
	}
}
