package bean;

public class CarAdv {

	private String color;// range Obj
	
	// ngoại lệ cho tt static -> public
	public static String model;// range class

	// this: đại diện cho Obj current

	public CarAdv() {
	}

	public CarAdv(String color/* , String model */) {
		this.color = color;
		// tt static ko nên đc gán val tại constructor
		// vì nó sẽ set luôn giá trị chung cho all obj
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

	public void setModel(String model) {
		this.model = model;
	}

//	fix -> nhưng ko ai dùng như vậy
//	public static void setModel(String model) {
//		CarAdv.model = model;
//	}

	@Override
	public String toString() {
		return "CarAdv [color=" + color + ", model=" + model + "]";
	}

}
