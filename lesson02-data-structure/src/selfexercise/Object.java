package selfexercise;

import bean.Book;
/*
 * Tạo 4 cuốn sách có thuộc tên , số trang, giá với từng bước cơ bản khai báo đối tượng
 */
public class Object {
	public static void main(String[] args) {
		
		Book book1 = new Book();
		book1.name = 'A';
		book1.numberPage = 100;
		System.out.println("b1 " + book1);
		
		Book book2 = new Book();
		book2.name = 'B';
		book2.numberPage = 200;
		book2.price = 200000;
		System.out.println("b2 " + book2);
		
		Book book3 = new Book('C', 300, 300000);
		System.out.println("b3 " + book3);
	}

}
