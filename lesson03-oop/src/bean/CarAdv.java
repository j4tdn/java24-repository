package bean;

public class CarAdv {
	public static String model; // pham vi cua class
	private String color; // pham vi cua doi tuong

	public CarAdv() {
		// TODO Auto-generated constructor stub
	}

	public CarAdv(/* String model, */ String color) {
		// thuoc tinh static khong nen duoc gan gia tri tai constructor
		// vi no set luon gia tri rieng thanh cua chung cho tat ca doi tuong
		// this.model = model;

		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "CarAdv [model=" + model + ", color=" + color + "]";
	}

}
