package datastructure.primitive;

public class Ex04PassParamViaMethod {

	public static void main(String[] args) {
		int number = 22;
		int age = 18;

		modify(number);
		age = number;
		System.out.println("number -->" + number);
		System.out.println("age -->" + age);

		int a1 = 11; // ô nhớ đỏ
		int a2 = 22;
		System.out.printf("a(%s) a2(%s)\n", a1, a2);
		swap(a1, a2);
		System.out.printf("a(%s) a2(%s)\n", a1, a2);
	}

	// vì a1, a2 này ở trong private và khi gọi hàm swap(a1, a2) a1,a2 sẽ được
	// truyền giá trị từ a1,a2 ở ô nhớ đỏ
	// => swap chỉ thay đổi giá trị ở trong ô nhớ xanh ( hàm swap ) nên kết quả
	// không thay đổi
	private static void swap(int a1, int a2) {
		int temp = a1;
		a1 = a2;
		a2 = temp;
	}

	/*
	 * Khi gọi hàm, hoặc truyền tham số qua hàm Toán tử '=' copy giá trị ở vùng nhớ
	 * STACK cho tham số vd: modify(number): gọi hàm modify có tham số number rồi
	 * truyền vào giá trị ở STACK của number main cho tham số number = number (main
	 * = 22);
	 */
	private static void modify(int a) {
		a = 9999;

	}
}
