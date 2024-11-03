package datastructure.object;

import bean.Item;

public class Ex04PassParamViaMethod {
	public static void main(String[] args) {

		// primitive type
		long number = 22;

		// => Cập nhập giá trị cho biến
		number = 4;

		// object type (đối tượng do mình tự tạo ra)
		Item it1 = new Item(1, 'A', 11d);
		Item it2 = new Item(2, 'B', 22d);

		// => cập nhập giá trị cho biến
		// -> cập nhập giá trị tại STACK
		it1 = new Item(1, 'W', 111);
		it1 = it2;

		// -> cập nhập giá trị tại HEAP
		it1.name = 'Z';

		System.out.println("====================");
		int digit = 55;
		Item it3 = new Item(3, 'C', 33d);
		modify(digit);

		modify(it3);
		System.out.println("digit ---> " + digit);
		System.out.println("it3 --> " + it3);

		/*
		 * Kh biến dc tyèn tham số qua hàm Nếu muốn sau khi thoát khỏi hàm, biến đc cập
		 * nhập giá trị thì biến phải thuộc: + biến thuộc KDL đối tượng + Trong hàm cập
		 * nhập giá trị HEAP của biến
		 * 
		 */// int element = digit
		Item it4 = new Item(4, 'D', 44); // H1
		update(it4);
		System.out.println("it4= " + it4);
	}

	// Item item = it4;
	// khi gọi hàm update(it4) truyền giá trị của biến it4 vào item
	// mà it4 có giá trị ở STACK là H1 => giá trị của item cũng là H1
	private static void update(Item item) {
		item.name = 'X'; // giá trị item đang là H1 nên khi thực hiện dòng này sẽ đổi giá trị trên HEAP
							// của H1
		item = new Item(55, 'R', 55d); // item đã trỏ sang ô nhớ H2 nên mọi thay đổi sẽ cập nhập giá trị ở HEAP của H2
		item.id = 77;
		item.name = 'W';
		item.salesPrice = 77;
	}

	private static void modify(int element) {
		element = 66;
	}

	private static void modify(Item element) {
		element.name = 'V'; // cập nhập giá trị tại HEAP
	}
	// Item element = it3 -> chung dữ liệu ở STACK
	// private static void modify(Item element) {
	// element = new Item(9, 'W', 131);
	// }
}
//Câu hỏi: vì sao có int rồi còn dùng Interger ?
// khi nào biến mình cần lưu trữ BẮT BUỘC có giá trị 
// thì dùng int, còn không bắt buộc ( như thông tin thêm ) thì sử dụng integer 
