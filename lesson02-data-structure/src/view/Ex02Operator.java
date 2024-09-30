package view;

public class Ex02Operator {
	
	public static void main(String[] args) {
		// Toán tử = phép toán
		
		// = gán
		// += + xong rồi gán
		
		String s = "123";
		s = s + 'z'; // s += 'z'
		s = 'z' + s;
		System.out.println("s --> " + s);
		
		// Toán tử 1 ngôi
		int a1 = 5;
		// a1++; // a1+=1; a1=a1+1; suffix hậu tố
		// ++a1; // prefix tiền tố
		// Trong 1 biểu thức sử dụng a1
		// a1++ --> BT dùng giá trị của a1 hiện tại cho BT sau đó sẽ +1 sau
		// ++a1 --> +1 vào a1, sử dụng giá trị mới của a1 cho BT
		
		System.out.println("a1 --> " + ++a1);
		// System.out.println("a1 --> " + a1);
		
		// 5 4 11
		int x = 2;
		int y = 4; 
		int z = x++ + ++x - --y + y++ + ++x;
		System.out.printf("x(%s) y(%s) z(%s)", x, y, z);
		
		// Toán tử phủ định ! --> KDL boolean
		// Phủ định TRUE FALSE
		// Kiểm tra 1 biểu thức có phải là FALSE không
		boolean isEven = (z % 2 == 0);
		System.out.println("isEven --> " + !isEven);
		
		// Toán tử kết hợp && || --> toán tử luận lý
		// & | --> bitwise luôn & tất cả các BT
		// &&: BT tổng TRUE nếu tất cả các BT đều TRUE
		//   : nếu 1 biểu thức là FALSE dừng lại ko kiểm tra các biểu thức sau
		boolean isValid1 = (x++ > 8 || y-- > 2);
		System.out.printf("isValid1(%s) x(%s) y(%s)", isValid1, x, y);
	}
}
