package been;

public class Car {
	
	private Integer id;
	private String model;
	private String name;
	private Double salesPrice;
	
	// constructor default
	public Car() {
		// TODO Auto-generated constructor stub
	}

	// constructor full parameters
	//Souce + using fields
	public Car(Integer id, String model, String name, Double salesPrice) {
		this.id = id;
		this.model = model;
		this.name = name;
		this.salesPrice = salesPrice;
	}
	
	//getter , setter
	// c1.salesPrice = 2600d;
	// c1.setSalesPrice(2600);
//	public void setSalesPrice(Double salesPrice) {
//		this.salesPrice = salesPrice;
//	}
//	public Double getSalesPrice() {
//		return this.salesPrice;
//	}

	
	
	//souce + toString()
	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", name=" + name + ", salesPrice=" + salesPrice + "]";
	}

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
	

}
