package datastructure.object;

import bean.Item;

public class Ex01ObjectTypeDemo {

	public static void main(String[] args) {
		int a = 5;
		char c = 'A';

		/*
		 * new Item() đang tạo ra 1 obj Item nằm ở HEAP == ô nhớ ở HEAP biến ở STACK
		 * STACK không cần địa chỉ, HEAP cần địa chỉ HEAP *-> STACK
		 */
		Item item1 = new Item();
		item1.id = 1;
		item1.name = 'A';
		System.out.println("item1 => " + item1);
		// tất cả mọi class đều kế thừa từ class "Obj"
		// khởi tạo ô nhớ kèm giá trị mặc định cho thuộc tính
		Item item2 = new Item();
		// gán val vào cho các tt của ô nhớ
		item2.id = 2;
		item2.name = 'b';
		item2.salesPrice = 22d;
		System.out.println("item2 => " + item2);

		Item item3 = new Item();
		item3.id = 3;
		item3.name = 'c';
		item3.salesPrice = 33d;
		System.out.println("item3 => " + item3);

		Item item4 = new Item(4, 'd', 2d);
		System.out.println("item4 => " + item4);

	}

}
