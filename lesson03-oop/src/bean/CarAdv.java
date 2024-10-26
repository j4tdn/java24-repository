package bean;

public class CarAdv {
	private String color; // Phạm vi đối tượng
	public static String model; // Phạm vi class
	
	// This đại diện cho đối tương hiện tại
	public CarAdv() {
		
	}

	public CarAdv(String color/*, String model*/) {
		
		this.color = color;
		// Thuộc tính static không nên được gán giá trị tại constructor
		// Vì nó sẽ set luôn giá trị chung cho tất cả đối tượng
		//this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public static void setModel(String model) {
		CarAdv.model = model;
	}
	@Override
	public String toString() {
		return "CarAdv [color=" + color + ", model=" + model + "]";
	}
	

	
}
