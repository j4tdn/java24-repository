package builder;

import java.lang.module.ModuleDescriptor.Builder;
import java.time.LocalDate;

/**
 * Sử dụng builder pattẻn để tạo đói tượng cho Item --> Cách 1(truyền thống)
 * 
 * Từ Item B1: nhờ builder tạo ra 1 đối tượng chứa đầy đủ thông tin như Item ->
 * có đầy đủ tt giống Item B2: Item muốn set bao nhiêu tt thì dùng builder set
 * trc rồi copy sau B3: Gọi hàm build trong class Builder để build
 * 
 * bản thân class item Không được phép tự tạo đối tượng --> private constructor
 * Muốn Item immutable -> chỉ tạo hàm getter,không tạo hàm setter
 * 
 * Builder là static class vì + nếu non-static, muốn truy cập được builder thì
 * phải tạo 1 đối tượng Iem (K hợp lý, vì nếu tạo đối tượng Item thì không cần
 * dùng Builder, dùng builder để tạo)
 * 
 * +Tạo đối tượng builder thông qua Item.builder()
 */
public class Item {

	private int id;
	private String name;
	private double salesPrice;
	private double buyPrice;
	private double tax;
	private int amount;
	private LocalDate startDate;
	private LocalDate expiredDate;

	private Item() {
	}

	private Item(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.salesPrice = builder.salesPrice;
		this.buyPrice = builder.buyPrice;
		this.tax = builder.tax;
		this.amount = builder.amount;
		this.startDate = builder.startDate;
		this.expiredDate = builder.expiredDate;
	}

	public static Builder builder() {
		return new Builder();
	}

	// Chỉ có getters
	// không có setters(muốn immutable, không thể set giá trị các tt trong ô
	// nhớ ở HEAP)

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalesPrice() {
		return salesPrice;
	}

	public double getBuyPrice() {
		return buyPrice;
	}

	public double getTax() {
		return tax;
	}

	public int getAmount() {
		return amount;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getExpiredDate() {
		return expiredDate;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + ", buyPrice=" + buyPrice + ", tax="
				+ tax + ", amount=" + amount + ", startDate=" + startDate + ", expiredDate=" + expiredDate + "]";
	}

	// Nested class
	public static class Builder {
		private int id;
		private String name;
		private double salesPrice;
		private double buyPrice;
		private double tax;
		private int amount;
		private LocalDate startDate;
		private LocalDate expiredDate;

		// Chỉ có setters, để gán giá trị sau khi tạo đối tượng builder
		// setters
		
		public Builder withId(int id) {
			this.id = id;
			return this;
		}

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withSalesPrice(double salesPrice) {
			this.salesPrice = salesPrice;
			return this;
		}

		public Builder withBuyPrice(double buyPrice) {
			this.buyPrice = buyPrice;
			return this;
		}

		public Builder withTax(double tax) {
			this.tax = tax;
			return this;
		}

		public Builder withAmount(int amount) {
			this.amount = amount;
			return this;
		}

		public Builder withStartDate(LocalDate startDate) {
			this.startDate = startDate;
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
}
