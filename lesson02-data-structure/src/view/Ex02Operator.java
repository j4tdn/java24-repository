package view;

public class Ex02Operator {
	
	public static void main(String[] args) {
		// toán tử = phép toán
		String s = "123";
		s = s + 'z';
		s = 'z' + s;
		System.out.println("s --> " + s);
		
		int a1 = 5;
//		a1++;
//		++a1;
    	System.out.println("a1 --> " + a1);
    	System.out.println("a1 --> " + a1++);
    	System.out.println("a1 --> " + ++a1);
		
    	int x = 2;
    	int y = 4;
    	int z = x++ + ++x - --y + y++ + ++x;
    	System.out.printf("x(%s) y(%s) z(%s)", x, y, z);
    	
    	boolean isEven = (y % 2 == 0);
    	System.out.println("\n" + !isEven);
    	
    	boolean isValid1 = (x++ > 8 || y-- > 2);
    	System.out.printf("isVaild1(%s) x(%s) y(%s)", isValid1, x, y);
    	
		
	}

}
