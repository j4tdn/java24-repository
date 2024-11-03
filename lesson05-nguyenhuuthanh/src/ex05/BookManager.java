package ex05;


public class BookManager {

	public static void findBook(Book[] books,String publisher) {
		for(Book book : books) {
			if(book.getPublisher().equalsIgnoreCase(publisher)) {
				System.out.println(book.getId());
			}
		}
	}
	
	public static void findPriceBook(Book[] books, double price) {
		for(Book book : books) {
			if(book.getPrice() < price) {
				System.out.println("Mã : "+book.getId() +" | Giá : "+book.getPrice());
			}
		}
	}
	public static void findPriceBook1(Book[] books, double priceStart, double priceEnd) {
		for(Book book : books) {
			if(priceStart< book.getPrice() && book.getPrice() < priceEnd) {
				System.out.println("Mã : "+book.getId() +" | Giá : "+book.getPrice());
			}
		}
	}

	
	public static void main(String[] args) {
		BookManager bm = new BookManager();
		TextBook t1 = new TextBook("SGK-01", 40, "Nhi Đồng", "Mới");
		TextBook t2 = new TextBook("SGK-02", 50, "Nhi Đồng", "Cũ");
		TextBook t3 = new TextBook("SGK-03", 150, "Giáo Dục", "Mới");
		ReferenceBook r1 = new ReferenceBook("STK-04", 45, "Giáo Dục", 2);
		ReferenceBook r2 = new ReferenceBook("STK-05", 30, "Giáo Dục", 2);
		Book[] books = new Book[] {t1,t2,t3,r1,r2};
		System.out.println("1. Tất cả sách thuộc nhà xuất bản Nhi Đồng :");
		bm.findBook(books, "Nhi Đồng");
		System.out.println("2. Tất cả sách có đơn giá < 50 :");
		bm.findPriceBook(books, 50);
		System.out.println("3. Tất cả sách có 100 < đơn giá < 200 :");
		bm.findPriceBook1(books, 100,200);
		
	}
	

}
