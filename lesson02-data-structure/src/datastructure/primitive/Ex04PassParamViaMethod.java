package datastructure.primitive;

public class Ex04PassParamViaMethod {
	
	public static void main(String[] args) {
		int number = 22; // đỏ
		int age = 18;
		
		modify(number);
		age = number;
		
		System.out.println("number ---> " + number);
		System.out.println("age ---> " + age);
		
		int a1 = 11;
		int a2 = 22;
		System.out.printf("a1(%s) a2(%s)", a1, a2);
		
		//swap(a1,a2);
		a2 = swapTrick(a1,a1 = a2);
		System.out.printf("a1(%s) a2(%s)",	a1, a2);
		
	}
	
	public static void swap(int a1,int a2) {
		int temp = a1;
		a1 = a2;
		a2 = temp;
	}
	
	private static int swapTrick(int a1,int a2) {
		return a1;
	}
	
	
	
	/*
	 Khi gọi hàm, truyền tham số qua hàm
	 Toán tử = , copy giá trị ở vùng nhớ stack để gán cho tham số
	 
	 Nếu như hàm trả về void và truyền vào là KDL nguyên thủy
	 100% ra khỏi hàm giá trị của biến không đổi	
	 */
	
	private static void modify(int number) { // xanh
		number = 9999;
		
	}

}
