package bean;

public class TextBook extends Book{

	private String id;
	private String name;
	private Double price;
	private Boolean isNew;
	private Double discountInPercent;
	
	
	public TextBook() {
		
	}
	
	public TextBook(String id, String name, Double price, Boolean isNew, Double discountInPercent) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.isNew = isNew;
		this.discountInPercent = discountInPercent;
	}

	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Boolean getIsNew() {
		return isNew;
	}

	public void setIsNew(Boolean isNew) {
		this.isNew = isNew;
	}

	public Double getDiscountInPercent() {
		return discountInPercent;
	}

	public void setDiscountInPercent(Double discountInPercent) {
		this.discountInPercent = discountInPercent;
	}

	
	@Override
	public String toString() {
		return "TextBook [id=" + id + ", name=" + name + ", price=" + price + ", isNew=" + isNew
				+ ", discountInPercent=" + discountInPercent + "]";
	}
	
	
}
