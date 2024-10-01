package datastructure.primitive;

public class Ex01PassParamViaMethod {
	public static void main(String[] args) {
		int number = 22;// đỏ
		int age = 18;
		
		modify(number);
		
		age = number;
		
		System.out.println("number-->" + number);
		System.out.println("age-->" + age);
		
		
		int a1 = 11;
		int a2 = 22;
		System.out.printf("a1(%s) a2(%s)\n", a1, a2);
				
		
		swap(a1, a2);
		System.out.printf("a1(%s) a2(%s)\n", a1, a2);
	}
//	private static int swapTrick(int a1, int a2) {
//	}
	private static void swap(int a1, int a2) {
		int temp = a1;
		a1 = a2;
		a2 = temp;
	}
	/*
	 Khi gọi hàm , truyền tham số qua hàm
	 Toán từ = , copy giá trị ở vùng nhỏ stack cho tham số
	 
	 nếu như hàm trả về void và KDL truyền vào là nguyên thủy => 100% ra khỏi làm giá trị của biển đó không đổi
	 
	 */
	//int number = number;
	private static void modify(int number) { // xanh
		number = 9999;
	}

}