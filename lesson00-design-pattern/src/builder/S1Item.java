package builder;

import java.time.LocalDate;

public class S1Item {

	private int id;
	private String name;
	private Double salesPrice;
	private Double buyPrice;
	private Double tax;
	private int amount;
	private LocalDate startDate;
	private LocalDate expiredDate;

	public S1Item() {
	}

	public S1Item(int id, String name, Double salesPrice, Double buyPrice, Double tax, 
				int amount, LocalDate startDate, LocalDate expiredDate) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
		this.buyPrice = buyPrice;
		this.tax = tax;
		this.amount = amount;
		this.startDate = startDate;
		this.expiredDate = expiredDate;
	}

	// Yêu cầu khi khởi tạo mới 1 đối tượng
	// Bắt buộc: id, name, salesPrice
	// Bắt buộc: id, name, buyPrice
	
	public S1Item(int id, String name, Double salesPrice) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
	}

	
	
	public S1Item(int id, Double buyPrice, String name) {
		this.id = id;
		this.name = name;
		this.buyPrice = buyPrice;
	}

	public int getId() {
		return id;
	}

	
	public double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
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

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
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
				+ ", amount=" + amount + ", startDate=" + startDate + ", expiredDate=" + expiredDate + "]";
	}
	
	

	
}

