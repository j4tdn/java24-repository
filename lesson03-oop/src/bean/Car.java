package bean;

public class Car {
	
	//attribute
	private Integer id;
	private String model;
	private String name;
	private Double salesPrice;
	private List<String> colors = new ArrayList<>(); //dynamic list
	
	//constructor defaulf
	public Car() {
		
	}
	// constructor fulll parameters
	public Car(Integer id, String model, String name, Double salesPrice) {
		
		this.id =id;
		this.model =model;
		this.name =name;
		this.salesPrice =salesPrice;
	}
	
	//getter, setter
	
	//c1.salesPrice =2600d;
	//c1.setSalesPrice(2600);
	
	public void setSalesPrice(Double salesPrice) {
		this.salesPrice = salesPrice;
	}
	
	public Double getSalesPrice() {
		return salesPrice;
	}
	
	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", name=" + name + ", salesPrice=" + salesPrice + "]";
	}
	

}
