package bin;

public class Car {
	
	public Integer id;
	public String model;
	public String name;
	public Double salesPrice;
	
	// constructor default
	public Car() {
	}

	// constructor full parameters
	public Car(Integer id, String model, String name, Double salesPrice) {
		this.id = id;
		this.model = model;
		this.name = name;
		this.salesPrice = salesPrice;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", name=" + name + ", salesPrice=" + salesPrice + "]";
	}
	
	
	
}


