package view;

public class Ex02Operator {

	public static void main(String[] args) {
		
		
		// = gán
		// += + rồi gán
		
		String s ="123";
		s = s + 'z';//s += 'z'
		s= 'z' + s;
		System.out.println("s -->" + s);
		
		// Toán tử 1 ngôi
		int a1 = 5;
		//a1++;// a1 += 1, a1 = a1 + 1, suffix hậu tố
		// ++a1; //prefix tiền tố
		// Trong 1 biểu thức sử dụng a1
		//a1++ --> BT dùng giá trị của a1 hiện tại cho BT, sau đó sẽ +1 sâu
		//++a1 --> +1 vào a1, sử dụng giá trị mới của a1 cho BT
		
		System.out.println("a1 --> "+ ++a1);
//		System.out.println("a1 --> " + a1);
		
		// 5 4 11
		int x = 2;
		int y = 4;
		int z = x++ + ++x - --y + y++ + ++x;
		boolean isEven = true;
		System.out.println("isEven -->" + !isEven);
		
		// Toán tử kết hợp ||  && --> toán tử luận lý
		// & | --> bitwise luôn & tất cả BT
		// &&: BT tổng TRUE nếu tất cả các BT đều TRUE
		//    : Nếu BT là FALSE dừng lại không ktra các BT sau
		boolean isValid1 = (x++ >8 || y-- >2);
		System.out.printf("isValid(%s) x(%s) y(%s)"  , isValid1,x,y );
	}
	
}
