package datastructure.primitive;

public class Ex04PassParamViaMethod {
	
	public static void main(String[] args) {
		int number = 22;
		int age = 18;
		
		modify(number);
		
		age = number;
		
		System.out.println("number -->" + number);
		System.out.println("age -->" + age);
		
		int a1 = 11;
		int a2 = 22;
		System.out.printf("a(%s) a2(%s)\n", a1, a2);
	
		//swap(a1,a2);
		
		System.out.printf("a(%s) a2(%s)", a1, a2);
	}
	
	private static void swap(int a1, int a2) {
		int  temp = a1;
		a1 = a2;
		a2 = temp;
	}
	
	
	/*
	 Khi gọi hàm, truyền tham số qua hàm
	 Toán từ =, copy giá trị ở vùng nhớ stack cho tham số
	 
	 Nếu như hàm trả về void và kiểu dữ liệu truyền vào là nguyên thủy thì 100% ra khỏi hàm, thì giá trị của biến
không đổi
	 */
	
	// int number = number (2 biến number khác nhau)
		private static void modify(int number) {
			number = 9999;
			System.out.println(number);
		}
			
		

}
