package bean;

public class TextBook extends Book {

	private Boolean isNew;
	private Double discountInPercent;
	
	public TextBook() {
	}
	
	public TextBook(String id, String name, Double price) {
		this(id, name, price, true, 0d);
	}

	public TextBook(String id, String name, Double price, Boolean isNew, Double discountInPercent) {
		super(id, name, price);
		this.isNew = isNew;
		this.discountInPercent = discountInPercent;
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
		return "TextBook [isNew=" + isNew + ", discountInPercent=" + discountInPercent + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getPrice()=" + getPrice() + "]";
	}
	
}
