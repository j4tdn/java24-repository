package bean;
/*
 kiếu đối tượng có 1 hoặc nhiều thông tin bên trong
 
 */
public class Item {
	public int id;
	public char name;
	public double salesPrice;
	
	// trong class
	// mặc định nó sẽ có 1 hàm khởi tạo
	// constructor : có tên hàm trùng với tên class
	// gọi constructor thì trả về KDL chính là class
	//Thông qua từ khóa new
	public Item() {//đây là hàm khởi tạo trùng tên với tên class và không có kiểu dữ liệu trả về
		
	}
	/*
	 * bên ngoài
	 Item item3 = new Item();
		item3.id = 3;
		item3.name = 'C';
		item3.salesPrice = 33d;
		-->
		Item item3 = new Item(3 , 'C' , 33d);
		System.out.println("item3 ==>" + item3);
	 */
	public Item(int id, char name , double salesPice) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPice;
	}

	@Override //source -> toString
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + "]";
	}
	
	

}