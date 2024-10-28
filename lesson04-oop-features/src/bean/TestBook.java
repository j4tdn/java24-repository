package bean;

public class TestBook extends Book {
	private Boolean isNew;
	private Double discountInPercent;

	public TestBook() {
	}

	public TestBook(String id, String name, Double price) {
		super(id, name, price);
		this.isNew = true;
		this.discountInPercent = 0d;
	}

	public TestBook(String id, String name, Double price, Boolean isNew, Double discountInPercent) {
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
		return "TestBook [isNew=" + isNew + ", discountInPercent=" + discountInPercent + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getPrice()=" + getPrice() + "]";
	}

}
