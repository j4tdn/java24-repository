package bean;

public class Car {
	
	private Integer id;
	private String model;
	private String name;
	private Double salesPrice;
	
	// Constructor default
	public Car() {
	}

	// Constructor full parameters
	public Car(Integer id, String model, String name, Double salesPrice) {
		this.id = id;
		this.model = model;
		this.name = name;
		this.salesPrice = salesPrice;
	}
	
	// getter, setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
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
	
	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", name=" + name + ", salesPrice=" + salesPrice + "]";
	}

	
}
