package bean;

public class Textbook extends Book{
	
	private Boolean isNew;
	private Double discountInPercen;
	
	public Textbook() {
	}

	public Textbook(String id, String name, Double price) {
		this(id, name, price, null, 0d);
	}
	
	public Textbook(String id, String name, Double price, Boolean isNew, Double discountInPercen) {
		super(id, name, price);
		this.isNew = isNew;
		this.discountInPercen = discountInPercen;
	}

	public Boolean getIsNew() {
		return isNew;
	}

	public void setIsNew(Boolean isNew) {
		this.isNew = isNew;
	}

	public Double getDiscountInPercen() {
		return discountInPercen;
	}

	public void setDiscountInPercen(Double discountInPercen) {
		this.discountInPercen = discountInPercen;
	}

	@Override
	public String toString() {
		return "Textbook [isNew=" + isNew + ", discountInPercen=" + discountInPercen + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getPrice()=" + getPrice() + "]";
	}
	
	
}
