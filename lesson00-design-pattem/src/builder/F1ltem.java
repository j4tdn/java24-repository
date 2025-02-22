package builder;

import java.time.LocalDate;

public class F1ltem {
	
	private int id;
	private String name;
	private Double salesPrice;
	private Double buyPrice;
	private Double tax;
	private int amount;
	private LocalDate startedDate;
	private LocalDate expiredDate;
	
	public F1ltem() {
	}

	public F1ltem(int id, String name, Double salesPrice, Double buyPrice, Double tax, int amount, LocalDate startedDate,
			LocalDate expiredDate) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
		this.buyPrice = buyPrice;
		this.tax = tax;
		this.amount = amount;
		this.startedDate = startedDate;
		this.expiredDate = expiredDate;
	}

	
	// yêu cầu khi khời tạo mới 1 đối tượng
	// Bắt buộc:id,name,salesPrice


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
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + ", buyPrice=" + buyPrice + ", tax="
				+ tax + ", amount=" + amount + ", startedDate=" + startedDate + ", expiredDate=" + expiredDate + "]";
	}
	
}	