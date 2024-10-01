package datastructure.object;

import bean.Item;

public class Ex05ObjectTypeAvailable {

	public static void main(String[] args) {
		// khai báo/ gắn giá trị số/ kí tự cho KDL byte, char
		// sử dụng, ỉn ra
		// char => kí tự
		// byte => số trong bảng mã ASCII tương ứng vs kí tự đó
		char c1 = 66; // đều có thể khai báo chữ và số(bảng mã ASCII)-> kết quả là chữ
		byte c2 = 'A'; // in ra số trên bảng mã ASCII

		// primitive
		int x1 = 5;

		// object type
		Item i1 = new Item();
		Item i2 = new Item(2, 'B', 22d);

		// object type: available
		// integer: value
		// String: value( byte[])
		Integer o1 = new Integer(55);
		String s1 = new String("Hello");
		Long l1 = new Long(551);
		System.out.println("o1===> " + o1);
		System.out.println("s1===> " + s1);
		System.out.println("l1===> " + l1);

		// ALL: khởi tạo đối tượng sd toán tử "new"
		/*
		 * Với KDL đối tượng có sẵn của java integer, Long, String, double ko cần phải
		 * dùng new mà có thể gán trực tiếp giá trị cho đối tượng
		 */
		// chỉ cho phép với những kiểu dữ liệu đối tượng có sẵn của java:
		// + integer, Long, String, Double ...
		// Vì KDL có sẵn duy nhất 1 thuộc tính
		// Thay vì new đối tượng rồi set giá trị thì
		// chỉ cần gán giá trị, còn việc new và set thì java tự làm

		Integer o2 = 66;

		String s2 = "word";

	}

}
