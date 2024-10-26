package inheritance.cclass;

import bean.ReferenceBook;
import bean.TextBook;

public class Ex01InheritanceClassDemo {
	
	
	public static void main(String[] args) {
		
		TextBook tb1 = new TextBook("SGK-1", "Toan", 20d);
		TextBook tb2 = new TextBook("SGK-2", "Ly", 30d);
		TextBook tb3 = new TextBook("SGK-3", "Hoa", 40d);
		
		ReferenceBook rb1 = new ReferenceBook("STK-1", "STK Toan", 400d, 4d);
		ReferenceBook rb2 = new ReferenceBook("STK-2", "STK Ly", 400d, 4d);
		
		System.out.println("Sach Giao Khoa ------> " + tb1);
		System.out.println("Sach Giao Khoa ------> " + tb2);
		System.out.println("Sach Giao Khoa ------> " + tb3);
		
		System.out.println("\n==========================\n");
		
		System.out.println("Sach Tham Khao -----> " + rb1);
		System.out.println("Sach Tham Khao -----> " + rb2);
		
		
		
	}
		
}
