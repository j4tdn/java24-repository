package view;

import bean.RefBook;
import bean.TextBook;

public class Ex05 {

	public static void main(String[] args) {
		
		TextBook tb1 = new TextBook("SGK1",  18.2, "Kim đồng", "Mới");
		TextBook tb2 = new TextBook("SGK2",  21.7, "Nhi đồng", "Cũ");
		
		RefBook rb1 = new RefBook("STK1",  21.2, "Ruộng đồng", 2.2);
		RefBook rb2 = new RefBook("STK2",  16.5, "Nhi đồng", 2.5);
		RefBook rb3 = new RefBook("STK3",  38.9, "Kim đồng", 2.2);
	}
}
