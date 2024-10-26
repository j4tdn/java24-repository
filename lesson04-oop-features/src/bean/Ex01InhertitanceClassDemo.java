package bean;

import bean.TextBook;

public class Ex01InhertitanceClassDemo {
	public static void main(String[] args) {
		TextBook tb1 = new TextBook("SGK-1","Toán",22d);
		TextBook tb2 = new TextBook("SGK-2","Lịch sử",22d);
		TextBook tb3 = new TextBook("SGK-3","Văn",22d);
		
		
		ReferenceBook rb1 = new ReferenceBook("STK-1", "STK Toán", 220d, 4d);
		ReferenceBook rb2 = new ReferenceBook("STK-1", "STK Toán", 220d, 4d);
		
	}
	
	

}
