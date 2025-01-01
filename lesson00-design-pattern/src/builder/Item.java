package builder;

import java.time.LocalDate;

//1 tineg 30p

/**
 * Sử dụng builder pattern để tạo đối tượng cho Item
 * --> cách 1 (truyền thống)
 * 
 * B1: nhờ builder tạo ra 1 đối tượng có đầy đủ thông tin như 
 * Item 
 * B2: Item muốn set bao nhiêu thuộc tính thì dùng Builder set  
 * trước rồi copy sau
 * B3:: Gọi hàm build trong class Builder để build ra đối tượng \
 * Item
 * 
 * Bản thân class Item không được phép tự tạo đối tượng
 *  --> private cóntructor
 *  Muốn Item là immutable
 *  --> chỉ tạo hàm getter, không tạo hàm setter
 *  
 *  Class nằm bên trong class --> nested class
 *  Hàm nằm trong hàm --> nested function
 *  
 *  Builder là static class vì
 *  + nếu non static, muốn truy cập được Builder thì phải
 *  tạo 1 đối tượng Item (ko hợp lý), vì nếu tạo đối tượng
 *  Item thì không cần dùng Builder
 */
public class Item {
	
	private int id;
	private String name;
	private Double salesPrice;
	private Double buyPrice;
	private Double tax;
	private int amount;
	private LocalDate statedDate;
	private LocalDate expiredDate;
	
	private Item() {
	}
	
	private Item(Builder builder) {
		this.name = builder.name;
		this.salesPrice = builder.salesPrice;
		this.buyPrice = builder.buyPrice;
		this.tax = builder.tax;
		this.amount = builder.amount;
		this.statedDate = builder.statedDate;
		this.expiredDate = builder.expiredDate;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	// Chỉ có getters
	// không có setterss
	
	
	
	// Nested class
	public static class Builder {
		
		public int getId() {
			return id;
		}


		public String getName() {
			return name;
		}


		public Double getSalesPrice() {
			return salesPrice;
		}


		public Double getBuyPrice() {
			return buyPrice;
		}


		public Double getTax() {
			return tax;
		}


		public int getAmount() {
			return amount;
		}


		public LocalDate getStatedDate() {
			return statedDate;
		}


		public LocalDate getExpiredDate() {
			return expiredDate;
		}

		private int id;
		private String name;
		private Double salesPrice;
		private Double buyPrice;
		private Double tax;
		private int amount;
		private LocalDate statedDate;
		private LocalDate expiredDate;
		
 		
		// chỉ có setters, để gán giá trị sau khi tạo đối
		// tạo đối tượng builder

		public Builder withId(int id) {
			this.id = id;
			return this;
		}


		public Builder withName(String name) {
			this.name = name;
			return this;
		}


		public Builder withSalesPrice(Double salesPrice) {
			this.salesPrice = salesPrice;
			return this;
		}


		public Builder withBuyPrice(Double buyPrice) {
			this.buyPrice = buyPrice;
			return this;
		}


		public Builder withTax(Double tax) {
			this.tax = tax;
			return this;
		}


		public Builder withAmount(int amount) {
			this.amount = amount;
			return this;
		}


		public Builder withStatedDate(LocalDate statedDate) {
			this.statedDate = statedDate;
			return this;
		}


		public Builder withExpiredDate(LocalDate expiredDate) {
			this.expiredDate = expiredDate;
			return this;
		}

		public Item build() {
			return new Item(this);
		}
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + ", buyPrice=" + buyPrice + ", tax="
				+ tax + ", amount=" + amount + ", statedDate=" + statedDate + ", expiredDate=" + expiredDate + "]";
	}
		
	
	
}
