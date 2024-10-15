package bean;

public class CarAdv {
	
	private String color; // phạm vi đối tượng
	
	// ngoại lệ cho tt static là public
	public static String model; // phạm vi class
	
	// this là đại diện cho đói tượng hiện tại
	
	public CarAdv() {
	}

	public CarAdv(String name/* , String model */) {
		this.color = name;
		
		// TT static ko nên được gán giá trị tại constructor
		// Vì nó sẽ set luôn giá trị chung cho tất cả đói tượng
		//this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String name) {
		this.color = name;
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
