package view;

public class Ex02Operator {

	public static void main(String[] args) {
		
		String s = "123";
		s += 'z';
		s = 'z' + s;
		System.out.println("s --> " + s);
		
		int a1 = 5;
		System.out.println("a1 --> " + ++a1);
		//System.out.println("a1 --> " + a1);
				
		//5 4 11
		int x = 2;
		int y = 4;
		int z = x++ + ++x - --y + y++ + ++x;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		
		// && ||: toan tu luan ly
		// neu 1 BT true no se dung khong kie mtra bieu thuc sau
		// con neu sai thi no se kiem tra BT ke tiep
		// & | --> bitwise luon & tat ca cac bt (du dung hay sai no van check het all)
		boolean isValid = (x++ > 4 || y-- > 2);
		System.out.printf("isValid(%s) x(%s) y(%s)", isValid, x, y);
		
	}
	
}
