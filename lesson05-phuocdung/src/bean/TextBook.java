package bean;

public class TextBook extends Book {
	
	private Boolean isNew;
	
	public TextBook() {
		
	}

	public TextBook(String code, Double price, String author, Boolean isNew) {
		super(code, price, author);
		this.isNew = isNew;
	}

	public Boolean getIsNew() {
		return isNew;
	}

	public void setIsNew(Boolean isNew) {
		this.isNew = isNew;
	}

	@Override
	public String toString() {
		return "TextBook [isNew=" + isNew + ", getCode()=" + getCode() + ", getPrice()=" + getPrice() + ", getAuthor()="
				+ getAuthor() + "]";
	}
	
	
	
	

}
