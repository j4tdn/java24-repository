package bean;

public class Store {
	
	// attributes
	public char name;
	public int openingTime;
	public int closingTime;
	
	// Hàm khởi tạo rỗng không có tham số
	public Store() {
	}

	// Hàm khởi tạo full tham số
	public Store(char name, int openingTime, int closingTime) {
		this.name = name;
		this.openingTime = openingTime;
		this.closingTime = closingTime;
	}

	@Override
	public String toString() {
		return "Store [name=" + name + ", openingTime=" + openingTime + ", closingTime=" + closingTime + "]";
	}
}
