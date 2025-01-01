package builder;

import java.time.LocalDate;

public class F1Item {

	private int id;
	private String name;
	private Double salesPrice;
	private Double buyPrice;
	private Double tax;
	private int amount;
	private LocalDate statedDate;
	private LocalDate expiredDate;

	public F1Item() {
		// TODO Auto-generated constructor stub
	}

	public F1Item(int id, String name, Double salesPrice, Double buyPrice, Double tax, int amount, LocalDate statedDate,
			LocalDate expiredDate) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
		this.buyPrice = buyPrice;
		this.tax = tax;
		this.amount = amount;
		this.statedDate = statedDate;
		this.expiredDate = expiredDate;
	}

	// Yêu cầu khi khởi tạo mới đối tượng
	// Bắt buộc: id, name, salesPrice
	// Bắt buộc: id, name, buyPrice
	// Bắt buộc: buyPrice, tax
	// Bắt buộc: salesPrice, tax

	public F1Item(int id, String name, Double salesPrice) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
	}

	public F1Item(int id, Double buyPrice, String name) {
		this.id = id;
		this.name = name;
		this.buyPrice = buyPrice;
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

	public Double getTax() {
		return tax;
	}

	public void setBuyPrice(Double buyPrice) {
		this.buyPrice = buyPrice;
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

	public LocalDate getStatedDate() {
		return statedDate;
	}

	public void setStatedDate(LocalDate statedDate) {
		this.statedDate = statedDate;
	}

	public LocalDate getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(LocalDate expiredDate) {
		this.expiredDate = expiredDate;
	}

}
