package builder;

import java.time.LocalDate;

/**
 * sử dụng builder pattern để tạo đối tượng cho Item -> cách 1(truyền thống)
 * 
 * Từ Item, nhờ Builder tạo ra 1 đối tượng sao đó copy giá trị của BUilder bỏ
 * vào trong Item B1: Nhờ builder tjao ra 1 đối tượng chứa đầy đủ thông tin như
 * Item --> đầy đủ tt như Item B2: Item muốn set bnhiu tt thì dùng Builder set
 * trước rồi copy sau B3: Gọi hàm build trong class Builder để build ra đối
 * tượng Item
 * 
 * Bản thân class Item ko đc phép tự tạo đối tượng --> private constructor Muốn
 * Item immutable --> chỉ tạo hàm getter, ko tạo setter
 * 
 * Class nằm trong Class --> nested class Hàm trong hàm --> nested function
 * 
 * Builder là static class vì + Nếu non-static, muốn truy cập được Builder thì
 * phải tạo 1 đối tượng Item (ko hợp lý) --> Vì nếu tạo đc đói tượng Item thì k
 * cần dùng builder --> sai mục đích --> phải để static để lấy class . ra class
 * builder
 * 
 */
public class Item {
	private int id;
	private String name;
	private Double salesPrice;
	private Double buyPrice;
	private int amount;
	private LocalDate expiredDate;
	private LocalDate startedDate;
	private Double tax;

	private Item() {
	}

	public static Builder builder() {
		return new Builder();
	}

	public Item(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.salesPrice = builder.salesPrice;
		this.buyPrice = builder.buyPrice;
		this.tax = builder.tax;
		this.expiredDate = builder.expiredDate;
		this.startedDate = builder.startedDate;
		this.amount = builder.amount;

	}

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

	public int getAmount() {
		return amount;
	}

	public LocalDate getExpiredDate() {
		return expiredDate;
	}

	public LocalDate getStartedDate() {
		return startedDate;
	}

	public Double getTax() {
		return tax;
	}

	// nested class
	public static class Builder {
		private int id;
		private String name;
		private Double salesPrice;
		private Double buyPrice;
		private int amount;
		private LocalDate expiredDate;
		private LocalDate startedDate;
		private Double tax;

		// chỉ có setters, để gán giá trị sau khi tạo đối tượng builder

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

		public Builder withAmount(int amount) {
			this.amount = amount;
			return this;
		}

		public Builder withExpiredDate(LocalDate expiredDate) {
			this.expiredDate = expiredDate;
			return this;
		}

		public Builder withStartedDate(LocalDate startedDate) {
			this.startedDate = startedDate;
			return this;
		}

		public Builder withTax(Double tax) {
			this.tax = tax;
			return this;
		}

		public Item build() {
			return new Item(this);
		}

		public static Builder buidler() {
			return new Builder();
		}
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + ", buyPrice=" + buyPrice
				+ ", amount=" + amount + ", expiredDate=" + expiredDate + ", startedDate=" + startedDate + ", tax="
				+ tax + "]";
	}

}
