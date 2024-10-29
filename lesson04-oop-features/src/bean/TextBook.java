package bean;

public class TextBook extends Book {
	private Boolean isNew;
	private Double discountInPrecent;
	
	public TextBook() {
	}
	
	public TextBook(String id, String name, Double price) {
		this(id, name, price, true, 0d);
	}
	
	public TextBook(String id, String name, Double price, Boolean isNew, Double discountInPrecent) {
		super(id, name, price);
		this.isNew = isNew;
		this.discountInPrecent = discountInPrecent;
	}

	public Boolean getIsNew() {
		return isNew;
	}

	public void setIsNew(Boolean isNew) {
		this.isNew = isNew;
	}

	public Double getDiscountInPrecent() {
		return discountInPrecent;
	}

	public void setDiscountInPrecent(Double discountInPrecent) {
		this.discountInPrecent = discountInPrecent;
	}

	@Override
	public String toString() {
		return "TextBook [isNew=" + isNew + ", discountInPrecent=" + discountInPrecent + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getPrice()=" + getPrice() + "]";
	}

}
