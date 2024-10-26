package bean;

/*
 * Class: chứa hàm main --> chạy thực thi code
 * Class: kiểu dữ liệu đối tượng
 */

public class Item {
	
	
	// Biến toàn cục hay thuộc tính
	public int id;
	public char name;
	public double salesPrice;
	
	// Trong class
	// Mặc định nó sẽ có 1 hàm khởi tạo rỗng (không có tham số)
	// Constructor: Có tên hàm trùng với tên Class
	// Gọi Constructor thì trả về KDL chính là Class
	// Gọi thông qua từ khóa new
	// Item item1 = new Item();
	// Khi tạo một hàm khởi tạo mới, thì hàm mặc định mất đi
	// Phải tự thêm vào
	public Item() {
		
	}

	// Hàm khởi tạo full
	public Item(int pID, char pName, double pSalesprice) {
		this.id = pID;
		this.name = pName;
		this.salesPrice = pSalesprice;
	}
	
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + "]";
	}
	
}
	