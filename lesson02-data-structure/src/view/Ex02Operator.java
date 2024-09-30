package view;

public class Ex02Operator {
	public static void main(String[] args) {
		String s = "123";
		s = s + "z";
		s = "z" + s;
		System.out.println("s --> " + s);
		//toán tử 1 ngôi
		int a1=5;
		
		//a1++ --> BT dùng giá trị cỉa a1 hiện tại cho BT sau đó sẽ +1 sau
		// ++a1 --> +1 vào a1, sử dụng giá trị mới của a1 cho BT
		
		System.out.println("a1 --> " + ++a1);
		
		int x = 2;
		int y = 4;
		int z = x++ + ++x - --y + y++ + ++x;
		System.out.printf("x(%s) y(%s) z(%s) ", x, y, z);
		
		boolean isEven = (y % 2 ==0);
		System.out.println("isEven --> " + isEven);
		
		boolean isValid1 = (x++ > 8 || y-- >2);
		System.out.printf("isValid1(%s) x(%s) y(%s) ", isValid1, x, y);
		
		
	}
}
