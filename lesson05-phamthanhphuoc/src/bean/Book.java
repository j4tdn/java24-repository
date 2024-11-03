package bean;

public class Book {
	private Integer IdBook;
	private Double Price;
	private String Nanufacturer;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(Integer idBook, Double price, String nanufacturer) {
		IdBook = idBook;
		Price = price;
		Nanufacturer = nanufacturer;
	}

	public Integer getIdBook() {
		return IdBook;
	}

	public void setIdBook(Integer idBook) {
		IdBook = idBook;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	public String getNanufacturer() {
		return Nanufacturer;
	}

	public void setNanufacturer(String nanufacturer) {
		Nanufacturer = nanufacturer;
	}

	@Override
	public String toString() {
		return "Book [IdBook=" + IdBook + ", Price=" + Price + ", Nanufacturer=" + Nanufacturer + "]";
	}
	
	

}
