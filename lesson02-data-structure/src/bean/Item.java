package bean;

public class Item {
	
	// thuộc tính 
	public int id;
	public char name;
	public double salesPrice;
	
	// Trong class
	// Mặc định nó sẽ có 1 hàm khởi tạo rỗng ( không có tham số )
	// Constructor: Có tên hàm trùng với tên class
	// Gọi constructor thì trả về KDL chính là class
	// Gọi thông qua từ khóa new
	// Item item1 = new Item();
	
	//Khi tạo 1 hàm khởi tạo mới, thì hàm mặc định mất đi, phải tự thêm vào
	public Item() {
		
	}
	/*
	 Bên ngoài
	 Item item3 = new Item();
	 item3.id = 3;
	 item3.name = 'B';
	 item3.salesPrice = 33d;
	 
	 Item item3 = new Item(3, 'C', 33d);
	 */
	
	public Item(int id, char name, double salesPrice) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
			
		
	}
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + "]";
	}
	
}
