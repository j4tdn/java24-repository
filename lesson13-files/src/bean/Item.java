package bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Item implements Serializable {
	private static final long serialVersionUID = -7025520019199957049L;
	
	private Integer id;
	private String name;
	private LocalDate expiredDate;
	private BigDecimal salesPrice;
	
	public Item() {
	}

	public Item(Integer id, String name, LocalDate expiredDate, BigDecimal salesPrice) {
		this.id = id;
		this.name = name;
		this.expiredDate = expiredDate;
		this.salesPrice = salesPrice;
	}
	
	public Item(String line) {
		String[] tokens = line.split(", ");
		if(tokens.length == 4) {
			this.id = Integer.parseInt(tokens[0]);
			this.name = tokens[1];
			this.expiredDate = LocalDate.parse(tokens[2], DateTimeFormatter.ofPattern("yyyy-MM-dd"));
			this.salesPrice = new BigDecimal(tokens[3]);
		}
		
	}
	
	public String toLine() {
		return getId() + ", " + getName() + ", " + getExpiredDate() + ", " + getSalesPrice();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(LocalDate expiredDate) {
		this.expiredDate = expiredDate;
	}

	public BigDecimal getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(BigDecimal salesPrice) {
		this.salesPrice = salesPrice;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		
		if(!(o instanceof Item that)) {
			return false;
		}
		
		return getId() == that.getId();
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", expiredDate=" + expiredDate + ", salesPrice=" + salesPrice
				+ "]";
	}
	
	
	
}
