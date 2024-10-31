package bean;

public class TextBook extends Book {

	private Boolean isNew;
	private Double discount;

	public TextBook() {
	}

	public TextBook(String id, String name, Double price) {
		this(id, name, price, true, 0d);
	}

	public TextBook(String id, String name, Double price, Boolean isNew, Double discount) {
		super(id, name, price);
		this.isNew = isNew;
		this.discount = discount;
	}

	public Boolean getIsNew() {
		return isNew;
	}

	public void setIsNew(Boolean isNew) {
		this.isNew = isNew;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "TextBook [isNew=" + isNew + ", discount=" + discount + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getPrice()=" + getPrice() + "]";
	}
	
	

}
