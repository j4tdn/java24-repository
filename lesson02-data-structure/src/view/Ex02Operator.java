package view;

public class Ex02Operator {
	public static void main(String[] args) {

		// toán tử -- phép toán

		// = gán
		// += cộng rồi gán

		int a = 5;
		a = a + 5;

		String s = "123";
		s += 'z'; // s = s+ 'z'
		s = 'z' + s;
		System.out.println("s--> " + s);

		// Toán tử 1 ngôi
		int a1 = 5;
		// a1++; // a1 = a1+1; a1+=1; suffix: hậu tố
		// ++a1; // prefix: tiền tố
		// Trong 1 biểu thức xài a1
		// a1++ --> BT dùng giá trị hiện tại a1 cho biểu thức rồi cộng 1 sau
		// ++a1 --> +1 vào a1, sử dụng giá trị mới của a1 cho biểu thức
		System.out.println("a1--> " + a1++);
		System.out.println("a1--> " + a1);

		int x = 2;
		int y = 4;
		int z = x++ + ++x - --y + y++ + ++x;
		System.out.printf("x(%s) y(%s) z(%s)", x, y, z);

		// Toán tử phủ định ! --> KDL boolean
		// Phủ định TRUE FALSE
		// Kiểm tra 1 biểu thức có phải là false ko
		boolean isEven = (y % 2 == 0);
		System.out.println("isEven --> " + !isEven);

		// Toán tử kết hợp && || --> toán tử luận lý
		// & | --> bitwise luôn & tất cả các biểu thức
		// &&: BT tổng TRUE nếu tất cả các BT đều TRUE
		// : nếu 1 biểu thức false thì dừng lại ko kiểm tra các BT sau
		// ||: Sẽ tiếp tục thực thi các biểu thức cho đến khi gặp TRUE, nếu gặp TRUE
		// trước sẽ ko thực thi BT sau
		boolean isValid1 = (x++ > 6 && y-- > 2);
		System.out.printf("isValid(%s), x(%s) y(%s) ", isValid1, x, y);
		boolean isValid2 = (x++ > 4 || y-- > 2);
		System.out.printf("isValid(%s) x(%s) y(%s) ", isValid2, x, y);
	}
}
