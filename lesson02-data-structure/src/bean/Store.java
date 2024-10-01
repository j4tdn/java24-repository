package bean;

public class Store {
	
	// attribute
	public char name;
	public int  openingTime;
	public int  closingTime;
	
	// Hàm khời tạo rỗng cho tham số 
	// khi tạo 1 hàm khởi tạo mới, thì hàm mặc định mất đi, phải tạo thêm vào
	public Store () {
		
	}

    //source + using fields.....
	// hàm khởi tạo full tham số
	public Store(char name, int openingTime, int closingTime) {
		this.name = name;
		this.openingTime = openingTime;
		this.closingTime = closingTime;
	}
	//source -> toString
	@Override
	public String toString() {
		return "Store [name=" + name + ", openingTime=" + openingTime + ", closingTime=" + closingTime + "]";
	}
	
	
	
	
	

}