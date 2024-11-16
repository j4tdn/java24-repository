package datastructure.primitive;

public class Ex04PassParamViaMethod {
	
	public static void main(String[] args) {
		int number = 22;  // đỏ
		int age = 18;
		
		modify(number); 
		
		age = number;
		
		System.out.println("number -->" + number); // 22
		System.out.println("age ----> " + age); // 22
		
		int a1 = 11;
		int a2 = 22;
		System.out.printf("\na1(%s) a2(%s)\n", a1, a2);
		
		//swap(a1, a2);
		a2 = swapTrick(a1,a1 = a2);
		System.out.printf("\na1(%s) a2(%s)\n", a1, a2);
		
	}

	private static int swapTrick(int a1, int a2) {
		return a1;
	}
//	private static void swap(int a1,int a2) {
//		int temp = a1;
//		a1 = a2;
//		a2 = temp;	
//	}
	/*
	 Khi gọi hàm, truyền tham số qua hàm
	 Toán tử =, copy giá trị ở vùng stack cho tham số	
	 
	 Nếu như hàm trả về void và KDL truyền vào là nguyên thủy
	 100% ra khỏi hàm giá trị không đổi
	 */
	
	//int number = number xanh
	private static void modify(int number) { //xanh
		number = 9999;
	}

}
