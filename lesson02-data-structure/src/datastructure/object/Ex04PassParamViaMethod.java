package datastructure.object;

import bean.Item;

public class Ex04PassParamViaMethod {
	// primitive type
	long number = 22;

	// object typex
	Item it1 = new Item(27, 'A', 20d);
}

//	private static void update(Item item) {
//		item.name = 'H';
//		item = new Item(55,'R', 55d);
//		item.id = 77;
//		item.name = 'w';
//	}

// Khi bien duoc truyen tham so qua ham neu minh muon sau khi thoat khoi ham, bien duoc cap nhat gia tri thi:
// Bien kieu object
// Trong ham phai cap nhat gia tri tai HEAP