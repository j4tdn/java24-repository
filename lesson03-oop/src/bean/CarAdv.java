package bean;

public class CarAdv {
	
	private String color;
	
	//Ngoại lệ cho tt static là public
	public static String model;
	
	//This: đại diện cho đối tượng hiện tại
	
	public CarAdv() {
	}


	public CarAdv(String color/*, String model*/) {
		this.color = color;
		
		// TT static không nên được gán giá trị tại contructor
		// Vì set luôn giá trị chung cho tất cả đối tượng
//		this.model = model;
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
