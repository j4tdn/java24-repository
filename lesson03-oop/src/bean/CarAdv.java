package bean;

public class CarAdv {

	private String color; // pvi đối tượng

	// ngoại lệ cho tt là public
	public static String model; // pvi class

	// this: đại diện cho đối tượng hiện tại

	public CarAdv() {
		// TODO Auto-generated constructor stub
	}

	public CarAdv(String color/* , String model */) {
		this.color = color;

		// thuộc tính static ko nên đc gán giá trị tại constructor
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