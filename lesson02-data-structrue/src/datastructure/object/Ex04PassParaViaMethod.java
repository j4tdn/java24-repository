package datastructure.object;

import bean.Item;

public class Ex04PassParaViaMethod {

	public static void main(String[] args) {

		long number = 22;
		number = 44;

		Item it1 = new Item(1, 'A', 11d);
		Item it2 = new Item(2, 'B', 22d);
		// cap nhap val tai STACK
		it1 = new Item(1, 'W', 111);
		it1 = it2;
		// cap nhap val tai HEAP
		it1.name = 'Z';

		System.out.println("=========================");

		int digit = 55;

		Item it3 = new Item(3, 'C', 33d);

		modify(digit);
		modify(it3);

		System.out.println("digit --> " + digit);
		System.out.println("it3 --> " + it3);
		
		// bien can luu gia tri thi int
		// khong can thi Integer (co the gia tri hoac null)
		
		/*
		 * Khi bien duoc truyen tham so qua ham Neu sau khi thoat khoi ham, bien duoc
		 * cap nhap gia tri thi + Bien KDL obj + Trong ham phai cap nhap val tai HEAP
		 * cua bien do
		 */
		
		Item it4 = new Item(4, 'D', 44);
		update(it4);
		System.out.println("it4 --> " + it4);

	}

	private static void update(Item item) {
		item.name = 'H';
		item = new Item(55, 'R', 55d);
		item.id = 77;
		item.name = 'W';
		item.salesPrice = 77;
	}

	private static void modify(int element) {
		element = 66;
	}

	private static void modify(Item element) {
		element.name = 'V';
	}

//	private static void modify(Item element) {
//		element = new Item(9, 'T', 99d);
//	}

}
