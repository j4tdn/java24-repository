package bean;

public class CarAdv {
	
	private String color; // phạm vi đối tượng
	
	// ngoại lệ cho tt static là public
	public static String model; // phạm vi class
	
	// this: đại diện cho đối tượng hiện tại
	
	public CarAdv() {
	}

	public CarAdv(String color/* , String model */) {
		this.color = color;
		
		// TT static ko nên được gán giá trị tại constructor
		// Vì set luôn giá trị chung cho tất cả đối tượng
		// this.model = model;
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