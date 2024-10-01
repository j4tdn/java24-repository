package bean;
/*?
 * Class: chứa hàm main --> thưc thi code
 * Class: kiểu dữ liệu đối tượng
 * KDL int: chứa giá trị số
 * KDL item: có 3 thuộc tính id, name, salePrice
 * --> Khi 1 biến có KDL Item thì giá trị của biến đó phải gồm: id, name và salesPrice
 * --> Biến kiểu Item nó sẽ trỏ đến ô nhớ luôn có 3 thuộc tính này
 * --> Giá trị của KDP đối tượng lưu ở vùng nhớ HEAP
 */
public class Item {
	// thuộc tính
	public int id;
	public char name;
	public double salesPrice;
	
		// Trong 1 class
		// mặc định sẽ có 1 hàm khởi tạo rỗng (Ko có tham số)
		// Constructor: có tên hàm trùng với tên class
		// Gọi hàm constructor trả về KDL chính là của class
		// Gọi thông qua từ khóa new
		// Item item1 = 
		// Khi tạo 1 hàm khởi tạo mới thì hàm mặc định mất đi, phải tự thêm vào
	public Item() {
	}
	/*
	 Bên ngoài
	 	Item item3 = new Item();
		item3.id = 3;
		item3.name = 'C';
		item3.salesPrice = 33d;
		System.out.println("Item3 ==> " + item3);
		
		Item item3 = new Item(3, 'C', 33d);
	 
	 */
	public Item(int id, char name, double salesPrice ) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
		
	}
	// this = item3 là biến tạm thời

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + "]";
	}
	
	

}
