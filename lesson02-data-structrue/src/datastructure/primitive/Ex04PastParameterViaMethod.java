package datastructure.primitive;

public class Ex04PastParameterViaMethod {

	public static void main(String[] args) {
		int number = 22;
		int age = 18;
		modify(number);
		age = number;

		System.out.println("number --> " + number);
		System.out.println("age --> " + age);

		int a1 = 11;
		int a2 = 22;
		System.out.printf("a1(%s) a2(%s)\n", a1, a2);

		swap(a1, a2);

		System.out.printf("a1(%s) a2(%s)\n", a1, a2);
	}

	private static void swap(int a1, int a2) {
		int tmp = a1;
		a1 = a2;
		a2 = tmp;
	}
	
	/*
	 Khi gọi hàm, truyền tham số qua hàm
	 Toán tử =, copy giá trị ở vùng nhớ stack cho tham số
	 
	 Nếu như hàm trả về void và KDL truyền vào là nguyên thủy
	 100% ra khỏi hàm giá trị của biến không đổi
	 */
	
	private static void modify(int number) {
		number = 9999;
	}
	
}
