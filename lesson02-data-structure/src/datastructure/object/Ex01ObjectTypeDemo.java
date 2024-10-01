package datastructure.object;

import bean.Item;

public class Ex01ObjectTypeDemo {

	public static void main(String[] args) {
		int a = 5;
		char c = 'A';
		Item item1 = new Item(); 
		// new Item(): là giá trị của biến item1 hay còn gọi là đối tượng
		//-> đang tạo ra 1 đói tượng Item nằm ở HEAP
		//
		item1.id = 1;
		item1.name = 'a';
		item1.salesPrice = 15d;
		System.out.println("item1 id= " + item1.id);
		System.out.println("item1 name= " + item1.name);
		System.out.println("item1 price= " + item1.salesPrice);
		System.out.println("item1 ===>" + item1);
		//Tất cả mọi class đều mặc dịnh kế thừa từ 1 clas tên là "object" 
		//Khi in biến KDL đối tượng mặc định --> Biến đó gọi đén hàm totsring trong class Object
		// Khởi tjao ô nhớ kèm giá trị mặc định cho thuộc tính 
		Item item2 = new Item();
		// Gán, truyền giá trị vào cho các tt cùa ô nhớ 
		item2.id = 2;
		item2.name = 'B';
		item2.salesPrice = 22d;
		System.out.println("item2: " + item2);
		
		Item item3 = new Item();
		item3.id = 3;
		item3.name = 'C';
		item3.salesPrice = 33d;
		System.out.println("item3: " + item3);
		
		Item item4 = new Item( 4,'D', 44d);
		System.out.println("Item4 =" + item4);
	}
}
