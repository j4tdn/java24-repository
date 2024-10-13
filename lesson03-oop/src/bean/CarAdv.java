package bean;

public class CarAdv {

	private String color; // phạm vi đối tượng
	public static String model; // phạm vi class, có ngoại lệ được để public nếu là static
	// this: chỉ đối tượng hiện tại
	// Vd: c1.color = "Red" --> this lúc này là c1

	public CarAdv() {
	}

	public CarAdv(String color/* , String model */) { // các cmt nhanh bôi đen: ctrl + shift + /
		this.color = color;
		// TT static ko nên đc gán giá trị tại constructor
		// Vì sẽ set luôn giá trị chung cho all đối tượng

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

	public String toString() {
		return "CarAdv [color=" + color + ", model=" + model + "]";
	}

}
