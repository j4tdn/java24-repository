package builder;

import java.time.LocalDate;

public class F1Item {
	
	private int id;
	private String name;
	private Double salesPrice;
	private Double buyPrice;
	private Double tax;
	private int amount;
	private LocalDate startedDate;
	private LocalDate expiredDate;
	
	public F1Item() {
	}

	public F1Item(int id, String name, Double salesPrice, Double buyPrice, Double tax,
		        int amount, LocalDate startedDate, LocalDate expiredDate) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
		this.buyPrice = buyPrice;
		this.tax = tax;
		this.amount = amount;
		this.startedDate = startedDate;
		this.expiredDate = expiredDate;
	}
	
	// Yêu cầu khi khởi tạo mới 1 đối tượng
	// Bắt buộc: id, name, salesPrice
	// Bắt buộc: id, name, buyPrice
	// Bắt buộc: buyPrice, tax
	// Bắt buộc: salesPrice, tax
	
	// Xử lý: Gọi hàm khởi tạo rỗng --> setter nhiều lần
	//      : Dùng builder pattern
	
	/*
	public Item(Double buyPrice, Double tax) {
		this.buyPrice = buyPrice;
		this.tax = tax;
	}
	
	public Item(Double salesPrice, Double tax) {
		this.salesPrice = salesPrice;
		this.tax = tax;
	}
	*/
	
	public F1Item(int id, String name, Double salesPrice) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
	}
	
	public F1Item(int id, Double buyPrice, String name) {
		this.id = id;
		this.buyPrice = buyPrice;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(Double salesPrice) {
		this.salesPrice = salesPrice;
	}

	public Double getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(Double buyPrice) {
		this.buyPrice = buyPrice;
	}
	
	public Double getTax() {
		return tax;
	}
	
	public void setTax(Double tax) {
		this.tax = tax;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public LocalDate getStartedDate() {
		return startedDate;
	}

	public void setStartedDate(LocalDate startedDate) {
		this.startedDate = startedDate;
	}

	public LocalDate getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(LocalDate expiredDate) {
		this.expiredDate = expiredDate;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + ", buyPrice=" + buyPrice
				+ ", amount=" + amount + ", startedDate=" + startedDate + ", expiredDate=" + expiredDate + "]";
	}
}