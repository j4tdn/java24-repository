package bean;

public class BookDetail {

	private Book book;
	private int quality;

	public BookDetail() {
		// TODO Auto-generated constructor stub
	}

	public BookDetail(Book book, int quality) {

		this.book = book;
		this.quality = quality;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	@Override
	public String toString() {
		return "BookDetail [book=" + book + ", quality=" + quality + "]";
	}

}
