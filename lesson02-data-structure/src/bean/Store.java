package bean;
// B1: tạo kiểu dữ liệu
public class Store {
	public char nameStore; 
	public int openTime;
	public int closeTime;
	//B2: tạo hàm khởi tạo rỗng ko tham số
	public Store() {}
	//B3: tạo hàm khởi tạo tham số
	public Store(char nameStore, int openTime, int closeTime) {
	
		this.nameStore = nameStore;
		this.openTime = openTime;
		this.closeTime = closeTime;
	}
//B4: tạo hàm toSring
	public String toString() {
		return "Store [nameStore=" + nameStore + ", openTime=" + openTime + ", closeTime=" + closeTime + "]";
	
	}
}



