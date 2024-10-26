package bean;

public class Car {
	public Integer Id;
	private String model;
	private String name;
	private Double salesPrice;
	
	//contructor default 
	public Car() {
		
	}

	//contructor full parameters
	public Car(Integer id, String model, String name, Double salesPrice) {
		Id = id;
		this.model = model;
		this.name = name;
		this.salesPrice = salesPrice;
	}
	
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
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
		return "Car [Id=" + Id + ", model=" + model + ", name=" + name + ", salesPrice=" + salesPrice + "]";
	}

	
	
	
	
	
}
