package bean;

public class Item {
	
	private Integer id;
	private String name;
	private Double salesPrices;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(Integer id, String name, Double salesPrices) {
		super();
		this.id = id;
		this.name = name;
		this.salesPrices = salesPrices;
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

	public Double getSalesPrices() {
		return salesPrices;
	}

	public void setSalesPrices(Double salesPrices) {
		this.salesPrices = salesPrices;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrices=" + salesPrices + "]";
	}
	
	
	
}
