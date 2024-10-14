package been;

public class CarAdv {
	private String color; // phạm vi đối tượng
	public static String model; // phạm vi class
	
	// this : đại diện cho đối tượng hiện tại
	
	public CarAdv() {
		// TODO Auto-generated constructor stub
	}

	public CarAdv(String color/* , String model */) {
		this.color = color;
		// thuộc tính static không nên gán giá trị tại constructor
		// vì nó sẽ set luôn giá trị chung cho tất cả đối tượng
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
