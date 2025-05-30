package bean;

/*
 * Class: chứa hàm main --> chạy thực thi code
 * Class: kiểu dữ liệu đối tượng
 * 
 * KDL int : chứa giá trị số 
 * 
 * KDL Item: có 3 thuộc tính id, name, salesPrice
 * --> Khi biến có KDL Item thì giá trị của biến đó phải gồm: id, name, salesPrice  
 * --> Biến kiểu Item nó sẽ trỏ đến ô nhớ luôn có 3 thuộc tính này
 * --> Giá trị của KDL đối tượng lưu ở vùng nhớ HEAP
 */

public class Item {
	
	// thuộc tính
	public int id;
	public char name;
	public double salesPrice;
	
	// Trong class
	// Mặc định nó sẽ có 1 hàm khởi tạo rỗng(ko có tham số)
	// Constructor: Có tên hàm trùng với tên class
	// Gọi constructor thì trả về KDL chính là class
	// Gọi thông qua từ khóa new
	// Item item1 = new Item();
	// Khi tạo 1 hàm khởi tạo mới, thì hàm mặc định mất đi, 
	// phải tự thêm vào
	public Item() {
	}
	
	/*
	 Bên ngoài
	 Item item3 = new Item();
	 item3.id = 3;
	 item3.name = 'C';
	 item3.salesPrice = 33d;
	 
	 Item item3 = new Item(3, 'C', 33d);
	 */
	public Item(int id, char name, double salesPrice) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
	}

	// System.out.println("item3 ==> " + item3);
	// System.out.println("item4 ==> " + item4);
	
	// this = item3
	// this = item4
	@Override
	public String toString() {
		return "Item [id=" + this.id + ", name=" + this.name + ", salesPrice=" + this.salesPrice + "]";
	}
	
}
