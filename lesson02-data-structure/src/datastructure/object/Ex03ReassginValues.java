package datastructure.object;

import bean.Item;

public class Ex03ReassginValues {
	public static void main(String[] args) {
		// cập nhập giá trị cho biến KDL nguyên thủy
		// kiểu dữ liệu nguyên thủy gán thông qua toán tử '='

		int a = 5;
		int b = 10;
		a = b;
		b = 20;

		// cập nhập giá trị tại ô nhớ mà biến đang trỏ đến STACK

		// cập nhập giá trị cho biến KDL đối tượng
		// KDT
		// dấu '=' lưu ở STACK => nếu gán i1 = i3 => địa chỉ của i3 gán cho dịa chỉ của
		// i1 ở STACK
		// ( vì KDL đối tượng chỉ lưu địa chỉ ở STACK, còn giá trị ở HEAP)
		// ==> cách 1: cập nhập địa chỉ của biến -> trỏ đến ô nhớ khác ở HEAP
		Item i1 = new Item(1, 'A', 11d);
		final Item i2 = new Item(2, 'B', 22d);
		Item i3 = new Item(3, 'C', 33d);
		System.out.println("i1---> " + i1);
		System.out.println("i2---> " + i2);
		System.out.println("i3---> " + i3);

		System.out.println("i1 address: " + System.identityHashCode(i1));
		System.out.println("i1 address: " + System.identityHashCode(i2));
		System.out.println("i1 address: " + System.identityHashCode(i3));
		i1 = i3;
		System.out.println("i1 address: " + System.identityHashCode(i1));
		System.out.println("i1 address: " + System.identityHashCode(i2));
		System.out.println("i1 address: " + System.identityHashCode(i3));
		// cách thứ 2: cập nhập ở HEAP
		i2.name = 'Z';
		System.out.println("item ===> " + i1);
		System.out.println("item ===> " + i2);
		System.out.println("item ===> " + i3);
	}

}
